
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class BinarySearchTree {

    Node root;

    public BinarySearchTree(Node p) {
        root = p;
    }

    public void visit(Node p) {
        System.out.print(p.info + " ");
    }

    public Node search(char x) {
        return search(root, x);
    }

    public Node search(Node p, char x) {
        if (p == null) {
            return null;
        }

        if (p.info == x) {
            return p;
        } else if (x < p.info) {
            return search(p.left, x);
        } else {
            return search(p.right, x);
        }
    }

    public void insert(char x) {
        Node newNode = new Node(x);
        if (root == null) {
            root = newNode;
            return;
        }
        Node f, p;
        f = null;
        p = root;
        while (p != null) {
            if (p.info == x) {
                System.out.println(" The key " + x + " already exists, no insertion");
                return;
            }
            f = p;
            if (x < p.info) {
                p = p.left;
            } else {
                p = p.right;
            }
        }
        if (x < f.info) {
            f.left = newNode;
        } else {
            f.right = newNode;
        }
    }

    public void delete(char x) {
        delete(root, x);
    }

    public void delete(Node p, char x) {

    }

    public void preOrder() {
        preOrder(root);
    }

    public void preOrder(Node p) {
        // p - left - right
        if (p == null) {
            return;
        }
        visit(p);
        preOrder(p.left);
        preOrder(p.right);
    }

    public void postOrder() {
        postOrder(root);
    }

    public void postOrder(Node p) {
        // left - right - p
        if (p == null) {
            return;
        }
        postOrder(p.left);
        postOrder(p.right);
        visit(p);
    }

    public void inOrder() {
        inOrder(root);
    }

    public void inOrder(Node p) {
        // left - p - right 
        if (p == null) {
            return;
        }
        inOrder(p.left);
        visit(p);
        inOrder(p.right);
    }

    void breadth() {
        if (root == null) {
            return;
        }
        MyQueue q = new MyQueue();
        q.enqueue(root);
        Node p;
        while (!q.isEmpty()) {
            p = (Node) q.dequeue();
            if (p.left != null) {
                q.enqueue(p.left);
            }
            if (p.right != null) {
                q.enqueue(p.right);
            }
            visit(p);
        }
    }

    public void printTree() {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }

        List<StringBuilder> lines = new ArrayList<>();
        List<List<Node>> levels = new ArrayList<>();
        List<Node> currentLevel = new ArrayList<>();
        currentLevel.add(root);

        int height = getHeight(root);
        int maxWidth = (int) Math.pow(2, height - 1);

        // Thu thập tất cả các level
        while (!currentLevel.isEmpty()) {
            levels.add(new ArrayList<>(currentLevel));
            List<Node> nextLevel = new ArrayList<>();
            for (Node node : currentLevel) {
                if (node != null) {
                    nextLevel.add(node.left);
                    nextLevel.add(node.right);
                }
            }
            currentLevel = nextLevel;
            boolean hasNode = false;
            for (Node n : currentLevel) {
                if (n != null) {
                    hasNode = true;
                    break;
                }
            }
            if (!hasNode) {
                break;
            }
        }

        // Vẽ từng level
        for (int levelIdx = 0; levelIdx < levels.size(); levelIdx++) {
            List<Node> level = levels.get(levelIdx);
            int levelSize = (int) Math.pow(2, levelIdx);
            int spacing = maxWidth * 2 / levelSize;
            int offset = spacing / 2;

            // Dòng hiển thị node
            StringBuilder nodeLine = new StringBuilder();
            for (int i = 0; i < maxWidth * 3; i++) {
                nodeLine.append(" ");
            }

            for (int i = 0; i < level.size(); i++) {
                Node node = level.get(i);
                int pos = offset + i * spacing;
                if (node != null) {
                    nodeLine.setCharAt(pos, node.info);
                }
            }
            lines.add(nodeLine);

            // Dòng hiển thị đường nối
            if (levelIdx < levels.size() - 1) {
                StringBuilder verticalLine = new StringBuilder();
                StringBuilder horizontalLine = new StringBuilder();

                for (int i = 0; i < maxWidth * 3; i++) {
                    verticalLine.append(" ");
                    horizontalLine.append(" ");
                }

                for (int i = 0; i < level.size(); i++) {
                    Node node = level.get(i);
                    if (node != null && (node.left != null || node.right != null)) {
                        int pos = offset + i * spacing;
                        verticalLine.setCharAt(pos, '|');

                        int nextSpacing = spacing / 2;
                        int leftPos = pos - nextSpacing;
                        int rightPos = pos + nextSpacing;

                        // Vẽ đường ngang
                        if (node.left != null || node.right != null) {
                            for (int j = leftPos; j <= rightPos; j++) {
                                if (j == leftPos && node.left != null) {
                                    horizontalLine.setCharAt(j, '┌');
                                } else if (j == rightPos && node.right != null) {
                                    horizontalLine.setCharAt(j, '┐');
                                } else if (j > leftPos && j < rightPos) {
                                    horizontalLine.setCharAt(j, '─');
                                }
                            }

                            if (node.left != null && node.right != null) {
                                horizontalLine.setCharAt(pos, '┴');
                            } else if (node.left != null) {
                                horizontalLine.setCharAt(pos, '┘');
                            } else if (node.right != null) {
                                horizontalLine.setCharAt(pos, '└');
                            }
                        }
                    }
                }

                lines.add(verticalLine);
                lines.add(horizontalLine);
            }
        }

        // In ra kết quả
        for (StringBuilder line : lines) {
            System.out.println(line.toString());
        }
    }

    private int getHeight(Node p) {
        if (p == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(p.left), getHeight(p.right));
    }
}

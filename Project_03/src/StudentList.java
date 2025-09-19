/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Lớp quản lý danh sách sinh viên sử dụng doubly linked list
 * @author tungi
 */
public class StudentList {
    private Node firstNode, lastNode;
    private int totalStudents = 0;
    
    public StudentList() {
        firstNode = null;
        lastNode = null;
        totalStudents = 0;
    }
    
    public boolean isEmptyList() {
        return firstNode == null && lastNode == null;
    }
    
    public void addStudentToEnd(Student student) {
        Node newNode = new Node(student);
        if (isEmptyList()) {
            firstNode = newNode;
            lastNode = newNode;
        } else {
            lastNode.setNext(newNode);
            newNode.setPrev(lastNode);
            lastNode = newNode;
        }
        totalStudents++;
    }
    
    public void addStudentToBeginning(Student student) {
        Node newNode = new Node(student);
        if (isEmptyList()) {
            firstNode = newNode;
            lastNode = newNode;
        } else {
            newNode.setNext(firstNode);
            firstNode.setPrev(newNode);
            firstNode = newNode;
        }
        totalStudents++;
    }
    
    public void removeFirstStudent() {
        if (isEmptyList()) {
            return; // Danh sách rỗng
        }
        firstNode = firstNode.getNext();
        totalStudents--;
        if (firstNode == null) {
            // Nếu sau khi xóa không còn phần tử nào
            lastNode = null;
        } else {
            firstNode.setPrev(null);
        }
    }
    
    public void removeLastStudent() {
        if (isEmptyList()) {
            return;
        }
        if (firstNode == lastNode) {
            // Chỉ có 1 phần tử
            firstNode = null;
            lastNode = null;
        } else {
            lastNode = lastNode.getPrev();
            lastNode.setNext(null);
        }
        totalStudents--;
    }
    
    public void removeStudentAtPosition(int position) {
        if (position < 0 || position >= totalStudents) {
            return;
        }
        if (position == 0) {
            removeFirstStudent();
        } else if (position == totalStudents - 1) {
            removeLastStudent();
        } else {
            Node nodeToDelete = firstNode;
            for (int i = 0; i < position; i++) {
                nodeToDelete = nodeToDelete.getNext();
            }
            Node previousNode = nodeToDelete.getPrev();
            Node nextNode = nodeToDelete.getNext();
            previousNode.setNext(nextNode);
            nextNode.setPrev(previousNode);
            totalStudents--;
        }
    }
    
    public void displayStudentsFromBeginning() {
        Node currentNode = firstNode;
        while (currentNode != null) {
            System.out.println(currentNode.getInfo());
            currentNode = currentNode.getNext();
        }
    }
    
    public void displayStudentsFromEnd() {
        Node currentNode = lastNode;
        while (currentNode != null) {
            System.out.println(currentNode.getInfo());
            currentNode = currentNode.getPrev();
        }
    }
    
    public int getTotalStudentCount() {
        return this.totalStudents;
    }
    
    public int findStudentPositionById(String studentId) {
        // Trả về vị trí của sinh viên có studentId
        // Nếu không tìm thấy trả về -1
        Node currentNode = firstNode;
        int currentPosition = 0;
        while (currentNode != null) {
            Student currentStudent = (Student) currentNode.getInfo();
            if (currentStudent.getId().equals(studentId)) {
                return currentPosition;
            }
            currentNode = currentNode.getNext();
            currentPosition++;
        }
        return -1;
    }
    
    public void insertStudentAtPosition(Student student, int position) {
        // Thêm sinh viên vào vị trí chỉ định
        if (position < 0 || position > totalStudents) {
            return; // Vị trí không hợp lệ
        }
        
        if (position == 0) {
            addStudentToBeginning(student);
        } else if (position == totalStudents) {
            addStudentToEnd(student);
        } else {
            Node newNode = new Node(student);
            Node currentNode = firstNode;
            
            // Duyệt đến vị trí cần chèn
            for (int i = 0; i < position; i++) {
                currentNode = currentNode.getNext();
            }
            
            // Chèn newNode trước currentNode
            Node previousNode = currentNode.getPrev();
            newNode.setNext(currentNode);
            newNode.setPrev(previousNode);
            currentNode.setPrev(newNode);
            previousNode.setNext(newNode);
            
            totalStudents++;
        }
    }
    
    public int countStudentsWithMinimumGpa(double minimumGpa) {
        // Đếm số lượng sinh viên có GPA >= giá trị tối thiểu
        int passedStudentCount = 0;
        Node currentNode = firstNode;
        while (currentNode != null) {
            Student currentStudent = (Student) currentNode.getInfo();
            if (currentStudent.getGpa() >= minimumGpa) {
                passedStudentCount++;
            }
            currentNode = currentNode.getNext();
        }
        return passedStudentCount;
    }
    
    public int countStudentsWithNameContaining(String nameKeyword) {
        // Trả về số lượng sinh viên có tên chứa từ khóa
        // Sử dụng indexOf để tìm kiếm
        int matchingStudentCount = 0;
        Node currentNode = firstNode;
        while (currentNode != null) {
            Student currentStudent = (Student) currentNode.getInfo();
            // Sử dụng indexOf để kiểm tra xem tên có chứa từ khóa không
            if (currentStudent.getFullName().indexOf(nameKeyword) != -1) {
                matchingStudentCount++;
            }
            currentNode = currentNode.getNext();
        }
        return matchingStudentCount;
    }
}
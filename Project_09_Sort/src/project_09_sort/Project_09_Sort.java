/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project_09_sort;

import java.util.Random;

/**
 *
 * @author tungi
 */
public class Project_09_Sort {

    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(1000000); // giá trị ngẫu nhiên từ 0 đến 999,999
        }
        return arr;
    }

    public static void measureSortTime(int[] arr, Runnable sortAlgorithm, String name) {
        long start = System.nanoTime();
        sortAlgorithm.run();
        long end = System.nanoTime();
        double elapsedMs = (end - start) / 1000000;
        System.out.println(name + " time: " + elapsedMs + " ms");
    }

    public static void main(String[] args) {
        int size = 1000000;
        int[] original = generateRandomArray(size);

        int[] arr1 = original.clone();
        int[] arr2 = original.clone();
        int[] arr3 = original.clone();
        int[] arr4 = original.clone();
        int[] arr5 = original.clone();

        measureSortTime(arr4, new Runnable() {
            public void run() {
                quickSort(arr4, 0, arr4.length - 1);
            }
        }, "Quick Sort");

        measureSortTime(arr5, new Runnable() {
            public void run() {
                mergeSort(arr5, 0, arr5.length - 1);
            }
        }, "Merge Sort");

        measureSortTime(arr1, new Runnable() {
            public void run() {
                selectionSort(arr1);
            }
        }, "Selection Sort");

        measureSortTime(arr2, new Runnable() {
            public void run() {
                insertionSort(arr2);
            }
        }, "Insertion Sort");

        measureSortTime(arr3, new Runnable() {
            public void run() {
                bubbleSort(arr3);
            }
        }, "Bubble Sort");

    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Hoán đổi
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Dịch chuyển các phần tử lớn hơn key sang phải
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break; // nếu không có hoán đổi nào, dừng sớm
            }
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        while (i < n1) {
            arr[k++] = L[i++];
        }
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

}

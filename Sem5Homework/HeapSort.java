// // Реализовать алгоритм пирамидальной сортировки (HeapSort).
// package Sem5Homework;

// public class HeapSort {
// public static void main(String[] args) {
// int array[] = { 10, 12, 11, 13, 6, 8, 5 };

// HeapSort ob = new HeapSort();
// ob.Sort(array);

// PrintArray(array);

// }

// private static void Sort(int array[]) {
// int len = array.length;
// for (int i = len / 2 - 1; i >= 0; i--) {
// Heapify(array, len, i);
// }
// for (int i = len - 1; i >= 0; i--) {
// int temp = array[0];
// array[0] = array[i];
// array[i] = temp;

// Heapify(array, i, 0);
// }

// }

// private static void Heapify(int array[], int len, int i) {
// int max = i;
// int left = 2 * i + 1;
// int right = 2 * i + 2;

// if (left < len && array[left] > array[max]) {
// max = left;
// }

// if (right < len && array[right] > array[max]) {
// max = right;
// }

// if (max != i) {
// int buff = array[i];
// array[i] = array[max];
// array[max] = buff;

// Heapify(array, len, max);
// }
// }

// static void PrintArray(int arr[]) {
// int n = arr.length;
// for (int i = 0; i < n; ++i)
// System.out.print(arr[i] + " ");
// System.out.println();
// }
// }

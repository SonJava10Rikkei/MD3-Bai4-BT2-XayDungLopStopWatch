package rikkei.academy;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 100000;
        int[] arr = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(n);
        }
        StopWatch watch = new StopWatch();
        selectionSort(arr);
        watch.stop();
        System.out.println("Thời gian trôi qua: " + watch.getElapsedTime() + " milliseconds.");
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
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

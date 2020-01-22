import java.util.Scanner;

public class test {
    int size;
    int[] arr;

    public int[] bubbleSort(int[] arr) {
        for (int i = 0; i < this.size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public void bubble_recursive(int[] arr, int size) {
        if (size == 1) {
            return;
        }

        for (int i = 0; i < size - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        bubble_recursive(arr, size - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        test t = new test();
        t.size = sc.nextInt();
        t.arr = new int[t.size];
        for (int i = 0; i < t.size; i++) {
            t.arr[i] = sc.nextInt();
        }
        sc.close();
        t.bubble_recursive(t.arr, t.size);
        System.out.println();
        for (int i = 0; i < t.size; i++) {
            System.out.print(t.arr[i]);
            System.out.print(",");
        }
    }
}
import java.util.Scanner;

public class test {
    int size;
    int[] arr = new int[size];

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        test t = new test();
        t.size = sc.nextInt();
        for (int i = 0; i < t.size; i++) {
            t.arr[i] = sc.nextInt();
        }
        sc.close();
        t.arr = t.bubbleSort(t.arr);
        for (int i = 0; i < t.size; i++) {
            System.out.println(t.arr[i]);
        }
    }
}
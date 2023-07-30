import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] positiveArr = new int[n];
        int[] negativeArr = new int[n];
        int positiveIdx = 0;
        int negativeIdx = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                positiveArr[positiveIdx] = arr[i];
                positiveIdx++;
            } else {
                negativeArr[negativeIdx] = arr[i];
                negativeIdx++;
            }
        }

        // Print positive numbers
        for (int i = 0; i < positiveIdx; i++) {
            System.out.print(positiveArr[i] + " ");
        }

        // Print negative numbers
        for (int i = 0; i < negativeIdx; i++) {
            System.out.print(negativeArr[i] + " ");
        }
    }
}

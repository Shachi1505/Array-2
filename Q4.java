import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter desired sum s");
        int s = sc.nextInt();

        int i = 0;
        int j = 0;
        int sum = 0;
        while (j < n) {
            sum += arr[j];
            if (sum > s) {
                while (sum > s && i < j) {
                    sum -= arr[j];
                    i++;
                }
            }
            if (sum == s) {
                System.out.println(i + " " + j);
                break;
            }
            j++;
        }

    }
}

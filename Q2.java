import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of arrays: ");
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        
        System.out.println("Enter elements of array a[]:");
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        
        System.out.println("Enter elements of array b[]:");
        for (int i = 0; i < m; i++) {
            b[i] = scn.nextInt();
        }
        
        boolean check;
        for (int i = 0; i < m; i++) {
            check = false;
            for (int j = 0; j < n; j++) {
                if (b[i] == a[j]) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println(b[i]);
            }
        }
    }
}

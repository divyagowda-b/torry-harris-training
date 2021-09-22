import java.util.Scanner;
public class mat {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int i, j;
        System.out.println("enter matrix elements: \t");
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("principal diagonal elements");
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                if (i == j) {
                    System.out.print(a[i][j] + "");
                }
            }
        }
        System.out.println("/n");
        System.out.println("secondary diagonal elements");
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                if ((i + j) == (a.length - 1)) {
                    System.out.print(a[i][j] + "");
                }

            }
        }
    }
}
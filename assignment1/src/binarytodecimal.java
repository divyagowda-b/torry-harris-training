import java.util.Scanner;

public class binarytodecimal {
    public static int getDecimal(int num) {
        int decimal = 0;
        int p = 0;
        while (true) {
            if (num == 0) {
                break;
            } else {
                int temp = num % 10;
                decimal += temp * Math.pow(2, p);
                num = num / 10;
                p++;
            }

        }
        return decimal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a binary number:");
        int num = sc.nextInt();
        System.out.println("decimal number is :" +getDecimal(num));
    }
}



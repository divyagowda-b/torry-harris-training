import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,fact=1,num;
        System.out.println("enter a number:");
        num = sc.nextInt();
        for(i=1;i<=num;i++)
        {
            fact = fact*i;

        }
        System.out.println("factorial of"  +num+  "is:" +fact);


    }
}

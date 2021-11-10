import java.util.Scanner;

public class fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter positive number:");
        int num = sc.nextInt();
        int n1 =0,n2=1,n3=0;
        while(n3<num)
        {
            n3 = n1+n2;
            n1=n2;
            n2=n3;

        }
        if(n3 == num)
        {
            System.out.println("number is fibonacci");
        }
        else
        {
            System.out.println("number is not fibonacci");
        }
    }

}

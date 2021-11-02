import java.util.Scanner;
public class defvalue {
    public static void main(String[] args) {
        int n = 0;
        float f;
        double d;
        String c;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        c=sc.next();
        f=sc.nextFloat();
        d=sc.nextDouble();
        System.out.println("entered num:"+n);
        System.out.println("entered string:"+c);
        System.out.println("entered num:"+f);
        System.out.println("entered num:"+d);
    }
}

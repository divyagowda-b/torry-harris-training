import java.util.Scanner;

public class xpowern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers::\n");
        int x = sc.nextInt();
        int n = sc.nextInt();
        int r=1,i=1;
        while(i<=n){
            r*=x;
            i++;

        }
        System.out.println("result::" +x+"^"+n+"="+r+"\n");
    }
}

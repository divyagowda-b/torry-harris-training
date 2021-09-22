import java.util.Scanner;

public class namen{
    public static void main(String[] args) {
        int n;
        String username;
        Scanner Scanner = new Scanner(System.in);
        n = Scanner.nextInt();
        username = Scanner.nextLine();
        for(int i=1;i<n;i++) {
            System.out.println(username);
        }
    }
}

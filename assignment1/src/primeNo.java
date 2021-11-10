import java.util.Scanner;

public class primeNo {
    public static void main(String[] args) {
        int count,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter starting number:");
        int start=sc.nextInt();
        System.out.println("enter ending number:");
        int end = sc.nextInt();



        for(int i = start;i <= end;i++) {
            count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && i != 1) {
                sum = sum + i;


                System.out.print("prime numbers are:" +i + "\n");
            }
        }


        System.out.println("\n the sum of prime numbers are" +sum);
        }

        }



   // }


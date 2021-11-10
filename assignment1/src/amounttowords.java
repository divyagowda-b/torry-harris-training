import java.util.Scanner;

public class amounttowords {
    public void atw(int n, String ch) {


        String one[] = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String two[] = {"", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String three[] = {"", "thousand", "lakh", "crore"};

        if (n > 19) {
            System.out.print(two[n / 10] + "" + one[n % 10]);
        } else {
            System.out.print(one[n]);
            if (n > 0) {
                System.out.print(ch);
            }

        }
    }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number:");
            int n = sc.nextInt();
            if(n<=0){
                System.out.println("enter numbers greater than 0");
            }
            else{
                amounttowords a = new amounttowords();
                a.atw((n/1000000000),"billion");
                a.atw((n/10000000)%100,"crore");
                a.atw((n/10000)%100,"lakh");
                a.atw((n/1000)%100,"thousand");
                a.atw((n/100)%100,"hundred");
                a.atw((n%100),"");
            }
        }
    }

import java.util.Scanner;

public class numberstowords {
    static void printvalue(char digit){

        switch(digit)
        {

            case '0':
                System.out.println("zero");
                break;
            case '1':
                System.out.println("one");
                break;
            case '2':
                System.out.println("two");
                break;
            case '3':
                System.out.println("three");
                break;
            case '4':
                System.out.println("four");
                break;
            case '5':
                System.out.println("five");
                break;
            case '6':
                System.out.println("six");
                break;
            case '7':
                System.out.println("seven");
                break;
            case '8':
                System.out.println("eight");
                break;
            case '9':
                System.out.println("nine");
                break;
        }
    }
    static void printword(String N){
        int i,length = N.length();
        for(i=0;i<length;i++){
            printvalue(N.charAt(i));
        }
    }

    public static void main(String[] args) {
       String N = "1234";
       printword(N);

    }
}


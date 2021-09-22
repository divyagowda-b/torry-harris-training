

public class aavgg {
    public static void main(String[] args) {
        int i;
        float sum;
        double avg=0.0,mid=0;
        int[] a = new int[] {2,3,4,5,6};
        sum = 0;
        for (i = 0; i < a.length; i++) {
            sum = sum + a[i];
            avg = sum /a.length;
            mid = a.length/2;
        }
        System.out.println("avg is" + avg);
        System.out.println("mid value is" + mid);
    }
}


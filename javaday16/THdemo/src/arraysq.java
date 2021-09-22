public class arraysq {
    public static void main(String[] args) {
        int []array=new int[5];
        int square=0;
        array[0]=2;
        array[1]=4;
        array[2]=6;
        array[3]=7;
        array[4]=8;
        for(int i=0;i<array.length;i++){
            square=array[i]*array[i];
            System.out.println(square);
        }


    }
}

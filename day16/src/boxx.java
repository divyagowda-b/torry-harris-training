public class boxx {
    private int length;
    private int width;
    private int height;
    public void initialize(int l,int w,int h){
        length = l;
        width = w;
        height = h;
    }
    public void display(){
        System.out.println("length is"+length);
        System.out.println("width is"+width);
        System.out.println("height is"+height);
    }
    public int getvolume(){
        return length*width*height;
    }

}

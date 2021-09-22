public class boxx {

    private int length;
    private int width;
    private int height;
    public boxx(){
        System.out.println("inside bos constructor");
    }
    public void initialize(int l,int w,int h){
        length = l;
        width = w;
        height = h;
    }

    public boxx(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }


    public void display(){
        System.out.println("length is"+length);
        System.out.println("width is"+width);
        System.out.println("height is"+height);
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getvolume(){

        return length*width*height;
    }


    public void setlength(int l) {
        this.length=l;
    }
    public void setwidth(int w) {
        this.width=w;
    }
    public void setheight(int h) {
        this.height=h;
    }

    public int getwidth() {
        return width;
    }
    public int getlength() {
        return length;
    }
    public int getheight() {
        return height;
    }


}
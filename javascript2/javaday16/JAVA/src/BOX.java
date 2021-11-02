public class BOX {
        private int length;
        private int width;
        private int height;
        public void initialize(int l,int w,int h){
            length=l;
            width=w;
            height=h;

    }
    public void display(){
        System.out.println("length ="+length);
        System.out.println("width ="+width);
        System.out.println("height ="+height);
    }
    public int getvolume(){
            return length*width*height;
    }
    public int getwidth(){
            return width;
    }
    public int getlength(){
        return length;
    }
    public int getheight() {
        return height;
    }
}

public class laptop {

    private int RAM;
    private int HDD;
    private String processor;
    private Double screensize;
    public void initialize(int R,int H,String P,Double s) {
        RAM = R;
        HDD = H;
        processor = P;
        screensize = s;
    }
    public void display(){
        System.out.println("RAM is"+RAM +""+"GB");
        System.out.println("HDD is"+HDD +""+"GB");
        System.out.println("processor is"+processor);
        System.out.println("screensize is"+screensize);

    }
    public int getRAM() {
        return RAM;
    }
    public int getHDD() {
        return HDD;
    }
    public String getprocessor() {
        return processor;
    }
    public Double getscreensize() {
        return screensize;
    }




    }


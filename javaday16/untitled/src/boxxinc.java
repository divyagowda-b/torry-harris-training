public class boxxinc {
    public static void main(String[] args) {
        boxx b1 = new boxx(100,50,200);
        b1.setlength((110*b1.getlength())/100);
        b1.setwidth((108*b1.getwidth())/100);
        b1.setheight((120*b1.getheight())/100);
        b1.display();
        System.out.println("vol:"+b1.getvolume());



    }
}

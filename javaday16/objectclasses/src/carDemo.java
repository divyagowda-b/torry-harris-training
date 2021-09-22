public class carDemo {
    public static void main(String[] args) {
        Tyre mrf = new Tyre("mrf",16);
        car nexon = new car("Nexon","petrol",1500,93.4f,6,mrf);
        music sony = new music("sony",3,true,20);
        nexon.setmusic(sony);
        nexon.displayfeatures();
        nexon.accelerate();
        nexon.changegear(2);
        nexon.changegear(4);
        nexon.applybrake();
        car audi = new car("Audi","diesel",1400,93.4f,6,mrf);
        audi.displayfeatures();
        audi.accelerate();
        audi.changegear(4);
        audi.changegear(1);
        audi.applybrake();
    }
}

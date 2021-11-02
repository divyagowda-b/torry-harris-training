import java.util.Scanner;
public class car {
    private String name;
    private String fuelType;
    private int engineCapacity;
    private float power;
    private int noOfGears;
    private Tyre tyre;
    private music Music;
     public car(){

     }

    public music getMusic() {
        return Music;
    }

    public String getName() {
        return name;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public float getPower() {
        return power;
    }

    public int getNoOfGears() {
        return noOfGears;
    }

    public car(String name, String fuelType, int engineCapacity, float power, int noOfGears,Tyre tyre) {
        this.name = name;
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
        this.power = power;
        this.noOfGears = noOfGears;
        this.tyre = tyre;

    }

    public void accelerate()
    {
        System.out.println(name+"car is accelerating...");

    }
    public void applybrake(){
        System.out.println(name+"car is slowing");

    }
    public void changegear(int gear){
         if(gear<0 || gear>noOfGears)
             System.out.println("wrong gear selected");
         else
        System.out.println(name+"car is changing gear to"+gear);
    }
    public void displayfeatures(){
        System.out.println("features of "+name+"car:");
        System.out.println("-------------------");
        System.out.println("engine capacity:"+engineCapacity+"CC");
        System.out.println("fuel type:"+fuelType);
        System.out.println("power:"+power+"BH");
        System.out.println("tyre-> name"+tyre.getTyrename()+"/ntyre->size"+tyre.getSize());
        System.out.println("music system name :"+music.getname());
        System.out.println("soundwoofer :"+music.issoundwoofer);
        System.out.println("lcdScreenSize:"+music.getLcdScreenSize());
        System.out.println("noOfSpeakers:"+music.getNoOfSpeakers());

        System.out.println();
    }

    public void setmusic(music sony) {
    }
}



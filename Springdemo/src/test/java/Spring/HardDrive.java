package Spring;

import org.springframework.stereotype.Component;

@Component
public class HardDrive {

    public HardDrive(){

    }
    public void config(){
        System.out.println("Hard disk : \ntype - magnetic \nsize - 1TB");
    }
}

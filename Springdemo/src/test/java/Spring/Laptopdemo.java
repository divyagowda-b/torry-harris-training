package Spring;

import Spring2.MotherBoard;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class laptopdemo {
    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(LaptopConfig.class);

        HardDrive segate =  factory.getBean(HardDrive.class);
        segate.config();

        RAM ram = (RAM) factory.getBean("RAM");
        ram.display();

        MotherBoard mb =  factory.getBean(MotherBoard.class);
        mb.display();

    }
}

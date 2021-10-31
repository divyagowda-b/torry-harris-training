import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class cardemo {
    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(CarConfig.class);

        car car  = factory.getBean(car.class);
        car.config();

        Tyre tyre  = factory.getBean(Tyre.class);
        tyre.display();

        Engine engine  = factory.getBean(Engine.class);
        engine.display();
    }
}

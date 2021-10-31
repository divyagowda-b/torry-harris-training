package Spring2;

import org.springframework.stereotype.Component;

@Component
public class AmdProcessor implements Processor{
    @Override
    public void process() {
        System.out.println("Amd processor : i7.11th gen, 3GHz");
    }
}

package Spring2;

import org.springframework.stereotype.Component;

@Component
public class IntelProcessor implements Processor {

    @Override
    public void process() {
        System.out.println("intel : i5, octa core ,3ghz");
    }
}

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

public class TestSuite {

    @RunWith(Suite.class)

    @Suite.SuiteClasses({
            calculatortest.class,
            changeStringcasetest.class

    })
   public class TestSuit{

    }
}

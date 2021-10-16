import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class changeStringcasetest extends TestCase {
    changeStringcasetest stringCase = new changeStringcasetest();

    @Before
    public void setUp() throws Exception {
        System.out.println("before test case");
        stringCase = new changeStringcasetest();

    }

    @After
    public void tearDown() throws Exception {
        System.out.println("end of  test case");
    }


}

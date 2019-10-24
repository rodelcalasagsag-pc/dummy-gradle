package au.com.petcircle.rodel.pkg1;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Dummy1 {

    @Test
    public void test1() {
        Assert.assertTrue(Boolean.TRUE, "FORCED FAILURE");
    }
}

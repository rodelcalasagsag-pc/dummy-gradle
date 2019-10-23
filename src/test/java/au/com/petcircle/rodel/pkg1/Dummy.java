package au.com.petcircle.rodel.pkg1;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class Dummy {

    @Test()
    public void test1() {
        final int base = 1 + new Random().nextInt(4);
        final int rand = new Random().nextInt(10);
        Assert.assertEquals(rand % base, 0, String.format("%d should be divisible by %d!", rand, base));
    }
}

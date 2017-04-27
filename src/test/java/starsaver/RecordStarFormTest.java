package starsaver;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by William on 26/04/2017.
 */
public class RecordStarFormTest {
    @Test
    public void exists() throws Exception {
        boolean ans = true;
        boolean val;
        String id = "17";
        RecordStarForm starForm = new RecordStarForm();

        val = starForm.exists(id);
        //Assert.assertFalse(ans);
       // Assert.assertTrue(ans);
    Assert.assertEquals(ans,val);
    }

    @Test
    public void findBrightness() throws Exception {

        RecordStarForm starForm = new RecordStarForm();
        double x = 10;
        double y = 11;
        double expResult = 17;
        double result = starForm.findBrightness(x,y);
        //assertEquals(expResult, result);
        Assert.assertEquals(17, result, 17);
    }

    @Test
    public void main() throws Exception {

    }

}
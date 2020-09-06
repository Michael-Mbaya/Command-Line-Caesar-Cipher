import org.junit.Assert;
import org.junit.Test;

public class TextAndShiftTest {

    @Test
    public void textAndShift_instanceOf_object(){
        TextAndShift textAndShift = new TextAndShift();
        Assert.assertTrue(textAndShift instanceof Object);
    }

}

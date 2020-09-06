import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void app_instanceOf_object(){
        App app = new App();
        Assert.assertTrue(app instanceof Object);
    }

}
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EncodeTest {
    @Test
    public void isEncode_encryptData_true(){
        assertEquals( "cd", Encode.getDataProperties("ab",2));
    }
    @Test
    public void encode_instanceOf_object(){
        Encode encode = new Encode();
        Assert.assertTrue(encode instanceof Object);
    }
}

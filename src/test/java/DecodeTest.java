import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DecodeTest {
    @Test
    public void isDecode_decryptData_true(){
        Decode decode = new Decode();
        assertEquals("yz",decode.getData("ab",2));
    }
    @Test
    public void decode_instanceOf_object(){
        Decode decode = new Decode();
        Assert.assertTrue(decode instanceof Object);
    }
}

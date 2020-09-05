import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DecodeTest {
    @Test
    public void isDecode_decryptData_true(){
        Decode decode = new Decode();
        assertEquals("yz",decode.getDataProperties("ab",2));
    }
}

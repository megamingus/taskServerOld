package daoo.encoder;


/**
 * Created with IntelliJ IDEA.
 * User: keevstessens
 * Date: 17/05/13
 * Time: 17:57
 * To change this template use File | Settings | File Templates.
 */

public class InverseEncoderTest extends EncoderTest<InvertEncoder> {

    private static final InvertEncoder encoder = new InvertEncoder();

    public void testEncode(){
        String s2 = encoder.encode("Mingus RoxZ");
        assertEquals(s2, ("ZxoR sugniM"));
    }

    public void testDecode() {
        String s2 = encoder.decode("OtaG");
        assertEquals(s2, ("GatO"));
    }


   public void testEncodeDecode() {
        String s = "OtaG";
        String s2 = encoder.decode(s);
        assertTrue(s2.equals("OtaG"));
    }


}

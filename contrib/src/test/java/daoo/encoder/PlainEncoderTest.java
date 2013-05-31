package daoo.encoder;

/**
 * Created with IntelliJ IDEA.
 * User: laura
 * Date: 24/05/13
 * Time: 11:38
 * To change this template use File | Settings | File Templates.
 */
public class PlainEncoderTest extends EncoderTest<PlainEncoder>{

    private static final PlainEncoder encoder = new PlainEncoder();

    @Override
    public void testEncode() {
        String encodedMessage = encoder.encode("HoLa");
        assertEquals(encodedMessage, "HoLa");
    }

    @Override
    public void testDecode() {
        String decodedMessage = encoder.decode("HoLa");
        assertEquals(decodedMessage, "HoLa");
    }

    @Override
    public void testEncodeDecode() {
        String encodeDecodeMessage = encoder.decode(encoder.encode("HoLa"));
        assertEquals(encodeDecodeMessage, "HoLa");
    }
}

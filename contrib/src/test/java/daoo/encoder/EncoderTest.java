package daoo.encoder;



import daoo.ioc.MessageEncoder;
import junit.framework.TestCase;

/**
 * Created with IntelliJ IDEA.
 * User: laura
 * Date: 24/05/13
 * Time: 11:11
 * To change this template use File | Settings | File Templates.
 */
public abstract class EncoderTest<T extends MessageEncoder> extends TestCase {

    public abstract void testEncode();

    public abstract void testDecode();

    public abstract void testEncodeDecode();

}

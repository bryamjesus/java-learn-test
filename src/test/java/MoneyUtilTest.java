import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class MoneyUtilTest
{
    @Test
    public void formatTest()
    {
        String money = MoneyUtil.format(1000);
        Assert.assertEquals("$1000.00", money);
    }

    @Test
    public void negativeFormatTest()
    {
        String money = MoneyUtil.format(-1000);
        Assert.assertEquals("-$1000.00", money);
    }

    @Test
    public void euroFormatTest()
    {
        String money = MoneyUtil.format(-1000, "€");
        Assert.assertEquals("-€1000.00", money);
    }
}
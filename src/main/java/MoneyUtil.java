import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MoneyUtil
{
    public static String format(double money)
    {
        return format(money, "$");
    }

    public static String format(double money, String symbol)
    {
        if (money < 0)
        {
            money = money * (-1);
            symbol = "-" + symbol;
        }

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return symbol + decimalFormat.format(money);
    }
}

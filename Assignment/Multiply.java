
package demoadapterprogram;
import java.math.BigDecimal;


public class Multiply implements MultiplierInterface
{ 
    BigDecimal n1 = new BigDecimal(8);
    BigDecimal n2 = new BigDecimal(4);
    @Override
    public BigDecimal multiply(BigDecimal n1, BigDecimal n2)
    {
        return n1.multiply(n2);
    }
}

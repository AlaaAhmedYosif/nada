
package demoadapterprogram;
import java.math.BigDecimal;
/**
 *
 * @author الاء
 */
public abstract class Devide implements DividerInterface
{
     BigDecimal n1 = new BigDecimal(10);
    BigDecimal n2 = new BigDecimal(5);
    
     @Override
    public BigDecimal devide(BigDecimal n1, BigDecimal n2)
    {
        return n1.divide(n2);
    }
}


package factorymethod;
import java.util.Scanner;
/**
 *
 * @author الاء
 */
public class FactoryMethod {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Member");
        String str = input.nextLine();   
        GetFactory factory =new GetFactory();
        
        Staff s = factory.getStaff(str);
        s.getYearsOfWork();
        s.getSalary();
    }
    
}

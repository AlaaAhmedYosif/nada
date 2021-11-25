
package factorymethod;


public abstract class Doctor implements Staff 
{
     @Override
     public double getSalary()
    {
        return  8000;
    }
     @Override
    public int getYearsOfWork()
    {
        return 5;
    }
}

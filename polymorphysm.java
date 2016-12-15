// Overloading
class Overload
{
    void demo (int a)
    {
       System.out.println ("a: " + a);
    }
    void demo (int a, int b)
    {
       System.out.println ("a and b: " + a + "," + b);
    }
    double demo(double a) {
       System.out.println("double a: " + a);
       return a*a;
    }
}
class MethodOverloading
{
    public static void main (String args [])
    {
        Overload Obj = new Overload();
        double result;
        Obj .demo(10);
        Obj .demo(10, 20);
        result = Obj .demo(5.5);
        System.out.println("O/P : " + result);
    }
}

//Overriding

public class BaseClass
{
    public void methodToOverride() //Base class method
    {
         System.out.println ("I'm the method of BaseClass");
    }
}
public class DerivedClass extends BaseClass
{
    public void methodToOverride() //Derived Class method
    {
         System.out.println ("I'm the method of DerivedClass");
    }
}

public class TestMethod
{
     public static void main (String args []) {
        // BaseClass reference and object
        BaseClass obj1 = new BaseClass(); 
        // BaseClass reference but DerivedClass object
        BaseClass obj2 = new DerivedClass(); 
        // Calls the method from BaseClass class
        obj1.methodToOverride(); 
        //Calls the method from DerivedClass class
        obj2.methodToOverride(); 
     }
}
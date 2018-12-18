

public class HamburgerDriver
{
   public static void main()
   {
       //make one instance (object) of hte hamburger class
       Hamburger hamburger1 = new Hamburger();
       Hamburger hamburger2 = new Hamburger(true,3,"Cheese");
       //print the toString of the object
       System.out.println(hamburger1.toString() + "\n");
       System.out.println(hamburger2.toString());
       
    }
    
}

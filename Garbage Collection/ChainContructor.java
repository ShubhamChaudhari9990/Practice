/*java program to illustrate constuctor chaining 
 * within same class using this() keyword
 */

public class ChainContructor {
    ChainContructor()
    {
        this(5);
        System.out.println("The default constuctor");
    }
    ChainContructor(int a)
    {
        this(5,15);
        System.out.println(a);
    }
    ChainContructor(int a,int b)
    {
        System.out.println(a*b);
    }
    public static void main(String args[])
    {
        //new ChainContructor(2);
        new ChainContructor();
    }
}

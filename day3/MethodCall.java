public class MethodCall {
    private int x=1;
    static double pi;
    static{
        System.out.println("Static Block");
        pi=3.14;
    }
    public void m1()
    {
        System.out.println("method 1 Private value ="+x);
        System.out.println("method 1 Static value ="+MethodCall.pi);
        m2();   
    }
    static void m2()
    {
        MethodCall m1 = new MethodCall();
        System.out.println("method 2 Private value ="+m1.x);
        System.out.println("method 2 Static value ="+pi); 
        m1.m3();   
    }
    public void m3()
    {
        System.out.println("Method 3");
        System.out.println("method 3 Private value ="+x);
        System.out.println("method 3 Static value ="+MethodCall.pi);
    }
    public static void main(String[] args) {
        MethodCall m = new MethodCall();
        m.m1();   
    }
}

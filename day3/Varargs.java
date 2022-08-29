public class Varargs {
    public void add(int ...x)//variable arguments. AND ...(dots) is known as eclises.
    {
        int sum=0;
        for(int i:x)//enhanced for loop.
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Varargs va = new Varargs();
        va.add(2);
        va.add(2,3,4);
    }
}

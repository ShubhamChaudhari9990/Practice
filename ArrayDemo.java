public class ArrayDemo {
    public static void main(String[] args) {
        int a[]=new int[5];
        for(int i=1;i<5;i++)
        {
            a[i]=i;
            //System.out.println(a[i]);
        } 
        for(int i=0;i<a.length;i++)
        {
            System.out.println(""+a[i]);
        }
    }    
}

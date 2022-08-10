import java.util.*;
public class CheckChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//	char ch='a';
	char ch=sc.next().charAt(0);
        if((ch>=65 && ch<=91) || (ch>=97 && ch<=122))
        {
            System.out.println("character");
        }
        else
        {
            System.out.println("not character");
        }

    }
    
}

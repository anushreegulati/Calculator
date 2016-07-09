package calculate;
import java.util.*;

public class calc {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("MENU");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		int ch;
		double a,b,c=0;
		ch = s.nextInt();
		System.out.println("Enter nos.");
		a = s.nextDouble();
		b = s.nextDouble();
		switch(ch)
		{
		case 1:
			c = a+b;
			break;
		case 2:
			c = a-b;
			break;
		}
			
		System.out.println("Answer is: "+c);
	}

}

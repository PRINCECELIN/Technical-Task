package basic;

import java.security.interfaces.ECPublicKey;

class Super{
public void display()
{
	System.out.println("super");
}
}

class Sub extends Super 
{
	public void display() {
		System.out.println("Sub");
	}
}
public class Methodoverriding {
  public static void main(String[]srgs) { 
   
  Super obj=new Sub();
  obj.display();
}
}

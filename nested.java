package basic;

public class nested {
	public static void main(String[] args) {
		int age=21;
		if (age<30)
		{
			System.out.println("younger");
		}
		else
		    {
			System.out.println("old");
			if (age>50)
			    {
				System.out.println("older");
			    }
			else {
				System.out.println("dont worry you are not older" );
			}
		}
	}

}

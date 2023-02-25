package basic;

public class Duplicatecharacter{

	public static void main(String[] arg) {
	String str="prince celin";
	System.out.println(str);
	int count=0;
	char[]chars=str.toCharArray();
	System.out.println("duplicate character are");
	for(int i=0;i<str.length();i++) {
		for(int j=i+1;j<str.length();j++) {
			if(chars[i]==chars[j])
			{
				System.out.println(chars[j]);
			
			count++;
			
			}			
		}
	}	
}		
}	



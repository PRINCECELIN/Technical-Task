package basic;

public class reverse {
	public static void main(String[] args) {
		String str = "java";
		char[] charArray = str.toCharArray();
		 StringBuilder sb= new StringBuilder();
		 for(int i=charArray.length-1;i>=0;i--)
		 {
			 sb.append(charArray[i]);
		 }
		 System.out.println("reversed string:"+sb.toString());
	}
				
		
	}



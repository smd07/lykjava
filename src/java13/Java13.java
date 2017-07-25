package java13;

public class Java13 {
	
	public static void main(String[] args) {
		
		
		
		
		System.out.println(toUpperCase("kelime"));
		System.out.println(reverseString("kelime"));
		System.out.println(IsPolindrom("ey edip adanada pide ye"));
		
	}
	
	
	
	public static String toUpperCase(String kelime) {
		String yeni="";
		for (int i = 0; i < kelime.length(); i++) {
			 
			 yeni=yeni+ Character.toUpperCase(kelime.charAt(i));
		}
		
		return yeni;
		
		
		
	}
	
	
	public static String reverseString(String str) {
		
		
		
		String yeni="";
		int k=str.length();
		for (int i = 0; i < str.length(); i++) {
			--k;
			yeni+=Character.toUpperCase(str.charAt(k));
			
			
			
			
		}
		
		return yeni;
		
		
	}
	
	
	
	public static boolean IsPolindrom(String str) {
		
		return str.equals(reverseString(str));
		
		
		
		
	}
	
	
	
	
	
	
	
	

}

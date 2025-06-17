package myFirstPackage;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String name = "kishan meta";
		String reve = "";
		
		
		for (int i=name.length()-1; i>=0; i--) {
			
			reve = reve + name.charAt(i);
			
		}
		
		System.out.println(reve);
		
	}

}

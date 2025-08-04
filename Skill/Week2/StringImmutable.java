package week2;

public class StringImmutable {
	public static void main(String[] args) {
	    String s1 = "Hello";
	    s1.concat(" Everyone"); 
	    System.out.println(s1); 

	    s1 = s1.concat(" Everyone");
	    System.out.println(s1); 
	}
}
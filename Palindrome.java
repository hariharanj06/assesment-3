package week3.day2.assignment;

public class Palindrome {
 public static void main(String[] args) {
	
	 String name = "madam";
	 String rev = "";
	 
	 char[] charArray = name.toCharArray();
	 
	 for (int i = charArray.length-1; i >=0; i--) {
		rev = rev+charArray[i];
		
	}
	 System.out.println(rev);
	 if(name.equals(rev)) {
		 System.out.println("it is a palindrome");
	 }
	 else {
		 System.out.println("not a palindrome");
	 }
}
}

package week3.day2.assignment;

public class ReverseEvenWords {
 public static void main(String[] args) {
	
	 String text = "I am a software tester"; 
	 
	 String[] splitString = text.split(" ");
	 
	 for (int i = 0; i <splitString.length ; i++) {
		if(i%2!=0) {
			System.out.print(" ");

			char charArray[] = splitString[i].toCharArray();
			
			for(int j=charArray.length-1;j>=0; j--){
				
				System.out.print(charArray[j]);
			}
			System.out.print(" ");

			}

		else {
			System.out.print(splitString[i]);
		}
		}
	 
	 
}
}

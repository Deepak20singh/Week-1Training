import java.util.Scanner;

public class StringCountVowel2D {
	
public static char upper(char c){
	if(c>='A'&&c<='Z'){
		return (char) (c+32);
	}
	return c;
}

public static String check(char c){
	c=upper(c);
	 if (c >= 'a' && c <= 'z'){
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
	return "vowel";}
	else{
		return "consonent";
	}
	 }
	 return "Not a letter";
}
	

public static String[][] analysis(String s){
	String[][] result=new String[s.length()][2];
	
	for(int i=0;i<s.length();i++){
		char current=s.charAt(i);
		result[i][0]=String.valueOf(current);//store character
		result[i][1]=check(current);//store its type
		
	}
	return result;
}
 public static void displayTable(String[][] data) {
	 String[][] result=data;
	 for(int i=0;i<result.length;i++){
		 System.out.println("The character is "+result[i][0]+" and its type is "+result[i][1]);
       
    }
 }
		
	
    public static void main(String[] args) {
		/*Write a program to find vowels and consonants in a string and display the character type - Vowel, Consonant, or Not a Letter
Hint => 
Create a method to check if the character is a vowel or consonant and return the result. The logic used here is as follows:
Convert the character to lowercase if it is an uppercase letter using the ASCII values of the characters
Check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter
Create a Method to find vowels and consonants in a string using charAt() method and return the character and vowel or consonant in a 2D array
Create a Method to display the 2D Array of Strings in a Tabular Format
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 

*/Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call method to count vowels and consonants
        String[][] analyze = analysis(input);

        // Display the results in tabular format
        System.out.println("\nCharacter Analysis:");
        displayTable(analyze);
        }
}

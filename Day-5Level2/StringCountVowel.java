import java.util.Scanner;

public class StringCountVowel {
	
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
	
public static int[] countVowel(String s){
	int consonant=0,vowel=0;
	for (int i=0;i<s.length();i++){
		char c=s.charAt(i);
		String result=check(c);
		
		if(result=="vowel"){
			vowel++;
		}
		else if(result=="consonent"){
			consonant++;
		}
		
	}
	return new int []{vowel,consonant};
}
		
	
    public static void main(String[] args) {
		/*Write a program to find vowels and consonants in a string and display the count of  Vowels and Consonants in the string
Hint => 
Create a method to check if the character is a vowel or consonant and return the result. The logic used here is as follows:
Convert the character to lowercase if it is an uppercase letter using the ASCII values of the characters
Check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter
Create a Method to Method to find vowels and consonants in a string using charAt() method and finally return the count of vowels and consonants in an array
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 


*/Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call method to count vowels and consonants
        int[] counts = countVowel(input);

        // Display results
        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);
        }
}

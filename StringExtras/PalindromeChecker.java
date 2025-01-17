import java.util.Scanner;

public class PalindromeChecker {
	
	public static String reverse(String s){
		String result="";
		for(int i=s.length()-1;i>=0;i--){
			result=result+s.charAt(i);
		}
		return result;
	}
	//for result
	public static boolean palindrome(String s){
		String fs=s;
		String rs=reverse(s);
		boolean result=true;
		for(int i=0;i<fs.length();i++){
			if(fs.charAt(i)!=rs.charAt(i)){
				result=false;
			}
		}
		return result;
	}
		
			
    public static void main(String[] args) {
		
		    Scanner scanner = new Scanner(System.in);

//input from users

        System.out.print("\nEnter the 1st word :- ");
        String word1 = scanner.nextLine();
		System.out.println("The given string "+(palindrome(word1)?"is palindrome ":"is not palindrome"));
           }
}



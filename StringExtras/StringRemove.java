import java.util.Scanner;
import java.util.Arrays;

public class StringRemove {
	
	public static String removeLogic1(String s){
		String result="";
		
		int arr[]=new int[256];
		Arrays.fill(arr, 0);
		
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			
			if((arr[c]!=1 )){
			arr[s.charAt(i)]++;
		
		}
		}
		
		for(int i=0;i<s.length();i++){
			if(arr[s.charAt(i)]==1){
				
				result=result+s.charAt(i);
				arr[s.charAt(i)]=0; //next time jb ayenge toh alphabet pehle se 1 hoga to isliye usko 0 kr denge
			}
		}
		return result;
				
			
	
	}
	public static String removeLogic2(String s){
		String result="";
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(result.indexOf(c)==-1)
			{
				result=result+c;
			}
		}
		//System.out.println(result);
		return result;
	
	}
			
    public static void main(String[] args) {
		
		/*
		Problem:
Write a Java program to count the number of vowels and consonants in a given string.
*/
        Scanner scanner = new Scanner(System.in);

//input from users

        System.out.print("\nEnter the 1st word :- ");
        String word1 = scanner.nextLine();
		System.out.println(removeLogic1(word1));
           }
}



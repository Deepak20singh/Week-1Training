import java.util.Scanner;
import java.util.Arrays;

public class StringDelete {
    
    public static String deleLogic1(String s,char inp) {
String res="";
for (int i = 0; i < s.length(); i++) {
           if(s.charAt(i)!=inp){
			   res+=s.charAt(i);
        }

}

        return res; 
    
	}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("\nEnter the string: ");
        String word1 = scanner.nextLine();
		
        System.out.print("\nEnter the char you wants to delete: ");
        char word2 = scanner.next().charAt(0);


        // Output the most frequent character
        String result = deleLogic1(word1,word2);
        System.out.println("The resultant ans is: "+result);
    }
}

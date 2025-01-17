import java.util.Scanner;

public class StringToggle {
	
	public static void compare(String input1,String input2){
		int size=((input1.length()>input2.length())?input2.length():input1.length());
		
		for(int i=0;i<size;i++){
		
		if(input2.charAt(i)>input1.charAt(i)){
			System.out.println("The lexicalorder will be\n"+input1+"\n"+input2);
			break;
		}
		else if(input1.charAt(i)>input2.charAt(i)){
			
			System.out.println("The lexicalorder will else if be\n"+input2+"\n"+input1);
			break;
		}
	}
	}

    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
//Compare Two Strings
        // Taking user input
        System.out.print("Enter a string 1: ");
        String input1 = sc.nextLine();
		 System.out.print("Enter a string 2: ");
        String input2 = sc.nextLine();
		compare(input1,input2);
		
	}}
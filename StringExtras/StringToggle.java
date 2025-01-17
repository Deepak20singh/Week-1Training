import java.util.Scanner;

public class StringToggle {
	
	public static void toggle(String input){
		String res="";
		
		for(int i=0;i<input.length();i++){
			int temp=input.charAt(i);
		if(input.charAt(i)>=97&&input.charAt(i)!=' '){
			res=res+(char)(temp-32);
		}
		else if(input.charAt(i)==' '){
			res=res+(char)(temp);
		}
		else{
		res=res+(char)(temp+32);}
		}
		System.out.println("toggle string is "+res);
	
	}

    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
//Toggle Case of Characters
        // Taking user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
		toggle(input);
		
	}}
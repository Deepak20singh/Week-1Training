import java.util.Scanner;

public class StringCountOccurance {
	
	public static void sub(String input,String inputsb){
		 int size=inputsb.length();
		 int count=0;
		 for(int i=0;i<input.length()-size+1;i++){
			 String s=input.substring(i,i+size);
			 System.out.println("The maximum occurance of the substring is "+s);
			
			 if(s.equals(inputsb)){
				 count++;
				   }
		 }
		 System.out.println("The maximum occurance of the substring is "+count);
	}
	
   

    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
		
		 System.out.print("Enter a substring: ");
        String inputsb = sc.nextLine();
		
		sub(input,inputsb);

       
		
	   

       
       
      
        }
}
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class LcmHcf {
	static int LCM(int input1,int input2){
		int number=((input1>input2)?input2:input1);
		int result=0;
		for(int i=2;i<number;i++){
			if(input1%i==0&&input2%i==0){
				result=i;
				break;
			}
		}
		return result;
		
				
	}
	static int GCD(int input1,int input2){
		int number=((input1>input2)?input2:input1);
		int result=0;
		for(int i=number;i>0;i--){
			if(input1%i==0&&input2%i==0){
				result=i;
				break;
			}
		}
		
		
		return result;		
	}
		
			

    public static void main(String[] args) {
         /*GCD and LCM Calculator:
*/

//calling game
Scanner sc = new Scanner(System.in);
        
      System.out.print("Enter the number :- ");
		int input1=sc.nextInt();
		
		  
      System.out.print("Enter the number :- ");
		int input2=sc.nextInt();
	System.out.print("LCM of the number :- "+LCM(input1,input2)+"\n");
	System.out.print("GCD of the number :- "+GCD(input1,input2));
	
	
		
        }
}

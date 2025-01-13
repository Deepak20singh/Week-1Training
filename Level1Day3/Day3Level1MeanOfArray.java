import java.util.Scanner;
public class Day3Level1MeanOfArray {
	public static void main(String args[]){
		
		// creating the input object for using scanner class 
		Scanner input = new Scanner(System.in);
		
		
		 
		// initializing the array of age size 11 
		int[] height = new int[11];
		
		
		int sum = 0 ;
		
		for (int i = 0 ; i<height.length; i++){
			
			System.out.println("Enter the height of the player"+(i+1)+": ");
			
			//taking the height from user 
			int height = input.nextInt();
			 
			
			height[i] = height;
			
			sum += height[i];			
			
			
		}
		
		
		System.out.println("Mean height of the team :- "+(sum/11));
	}
}

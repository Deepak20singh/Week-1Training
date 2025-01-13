import java.util.Scanner;

public class Day3Level1MatrixToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter the number :-");
		int num=sc.nextInt();

        int number=num;
		int maxiIndex=10;
		int[] arr=new int[maxiIndex];
		   // for storing factors
		int index=0;
		for(int i=1;i<(number/2+1);i++){ //saving factors 
			if(number%i==0){
				if(index==maxiIndex){
					maxiIndex=maxiIndex*2;
					int temp[]=new int[maxiIndex];
					for(int j=0;j<arr.length;j++){
						temp[j]=arr[j];
					}
					arr=temp;
				
				}
				
				arr[index]=i;
				index++;
			}
		}
		
		for(int i=0;i<index;i++){
			
				System.out.println("The factors of "+num+" is "+arr[i]);
		
			
				
		}
    }
}

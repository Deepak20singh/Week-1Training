import java.util.Scanner;

public class Day3Level2ndLargestUsingDynamicArray{
	public static void main(String args[]){	

		// Scanner class for taking inputs
		Scanner sc=new Scanner(System.in);

		long num;
		System.out.println("Enter the number: ");
		num=sc.nextLong();
		int tempA[]=new int[20];
		int arr[]=new int[10];
		int ind=0;
		while(num!=0){
		long temp=num%10;
		if(ind<10)arr[ind]=(int)temp;
		num=num/10;
	

		if(ind==10){		
			for(int i=0;i<10;i++){

			tempA[i]=arr[i];
			}
		tempA[10]=(int)temp;
		}
		if(ind>10){
		tempA[ind]=(int)temp;
		}
		ind++;
		}	
		int larg=0;
		int sLarg=0;
		for(int i=0;i<20;i++){
		if(tempA[i]>larg)
		{sLarg=larg;
			larg=arr[i];
		}
		if((tempA[i]<larg)&&tempA[i]>sLarg)sLarg=arr[i];


	}
	
	System.out.println("Largest number is: "+larg+" second largest is: "+sLarg);
	
	}
}
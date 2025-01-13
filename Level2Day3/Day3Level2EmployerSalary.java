import java.util.Scanner;

public class Day3Level2EmployerSalary {
    public static void main(String[] args) {
		/*
		Create a program to find the bonus of 10 employees based on their years of service and the total bonus amount
		the company Zara has to pay, along with the old and new salary.
Hint => 
Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
Define a double array to save salary and years of service for each of the 10 employees
Also define a double array to save the new salary and the bonus amount as well as variables to save the total bonus, 
total old salary, and new salary
Define a loop to take input from the user. If salary or year of service is an invalid number then ask the use to enter 
again. Note in this case you will have to decrement the index counter
Define another loop to calculate the bonus of 10 employees based on their years of service. Save the bonus in the array, 
compute the new salary, and save in the array. Also, the total bonus and total old and new salary can be calculated in 
the loop
Print the total bonus payout as well as the total old and new salary of all the employees
*/
        Scanner sc = new Scanner(System.in);
		
		

       
		int[][] employerInfo=new int[10][2];
		double[][] employerBonus=new double[10][2];
		double totalBonus=0,totalOldSalary=0;
		
		   // for taking input
	for(int i=0;i<10;i++){
		for(int j=0;j<2;j++){
			System.out.print("\nEnter the salary of "+(i+1)+" employ :- ");
		int sal=sc.nextInt();
		
		System.out.print("\nEnter the year of "+(i+1)+" employ:- ");
		int year=sc.nextInt();
		if(sal>=0){
			employerInfo[i][0]=sal;         //salary
			employerInfo[i][1]=year; 			//year
		totalOldSalary=totalOldSalary+(double)(employerInfo[i][0]);
			
			if(employerInfo[i][1]>=5){
				
				employerBonus[i][0]=(double)(employerInfo[i][0])*0.05; 				//new bonus
				
				
		}
		else{
				employerBonus[i][0]=(double)(employerInfo[i][0])*0.02;   //new bonus
				
		}
		totalBonus=totalBonus+(double)(employerBonus[i][0]);
		employerBonus[i][1]=employerInfo[i][0]+employerBonus[i][0];   //new salary
		System.out.println("The new salary of the employer is "+employerBonus[i][1]);
				
		}
		else{
			System.out.println("The salary is invalid please enter valid salary ");
			i--;j--;
		}
	}
	}
	
		
			
				System.out.println("The total old salary is "+totalOldSalary+" and the total bonus is "+totalBonus);
		
			
				
		
    }
}

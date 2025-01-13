import java.util.Scanner;

class Day3Level2BmiArray {
    public static void main(String args[]) {
        /*An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in the
		team. For this create a program to find the BMI and display the height, weight, BMI and status of 
		each individual
Hint => 
Take input for a number of persons
Create arrays to store the weight, height, BMI, and weight status of the persons
Take input for the weight and height of the persons
Calculate the BMI of all the persons and store them in an array and also find the weight status of the persons
Display the height, weight, BMI, and weight status of each person
Use the table to determine the weight status of the person

*/
     
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the number of students :- ");
        int num = sc.nextInt();
		 
		 //declearing arrays
		 int weight[]=new int[num];
		 int height[]=new int[num];
		 double bmi[]=new double[num];
		 String weightStatus[]=new String[num];
		 
		 
       for (int i = 0; i < num; i++) {
            System.out.print("\nEnter the weight of " + (i + 1) + " person :- ");
            weight[i] = sc.nextInt();
            System.out.print("\nEnter the height of " + (i + 1) + " person :- ");
            height[i] = sc.nextInt();
            
            bmi[i] = (double)(weight[i]) /(double) (height[i]* height[i]);//bmi formula
			if (bmi[i] <= 18.4) {
                weightStatus[i] = "Underweight";
            } 
			else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                weightStatus[i] = "Normal"; 
            } 
			else if (bmi[i] >= 25.0 && bmi[i] <=39.9) {
                weightStatus[i] = "Overweight";
            } 
			else {
                weightStatus[i] = "Obese";
            }
				
		
  
	   }
	    for (int i = 0; i < num; i++){
				System.out.println("\nThe height of "+i+" person is " +height[i]+ " , weight is "+weight[i]+" , bmi is "+bmi[i]+" and weight status is "+weightStatus[i]);
		}
		}
}

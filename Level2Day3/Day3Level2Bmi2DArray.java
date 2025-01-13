import java.util.Scanner;

class Day3Level2Bmi2DArray {
    public static void main(String args[]) {
        /*Rewrite the above program using multi-dimensional array to store height, weight, and BMI in 2D 
		array for all the persons
Hint => 
Take input for a number of persons
Create a multi-dimensional array to store weight, height and BMI. Also create an to store the weight status 
of the persons
       double[][] personData = new double[number][3];
       String[] weightStatus = new String[number];
Take input for weight and height of the persons and for negative values, ask the user to enter positive values
Calculate BMI of all the persons and store them in the personData array and also find the weight status 
and put them in the weightStatus array
Display the height, weight, BMI and status of each person


*/
     
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the number of students :- ");
        int num = sc.nextInt();
		 
		 //declearing arrays
		 
		 double[][] personData = new double[num][3];
         String[] weightStatus = new String[num];
		 
		 
       for (int i = 0; i < num; i++) {
            System.out.print("\nEnter the weight of " + (i + 1) + " person :- ");
			
            personData[i][0]= sc.nextInt();  //for weight only
			
            System.out.print("\nEnter the height of " + (i + 1) + " person :- ");
            personData[i][1] = sc.nextInt();   //for height only
            
            personData[i][2] = (double)( personData[i][0]) /(double) (personData[i][1] * personData[i][1] );//bmi formula ,it will save bmi info
			if ( personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } 
			else if ( personData[i][2] >= 18.5 &&  personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal"; 
            } 
			else if ( personData[i][2] >= 25.0 &&  personData[i][2] <=39.9) {
                weightStatus[i] = "Overweight";
            } 
			else {
                weightStatus[i] = "Obese";
            }
				
		
  
	   }
	    for (int i = 0; i < num; i++){
				System.out.println("\nThe height of "+i+" person is " +personData[i][1]+ " , weight is "+ personData[i][0]+" , bmi is "+personData[i][2]+" and weight status is "+weightStatus[i]);
		}
		}
}

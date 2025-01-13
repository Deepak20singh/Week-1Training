import java.util.Scanner;

class WeightInKg {
    public static void main(String args[]) {
        /* Create a program to convert weight in pounds to kilograms.
Hint => 1 pound = 2.2 kg
I/P => weight
O/P => The weight of the person in pound is ___ and in kg is ___

*/

     //declear variable
        int weight;

        Scanner sc = new Scanner(System.in);
		
        //Taking weight from user
        System.out.print("Enter the weight in pound : ");
        weight = sc.nextInt();
		
		double pound = 2.2; //1 pound = 2.2 kg
		
		double weightInKg= (double)(weight)/pound;
	 

       
        // The result
        System.out.println("\n The weight of the person in pound is " +weight+ " and in kg is "+weightInKg);
    }
}

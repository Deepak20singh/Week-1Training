import java.util.*;


class QuantityPrice{


public static void main(String args[]){
	/*Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
Hint => NA
I/P => unitPrice, quantity
O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___


*/
int unitPrice,quantity;


Scanner sc=new Scanner(System.in);
System.out.print("Enter the unit price :- ");
unitPrice=sc.nextInt();
System.out.println();
System.out.print("Enter the quantity :- ");
quantity=sc.nextInt();
System.out.println();

int purchasePrice=unitPrice*quantity;


System.out.println("The total purchase price is INR "+ purchasePrice +" if the quantity "+ quantity +" and unit price is INR "+unitPrice
);
}
}
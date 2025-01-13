import java.util.*;
import java.lang.*;

class Earth{

public static void main(String args[]){
	/*
	Write a Program to compute the volume of Earth in km^3 and miles^3
Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____

	*/
int radiusInKilometers=6378;
double radiusInMiles=radiusInKilometers*1.6;
double volumeInKilometers=(4/3)*Math.PI*Math.pow(radiusInKilometers,3);
double volumeInMiles=(4/3)*Math.PI*Math.pow(radiusInMiles,3);


System.out.println("The volume of earth in cubic kilometers is "+ volumeInKilometers +" and cubic miles is "+ volumeInMiles+" "+Math.pow(radiusInKilometers,3));


}
}
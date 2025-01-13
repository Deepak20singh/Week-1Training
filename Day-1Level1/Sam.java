import java.util.*;

class Sam{

public static void main(String args[]){
//Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
int physics =95,maths=94,chemistry=96, totalMarks=300;
int sumMarks = physics + maths + chemistry;

double percentMark = (double)(sumMarks)/(double)(totalMarks)*100;

System.out.println("the average percent mark in PCM is "+percentMark+"%");


}
}
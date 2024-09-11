import java.util.Scanner;
class program8{
    public static void main (String[]args){
    Scanner ahh = new Scanner(System.in);
   
    
//scanner input
System.out.println("Enter two integers ");
String Int1 = ahh.nextLine();
String Int2 = ahh.nextLine();

//convert

int Integer1 = Integer.valueOf(Int1);
int Integer2 = Integer.valueOf(Int2);

//math

int sum = Integer1 + Integer2;
int diff = Integer1 - Integer2;
double ave = sum / 2.0;
int distance = Math.abs (diff);
int product = Integer1 * Integer2;
int max = 0;
int min = 0;
int compute = Math.abs(Integer1 - Integer2) + Integer1 + Integer2;
if  (Integer1>Integer2){
     max = Integer1;
     min = Integer2;
}
else{
    max = Integer2;
    min = Integer1;
}


System.out.println("sum: " + sum);
System.out.println("difference: " + diff);
System.out.println("average: " + ave);
System.out.println ("distance: " + distance);
System.out.println("product: " + product);
System.out.println("maximun: " + max);
System.out.println("minumim: " + min);

     
    
    


}
}

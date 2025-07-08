import java.util.Scanner;

public class nmopt{
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);
//input1
 System.out.print("Enter the first integer: \t");
 double  num1 = input.nextDouble();
System.out.print(num1);

//input 2
System.out.print("Enter the second integer");
double num2 = input.nextDouble();
System.out.print(num2);
 
double sum,product;
//sum
sum = num1+num2;
//product
product = num1*num2;
//quotient
int quotient;
quotient= (int) (num1/num2);
//reminder
double reminder;
reminder = num1%num2;

//average 
double avg;
avg= (num1+num2)/2;

//print all
System.out.print("Sum= " +sum );
System.out.print("\nproduct= "+ product);
System.out.print("\nquotient= " + quotient);
System.out.print("\nreminder (n1%n2)= " + reminder);
System.out.print("\naverage= " + avg+"\n");
 

}
}

import java.util.Scanner;

public class sumn{
public static void main(String[] args){

    //System.out.print("Hello world");
 Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a number with more than one digit:  ");
    int num = input.nextInt();
 int copy=num;
    int sum=0;
while(num!=0){
    sum += num%10; //get the last digit
       // System.out.print("\n"+sum);
    num /= 10;   //removethe last digit
//System.out.print("\n"+num);

}


System.out.print("Sum of digits of "+ copy +" is "+sum +"\n");


}
}

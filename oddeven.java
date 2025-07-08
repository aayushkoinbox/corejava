import java.util.Scanner;

public class oddeven{
    public static void main(String[] args){
  
        Scanner input = new Scanner(System.in);
 
    System.out.print("Enter a number");
    int num = input.nextInt();
System.out.print("number= " + num +"\n");

if(num== 0){
 System.out.print("Neither a odd nor a even number");
}
else if(num%2==0){
System.out.print(num + " is a even number");
}
else{
System.out.print(num + " is a odd number" + "\n");
}


}
}

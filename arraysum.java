//ques no 7
import java.util.Scanner;
public class arraysum{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int[] arr;
    arr = new int[5];
    int sumn=0;
    System.out.print("Enter any 5 numbers for an array \t");
    for(int i=0; i<5;i++){

    arr[i] = input.nextInt();

    //System.out.print("\t"+ arr[i]+ ",\t");
    sumn = sumn + arr[i];

}

System.out.print("\nSum of array: " + sumn);

// for(int i=0; i<5;i++){
//    System.out.print(arr[i]);   
//
// }
}
}

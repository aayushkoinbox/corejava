import java.util.Scanner;

public class areatri{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);



System.out.print("\nEnter the lenght of rt angle triangle");
int length = input.nextInt();

System.out.print("Enter the height of rt angle triangle");
int height = input.nextInt();

double area = 0.5* length*height;

System.out.print("Areaof the rectangle= "+ area +"\n");

}
}
  

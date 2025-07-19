//ques no 10
import java.util.Scanner;

public class matrixmult{

public static int[][] data(int mat[][] , String x ,Scanner in){
int i,j;
System.out.println("Enter matrix "+x);
for(i=0;i<3;i++){
for(j=0;j<3;j++){
  
        System.out.print(x+i+j+"\t");
        mat[i][j]= in.nextInt();

            }

           }
return mat;

}


public static int[][] mult(int mata[][], int matb[][]){

int i,j,k;
 int matr[][] = new int[3][3];
 for(i=0;i<3;i++){
    for(j=0;j<3;j++){
     matr[i][j]=0;
        for(k=0;k<3;k++){
        matr[i][j] += mata[i][k] * matb[k][j];
        }
}
}



return matr;


}




//
//public static void print(String a){
//
//System.out.println("Name : "+a);
//
//}



public static void main(String... args)
{
Scanner input = new Scanner(System.in);
 
int[][] mat_a= new int[3][3];
int[][] mat_b= new int[3][3]; 
  System.out.println("matrix multipication of 3*3");

int[][] mat_A = data(mat_a, "A",input);
int[][] mat_B =data(mat_b, "B", input);

int[][] mat_C =mult(mat_A, mat_B);


int i,j;
System.out.println("product of matrice A * B: ");
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
                
System.out.print( mat_C[i][j] +"\t");
}
System.out.print("\n");
}


            }

            }

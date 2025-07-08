    import java.util.Scanner;
    public class summatrices{

    public static int[][] data(int mat[][], String x,int m, int n,Scanner input){
    int i,j; 
    System.out.print("enter value of "+ x +m+" * "+n+"\n");
    for(i=0;i<mat.length;i++){
    for(j=0;j<mat[i].length;j++){
        System.out.print( x +i+j+" : ");
       mat[i][j]= input.nextInt();

    }
    }
    return mat;


    }

public static int[][] sum(int mata[][], int matb[][],int m ,int n)
{ int i,j;
 int[][] result = new int[m][n];
for(i=0;i<m;i++){
for(j=0;j<n;j++){
 result[i][j]= mata[i][j]+matb[i][j];

}}


return result;



}





    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     int m,n;

       System.out.print("Input a dimension of matrix m * n ");
        System.out.print("m : ");
        m = input.nextInt();
        System.out.print("n : ");
        n = input.nextInt();
    int[][] mat_a = new int[m][n];
    int[][] mat_b = new int [m][n];

    int[][] matA = data(mat_a,"A", m, n,input);
    int[][] matB = data(mat_b,"B",m,n,input);
    //data entry

    int[][] r= sum(matA,matB,m,n);
 System.out.print("\nSum:");
     for(int i=0;i<m; i++)
{       for(int j=0; j<n; j++){
            System.out.print("\t"+r[i][j]+"\t");
}
 System.out.print("\n");
}
 System.out.print("\n");


    }

    }

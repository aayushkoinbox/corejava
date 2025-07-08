import java.util.Scanner;
public class order{
public static void main(String... args){
 Scanner input = new Scanner(System.in);
 int i,j;
System.out.print("Enter no of element in an array\t");
int n = input.nextInt();
System.out.print("enter numbers");
int[] arr = new int[n];
int[] arrn =new int[n];

for(i=0;i<n;i++){
    arr[i] = input.nextInt();
}

for(i=0;i<n-1;i++){
for(j=0; j<n-1-i;j++){
if (arr[j] > arr[j+1]){
 int temp=arr[j];
    arr[j]=arr[j+1];
    arr[j+1]=temp;
}


}
}

for(int a:arr){
System.out.print("Ascesding: "+a + ", ");

}
 System.out.print("\n ");
for(j=0;j<n; j++){
    arrn[j]=arr[n-1-j];

}

for(int d:arrn){
System.out.print("Descending: "+d + ", ");

}


}

}

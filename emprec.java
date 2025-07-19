// ques no 15
import java.io.*;
import java.util.Scanner;

public class emprec{

public static void main(String[] args)
{
    writeEmpData();
    displayEmpData();

}

private static void writeEmpData(){

    Scanner input = new Scanner(System.in);

    //name
    System.out.println("Enter an Employee name: ");
    String empname = input.nextLine();
//ID
    System.out.println("Employee id : ");
    int eid = input.nextInt();
 input.nextLine(); 
//address
    System.out.println("Enter address :");
    String eadd = input.nextLine();
 
 //DOB
    System.out.println("Enter DOB (YYYY-MM-DD) ");
    String eDOB = input.nextLine();

//PHONE NUMBER
            System.out.println("Enter phone number") ;
            String econtact = input.nextLine();



// write file
try(BufferedWriter writer = new BufferedWriter(new FileWriter("Emp.txt",true)))
{
    writer.write("Employee Name: "+empname);
    writer.newLine();
    writer.write("Employee ID: "+eid);
    writer.newLine();
    writer.write("Address: "+eadd);
    writer.newLine();
    writer.write("DOB: "+ eDOB);
    writer.newLine();
    writer.write("Phone number: "+econtact);
    writer.newLine();
    writer.newLine();
}
catch(IOException e){
System.out.println("An error occured while writing to the file.");
e.printStackTrace();

}


}

private static void displayEmpData()
{
    try(BufferedReader reader = new BufferedReader(new FileReader("Emp.txt")))
    {String line;
    System.out.println("\n\n DisplayContent of Emp.txt");
    while((line = reader.readLine())!=null)
{
    System.out.println(line);
}
   }
        catch(FileNotFoundException e){
            System.out.println("Emp.text file not found");

        }
            catch(IOException e)
{
    System.out.println("An error occured while reading  the file.");
    e.printStackTrace();
}


}








}
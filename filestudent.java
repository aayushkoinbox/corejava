//ques no16
import java.io.*;
import java.util.Scanner;

public class filestudent{
        public static void main(String[] args)
{
        Scanner input = new Scanner(System.in);
        //name
        System.out.println("Enter Student name: ");
        String sname = input.nextLine();
//age
        System.out.println("Age: ");
                int age = input.nextInt();
                input.nextLine();
//grade
        System.out.println("Grade % : ");
                   char grade = input.nextLine().charAt(0);
//contact no
        System.out.println("Contact no : ");
                String contact = input.nextLine();
        

//wrt file
try(BufferedWriter w = new BufferedWriter(new FileWriter("std.txt"))){
            w.write("Name : "+ sname + "\n");
            w.write("Age : "+ age +"\n");
            w.write("grade : "+ grade +"\n");
            w.write("Contact no : "+ contact +"\n");
            w.close();
            }

catch(IOException e){
        System.out.println("Error occured while writing std.txt"+ e.getMessage());

}

//cpy file
try(BufferedReader r = new BufferedReader(new FileReader("std.txt"));
    BufferedWriter w2 = new BufferedWriter(new FileWriter("std1.txt"))
)
{
    String line;
    while((line= r.readLine())!=null){
    w2.write(line);
    w2.newLine();
}
}
catch(IOException e){
    System.out.println("Error occured while copying. " + e.getMessage());
}



System.out.println("\n Content form Std1.txt");
try(BufferedReader r2 = new BufferedReader( new FileReader("std1.txt")))
{
    String line;
    while((line = r2.readLine()) != null){
    System.out.println(line);

}
}

catch(IOException e){
System.out.println("Error occured while display std1.txt ."+ e.getMessage() );

}


            }





            }

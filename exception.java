//ques no13
public class exception{
public static void main(String... args){

try{

 int[] number= {1,2,5};
System.out.println(number[6]);

 int a = 61/0;

}


 catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        }


//catch (Exception e) {
//            System.out.println("\nGeneral exception: " + e);
//        }
//works for all

finally{
System.out.println("\nI always exectute man.");

}

}



}

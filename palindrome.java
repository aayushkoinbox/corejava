        import java.util.Scanner;
        public class palindrome{
        public static void main(String... args){
         Scanner input = new Scanner(System.in);

        System.out.print("\n Enter number to check palindrome:");
          int num = input.nextInt();
    int org = num;
    int rev = 0;
          while(num!=0){
            int digit = num%10;
                rev = rev *10 +digit;
                num /= 10;

        }
        if(org== rev){
        System.out.print(org +" is a palindrome.");
        
        }
        else{
            System.out.print(org +" isnot a palindrome.");
}

        
                    }
                }

//question no12
//thread1
class ThreadA implements Runnable{
  public void run(){
    System.out.println("Even number from 50 to 100");
    for(int i=50; i<101; i++)
  { if(i%2==0){
    System.out.println(i);
  }

  }


  }

}

class ThreadB implements Runnable{
    public void run(){
 System.out.println("Odd number from 100 to 200");
     for(int i=100; i<201; i++)
  { if(i%2!=0){
    System.out.println(i);
  }

  }

    }
}

public class Dthreadc{
public static void main(String[] args){
    ThreadA a = new ThreadA();
    ThreadB b = new ThreadB();

    Thread t1 = new Thread(a);
    Thread t2 = new Thread(b);

    t1.start();
//t1.join();  // wait for t1 to finish

    t2.start();
//t2.join();  // wait for t2 to finish
}


}
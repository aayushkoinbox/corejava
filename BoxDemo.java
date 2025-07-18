//Base class Box
        class Box{
            double length, breadth, height;

            // Constructor to get dimensions of box
            Box( double l, double b, double h){
                length = l;
                breadth = b;
                height = h;


            }
//method to compute volume
            double getvolume(){
                    return length*breadth*height;
            }

        }

 class BoxWeight extends Box {
    double weight;
    BoxWeight(double l, double b, double h, double density){
        super(l,b,h); //call the constructor of box
        weight = (l*b*h)*density*9.8;
    }

//method to display weight
 void displayWeight(){

System.out.println("Weight: "+ weight);
 }


 }      

public class BoxDemo{

public static void main(String[] args){
    BoxWeight box1 = new BoxWeight(5,6,7,2);

    BoxWeight box2 =new BoxWeight(12,11,19,1.5);
      
      //Box1
      System.out.println("Volume of box1: " + box1.getvolume());
      box1.displayWeight();

//box2
 System.out.println("Volume of box2: " + box2.getvolume());
      box2.displayWeight();


}

}

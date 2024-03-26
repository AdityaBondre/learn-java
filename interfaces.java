interface Bicycle{   // interface and default method
    int a = 45;
    void applyBrake(int decrement); // interface method are that type of method which must want to use
    void speedUp(int increment);
}
interface HornBicycle{
    int x = 45;
    void blowHornK3g();// if we implement the interface then we need to all method in the class if we cant use then it throw an error
    void blowHornmhn();
    default void erroe()// it is not written in class but by using default keyword we can access and it will not throw an error
    { System.out.println("\n");
    }
}
class AvonCycle implements Bicycle, HornBicycle{  // in interface we use implements keyword ---> we cant use extend keyword
    //public int x = 5;                             we can implement 2 or more interfaces in one class
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(int decrement){    // method of interface must in class
        System.out.println("Applying Brake"); // it must public at the time of method
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUP");
    }
    public void blowHornK3g(){
        System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
    }
    public void blowHornmhn(){
        System.out.println("Main hoon naa po po po po");
    }
}public class interfaces {
    public static void main(String[] args) {
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBrake(1);
        // You can create properties in Interfaces
        System.out.println(cycleHarry.a);
        System.out.println(cycleHarry.x);

        // You cannot modify the properties in Interfaces as they are final
        // cycleHarry.a = 454;
        //System.out.println(cycleHarry.a);

        cycleHarry.blowHornK3g();
       // cycleHarry.blowHornmhn();
    }
}

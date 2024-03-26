class Base{    // we can access some modifiers such like public
               // we cant access private modifiers
    public int x;  // multiple inheritance is not allow in java

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{       // Extends is a keyword which we use for inheritance
                                   // inheritance means use one class in another class --->such like Base class in Derived class
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


public class inheritance {
    public static void main(String[] args) {   // we can access base class by using derived object
        // Creating an Object of base class
        Base b = new Base();   // we cant use setx here
        b.setX(4);
        System.out.println(b.getX());

        // Creating an object of derived class
        Derived d = new Derived();  //  setx and sety both we can use
        d.setY(43);
        System.out.println(d.getY());
    }
}

class Base1{   // in this program  mixture of inheritance constructors and overloading
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor with value of x as: " + x);
    }
}

class Derived1 extends Base1{  // Extends is a keyword which we use for inheritance
    Derived1(){
       // super(0);  // super is keyword which is use for give input to int x  of base1
        System.out.println("I am a derived class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor of Derived with value of y as: " + y);
    }
}

class ChildOfDerived extends  Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
    }
}



public class inheritance_constructors {
    public static void main(String[] args) {

        // Base1 b = new Base1();  // it will print only base1 without int x
        // Derived1 d = new Derived1(); // it will print both base1 and derived1 without int value
        // Derived1 d = new Derived1(14, 9);  // it will print both base1 and  derived1 with value of int and
        // ChildOfDerived cd = new ChildOfDerived(); // it will print  base1, derived1 and ChildOfDerived without int value
       // ChildOfDerived cd = new ChildOfDerived(12, 13, 15);   // it will print  base1, derived1 and ChildOfDerived with int value
    }
}

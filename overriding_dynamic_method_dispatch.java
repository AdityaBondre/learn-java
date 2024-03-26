class A{      // // in 1 class, two or more methods  it is called as method overloading
    // method overriding means same methods in different class
// a method which we use in two or more class exactly same methods that is called as methods overriding
    public int a;
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){  // we cant use overriding in static
        System.out.println("I am method 2 of class B");  // data type must want to same
    }                                                    //
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class overriding_dynamic_method_dispatch {
    public static void main(String[] args) {
//        A a = new A();
//        a.meth2();
       //B b = new B();
//        b.meth2();

       // Dynamic Method Dispatch

        A obj = new B(); // it is allowed  because A is a subclass and B is super class
        //it will print the method of class B because of overriding
        obj.meth2();   //----> in this method of class B will be print
                       // we cant call the methods of B 
       // B obj1 = newA(); // it is not allowed
       // A ob = new A(); // if we want to print class A


    }

}

abstract class Parent2 {   // abstract is key word for abstract class
    // we need to make a class for access abstract class by using extends key word of inheritance
    public Parent2() {  // we use public keyword only we  abstract class name and method name both are same
        System.out.println("Mai base2 ka constructor hoon");
    }

    public void sayHello() { // we use public void for public method
        System.out.println("Hello");    //in the abstract class we can make both type of methods abstract and non-abstract method
    }

    abstract public void greet();  // in the abstract class minimum 1 abstract method want

    abstract public void greet2();
    //{
    // System.out.println("Good afternoon");  we cant write this in the abstract method because we are doing  Overriding

    // }
}
class Child2 extends Parent2{

    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}

abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}
public class abstract_class_method {
    public static void main(String[] args) {
        //Parent2 p = new Parent2(); -- error -----> we cant make object of abstract class
        // we need to make a class for access abstract class by using extends key word of inheritance
        Child2 c = new Child2(); // such like Child2 it is class for access the abstract class ---> we made here object for access
        //Child3 c3 = new Child3(); -- error
        c.sayHello();  // by using this we can call the abstract methods
        c.greet();
    }
}


abstract class pen{
  abstract void write();
  abstract void refile();
}
class fountenpen{
    public void write(){
System.out.println("Write");
    }
    public void refile(){
        System.out.println("Refile");
    }
    public void changeNib(){
        System.out.println("Change Nib");
    }
}
class monkey{
    void jump(){
        System.out.println("JUMP");
    }
    void bite(){
        System.out.println("BITE");
    }
}
interface basicanimel{
    void eat();
    void sleep();
}
class human extends monkey implements basicanimel{
    void speak(){
        System.out.println("Hello Sir ");
    }
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
}
public class practice {
    public static void main(String[] args) {
  fountenpen x = new fountenpen();
  x.changeNib();
  x.refile();
  x.write();
  monkey d = new monkey();
  d.bite();
  d.jump();
  human a = new human();
  a.eat();
  a.speak();
  a.sleep();
        basicanimel m = new human();
    }
}

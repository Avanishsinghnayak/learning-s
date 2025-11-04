class base1 {
    base1() {
        System.out.println("i am a constructor");
    }
    base1(int x){
        System.out.println("i am overloaded constructor with value of x as: " + x);
    }
    public int x;
    public int getx(){
        return x;
    }
    public void setx(int x){
        this.x = x;
    }
}
class derived1 extends base1{
    derived1(){
       // super(0);
        System.out.println("i am the derived class constructor");
    }
    derived1(int x,int y){
        super(x);
        System.out.println("i am overloaded constructor of derived  with value of y as :" + y);
    }

    public int y;
    public int gety(){
        return y ;
    }
    public void sety(int y) {
        this.y = y;
    }
}
class childofderived extends derived1{
    childofderived(){
        System.out.println("i am a child of the derived constructor");
    }
    childofderived(int x,int y,int z){
        super(x,y);
        System.out.println("i am an overloaded constructor of the derived with value of z as:" + z);
    }
}
public class constructors_inheritance {
    public static void main(String [] args){
      //  base1 b = new base1();
        //derived1 d = new derived1();
       // derived1 d = new derived1(14,80);
        childofderived cd = new childofderived(14 ,33, 90);
    }
}

class base{
    public int x;
    public int getx(){
        return x;
    }
    public void setx(int x){
        System.out.println(" i am in the base and setting x now");
        this.x = x;
    }
    public void printme(){
        System.out.println(" i am the contructor");
    }
}
class derived extends base{
    public int y;
    public int gety(){
        return y;
    }
    public void sety(int y){
        this.y = y;
    }
}
public class inheritance {
    public static void main(String [] args){
        //creating an object of the base class
        base b = new base();
        b.setx(4);
        System.out.println(b.getx());

        //creating an object of the derived class
        derived d = new derived();
        d.setx(55);
        System.out.println(d.getx());
    }
}

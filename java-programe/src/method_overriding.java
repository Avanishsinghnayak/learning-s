class A{
    public int a;
    public int avanish(){
        return 5;
    }
    public void meth2(){
        System.out.println("i am method 2 of the class A");
    }
}
class B extends A{
    @Override
    public void meth2() {
        System.out.println("i am method 2 of the class B");
    }
    public void meth3(){
        System.out.println("i am method 3 of the class B");
    }
}
public class method_overriding {
    public static void main(String [] args){
        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();
    }
}

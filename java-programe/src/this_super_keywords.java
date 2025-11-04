class ekclass{
    int a;
    public int geta(){
        return a;
    }
    ekclass(int v){
        this.a = v;//this is a way for us to reference an object of th class
    }
    public int returnone(){
        return 1;
    }
}
class doclass extends ekclass {
    doclass(int c){
        super(c);//a reference variable used to refer immediate parent class object
        System.out.println("i am a constructor");
    }
}
public class this_super_keywords {
    public static void main (String [] args){
        ekclass e = new ekclass(78);
        doclass d = new doclass(70);
        System.out.println(e.geta());
    }
}

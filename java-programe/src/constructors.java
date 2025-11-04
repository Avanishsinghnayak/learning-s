class mymainemployee{
    private int id;
    private String name;
    public mymainemployee(){
        id = 20;
        name = "your name ";
    }
    public String getname(){return name;}
    public void setname(String n ){this.name = n;}
    public void setid(int i){this.id = i;}
    public int getid(){return id;}
}
public class constructors {
    public static void main(String [] args){
        mymainemployee avanish = new mymainemployee();
        avanish.setname("avanish singh");
        avanish.setid(29);
        System.out.println(avanish.getid());
        System.out.println(avanish.getname());
    }
}















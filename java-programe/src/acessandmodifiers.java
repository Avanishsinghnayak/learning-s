
    class Myemployee{
        private int id;
        private String name;
        public String getname(){
            return name;
        }
        public void setname(String n ){
            name  = n;
        }
        public int setid(int i){
            id = i;
            return i;
        }
        public int getid(){
            return id;
        }
    }

public class acessandmodifiers{
    public static void main(String [] args){
        Myemployee avanish = new Myemployee();
        avanish.setname("my name is avanish");
        System.out.println(avanish.getname());
    }
}



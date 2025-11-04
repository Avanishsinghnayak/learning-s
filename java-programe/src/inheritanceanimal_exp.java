//create a class animal and derive another class dog from it
class animal{
    String name;
    int age;
     animal(String name, int age){
         this.name = name;
         this.age = age;

     }
     void eat(){
     System.out.println(name +  " is eating.");
     }
}
class dog extends animal{
    String breed;
    dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }
    void bark(){
        System.out.println(name + " is barking.");
    }
}
public class inheritanceanimal_exp {
    public static void main(String [] args){
        dog dog1 = new dog("sweety" , 3,"Labrador");
        dog1.eat();
        dog1.bark();
          System.out.println("name:" + dog1.name);
          System.out.println("age:" + dog1.age);
          System.out.println("breed:" + dog1.breed);
    }
}

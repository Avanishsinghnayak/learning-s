 import java.util.Scanner;

public class elseifclause {
    public static void main(String [] args){
        int age;
        System.out.println("enter your current age :");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
           if(age>60){
               System.out.println("you are the experienced man of the culture!");
           }
            else if (age>50){
                System.out.println("you are currently semi-experienced man of culture!");

           }
            else if(age>35){
                System.out .println("wait! you are becoming slowly-slowly man of the culture:");
           }
            else{
                System.out.println("you are not man! go self introspect... ");
           }
    }
}

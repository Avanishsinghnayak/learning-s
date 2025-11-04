import java.util.Scanner;

public class switch_case {
    public static void main(String [] args){
        int age;
        System.out.println("enter your age!");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch(age){
            case 18:
            System.out.println("currently you are pretty little baby genre!");
            break;
            case 25:
                System.out.println("you are in the growing condition focus on your work and just do that!");
                break;
            case 40:
                System.out.println("you are the man my boy!");
                break;
            case 60:
                System.out.println("its time to retire from everything sir!");
                break;
            default:
                System.out.println("enjoy the every moment of the life and make memories! ...good wishes!!");
        }
    }
}

/*public class chap_2praticeset {
    public static void main(String[] args){
        float a = 7/4.0f * 9/2.0f;
        System.out.println(a);
    }
}*/
 //it is giving the 4 answer which is wrong because of the 7/4 is in integer type and 9/2 also so for this we have to put
// like this 7/4.0f and 9/2.0f like that....


//next hiding grade problem
/*public class chap_2praticeset {
    public static void main(String [] args){
        char grade = 'd';
        grade = (char) (grade + 8);
        System.out.println(grade);

        //now decrypting the grade
         grade = (char)(grade - 8);
         System.out.println(grade);
    }
} // this process is called type casting in variable*/

import java.util.Scanner;
public class chap_2praticeset {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int a = sc.nextInt();
        System.out.println(a>8);
    }
}

  import java.util.Scanner;

  public class conditionals_practiceset {
    public static void main(String[] args) {
      /*float m1,m2,m3;      //problem 2
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks of physics subject:");
           m1 = sc.nextFloat();
          System.out.println("enter your marks of chemistry subject:");
           m2 = sc.nextFloat();
          System.out.println("enter your marks of mathematics subject:");
          m3 = sc.nextFloat();
          float total = (m1 + m2 + m3)/3;
          if (total>=40 && m1 >= 33 && m2 >=33  && m3 >=33){
              System.out.println("you passed the examination,congratulation!");
        }
          else{
              System.out.println("you fail in the examination....go study hard!!");
        }

    }
}*/

      /*  Question 3: Income Tax Calculator
        Tax Slabs:

        No tax < 2.5L

        5% on 2.5L–5L

        20% on 5L–10L

        30% on 10L+*/

          /*  Scanner sc = new Scanner(System.in);
            System.out.println("Enter your income in lakhs per annum:");
            float income = sc.nextFloat();

            float tax = 0;
            if(income<=2.5f){
                tax = 0;
            }
            else if(income<=5f){
                tax = 0.05f*(income - 2.5f);
            }
            else if (income<=10f){
                tax = 0.05f * (5f - 2.5f);
                tax += 0.2f * (income - 5f);
            }
            else {
                tax = 0.5f * (5f - 2.5f);
                tax +=0.2f * (10f - 5f);
                tax += 0.3f * (income - 10f);
}
          System.out.println("the total tax is: " + tax +"lakhs");
}
}*/

//Question 4: Write a Java program to find out the day of the week
// given the number [1 for Monday, 2 for Tuesday … and so on!]

        //DAY OF THE WEEK!!

                /*Scanner sc = new Scanner(System.in);
                System.out.println("Enter day number (1 for Monday, ..., 7 for Sunday):");
                int day = sc.nextInt();

                switch (day) {
                    case 1 -> System.out.println("Monday");
                    case 2 -> System.out.println("Tuesday");
                    case 3 -> System.out.println("Wednesday");
                    case 4 -> System.out.println("Thursday");
                    case 5 -> System.out.println("Friday");
                    case 6 -> System.out.println("Saturday");
                    case 7 -> System.out.println("Sunday");
                    default -> System.out.println("Invalid day number");
                }
            }
        }*/

  //Question 5:Write a Java program to find whether a year entered by
  // the user is a leap year or not.
/*  Question 5: Leap Year Checker
  Leap Year if:

  Divisible by 4

  Not divisible by 100 unless also divisible by 400*/
 /* Scanner sc =  new Scanner(System.in);
  System.out.println("enter the year:");
  int year = sc.nextInt();
  if ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0)){
      System.out.println(year + " is a leap year");
  }
  else {
      System.out.println(year +  " is not a leap year");
  }*/

      Scanner sc = new Scanner (System.in);
      String website = sc.next();
      if(website.endsWith(".org")){
          System.out.println("this is an organisational website");
      }
      else if (website.endsWith(".com")){
          System.out.println("this is an commercial website");
      }
      else if (website.endsWith(".in")){
          System.out.println("this is an indian website");
      }
  }
    }
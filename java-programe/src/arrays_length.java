public class arrays_length {
    public static void main(String[] args) {
      /*int [] marks1 = {90,40,50,59,30};
      float [] marks2 = {94,49,60,70,95,34};
      String [] student = {"avanish", "himanshu","ashish"};
      System.out.println(marks1.length);
      System.out.println(marks2.length);
      System.out.println(student.length);

    }
}*/

        //displaying the array using for loop (simple method)!!

        int[] marks = {60, 45, 60, 68, 39};
       /*for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
    }*/

        //printing using for-each loop..
        System.out.println("printing using for-each loop .");
        for (int element : marks) {
            System.out.println(element);
        }
    }
}
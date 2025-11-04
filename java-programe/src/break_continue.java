public class break_continue {
    public static void main(String[] args) {
       /* for(int i=0; i<5; i++){
            System.out.println(i);
            System.out.println("java us best!");
            if(i==3) {
                System.out.println("this is the ending od the programme!");
                break;
            }
        }
    }
}*/

//continue
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println("ending the loop!");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great!");
        }
    }
}

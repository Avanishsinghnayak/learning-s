// problem 1 (create an array of the 5 floats and calculate their sum)
/*public class arrays_practice_set {
    public static void main (String [] args){
        float [] marks = {45.0f,07.4f,29.8f,45.7f,34.9f };
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("the value os the addition of these number is: " + sum);
    }
}*/

//problem 2 (write a program to find our a given integer is present in an array or not
public class arrays_practice_set {
    public static void main(String[] args) {
        float[] marks = {45.0f, 07.4f, 29.8f, 45.7f, 34.9f};
        float num = 34.9f;
        boolean isanarray = false;
        for (float element : marks) {
            if (element == num) {
                isanarray = true;
                break;
            }
        }
        if (isanarray) {
            System.out.println("the is present in the array");
        } else {
            System.out.println("the value is not present in the array");
        }
    }
}
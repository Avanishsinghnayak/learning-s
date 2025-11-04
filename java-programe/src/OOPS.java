
    class Employee{
        int id;
        String name;
        int salary;
        public void printDetails(){
            System.out .println("my ID is "+ id);
            System.out.println("and my name is "+ name);

        }
    }
    public class OOPS {
    public static void main (String [] args) {
        System.out.println("This is our custom class!! ");
        Employee Avanish = new Employee();//Instantiating a new employee object
//setting Attributes
        Avanish.id = 8;
        Avanish.name = "Avanish singh";
        Avanish.salary = 3400000;
        System.out.println(Avanish.salary);
         System.out .println(Avanish.id);
         System.out.println(Avanish.name);
      //Avanish.printDetails();
    }
}

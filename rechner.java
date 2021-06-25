import java.util.Scanner;



public class rechner {
    static int number1;
    static int number2;



    public static void main(String[] args) {
        System.out.println("Welcome to your calculator");
        while (true) {



            Scanner s = new Scanner(System.in);
            System.out.println("Please enter a number:");
            number1 = s.nextInt();
            System.out.println("Please enter another number:");
            number2 = s.nextInt();
            System.out.println(
                    "Which operation do you want to perform?(1=addition,2=subtraktion,3=multiplication,4=divison):");
            int operation = s.nextInt();




            switch (operation) {
                case 1:
                    Addition(number1,number2);
                    break;
                case 2:
                    Subtraktion(number1,number2);
                    break;
                case 3:
                    Multiplikation(number1,number2);
                    break;
                case 4:
                    Division(number1,number2);
                    break;
                default:



                    System.out.println("Illegal Operation.Please enter a valid number");
            }}
    }
    public static int Addition(int a, int b) {
    	int c=a+b;
        System.out.println("The result is: " + c);
        return c;

    }
    public static int Subtraktion(int a, int b) {
    	int c=a-b;
        System.out.println("The result is: " + c);
        return c;
    }
    public static int Multiplikation(int a, int b) {
    	int c=a*b;
        System.out.println("The result is: " + c);
        return c;
    }
    public static int Division(int a, int b) {
    	int c=a/b;
        System.out.println("The result is: " + c);
        return c;
    }
}
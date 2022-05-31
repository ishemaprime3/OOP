
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    Scanner scan = new Scanner(System.in);
    String ch;
    static int a,b,c;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String ch;
       int a;
       int b;
       int c;

        do {
            System.out.print("1. equity \n2. cogebank\n3. i&m\n4. finabank\n\n Choose your company: ");
            ch = scan.nextLine();
            System.out.print("1.Enter your deposit amount: ");
            a = Integer.parseInt(scan.nextLine());
            System.out.print("1.Enter your withdraw amount: ");
            b = Integer.parseInt(scan.nextLine());


            switch (ch) {
                case "1" -> {
                    System.out.println("This is company 1\n");
                    Company comp1 = new Comp1(a, b);
                    System.out.println("Company's interest is: " + company1.interestRate());
                    System.out.println("The minimum duration is 3years");
                    System.out.print("company:" + company1.history());
                    break;


                    case "2" -> {
                        System.out.println("This is company 2\n");
                        Company comp2 = new Comp2(a, b);
                        System.out.println("Company's interest is: " + company2.interestRate());
                        System.out.println("The minimum duration is 4years");
                        break;

                    }

                    case "3" -> {
                        System.out.println("This is company 3\n");
                        Company comp3 = new Comp3(a, b);
                        System.out.println("Company's interest is: " + company3.interestRate());
                        System.out.println("The minimum duration is 1years");
                    }
                    case "4" -> {
                        System.out.println("\nThis is company 4");
                        Company comp4 = new Comp4(a, b);
                        for (String s : Arrays.asList("Company's interest is: " + company4.interestRate(), "The minimum duration is 1year")) {
                            System.out.println(s);
                        }
                    }
                }


                default -> throw new IllegalStateException("Unexpected value: " + ch);
            }
            while (!ch.equals("0")) ;
        }}
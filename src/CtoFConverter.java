import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double cTemp = 0;
        double fTemp = 0;
        boolean done = false;

        String trash = "";

        do{
            System.out.print("please input the temperature in C: ");
            if(in.hasNextDouble())
            {
                cTemp = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.next();
                in.nextLine();
                done = false;
                System.out.println("invalid input detected: " + trash);
            }
        }while(!done);

        System.out.println("you said the temperature in C is: " + cTemp);

        fTemp = (cTemp * 9/5) + 32;

        System.out.println("the temperature in F is: " + fTemp);

    }
}
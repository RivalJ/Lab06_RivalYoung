import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        double meters = 0;
        double inches = 0;
        double miles = 0;
        double feet = 0;
        double M_TO_F = 3.281;
        double F_TO_I = 12;
        double F_TO_MI = 5280;
        String trash = "";
        boolean done = false;


        do{
            System.out.print("please input the number of meters you want to convert: ");

            if(in.hasNextDouble()){
                meters = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else{
                trash = in.next();
                in.nextLine();
                done = false;
                System.out.println("invalid input detected: " + trash);
            }
        }while(!done);

        feet = meters * M_TO_F;
        inches = feet * F_TO_I;
        miles = feet/F_TO_MI;

        System.out.println("# of feet: " + feet);
        System.out.println("# of inches: " + inches);
        System.out.println("# of miles: " + miles);
    }
}

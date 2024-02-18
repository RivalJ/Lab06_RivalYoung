import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double galNum = 0;
        double fuelEfish = 0;
        double pricePergal = 0;

        boolean done = false;
        String trash = "";

        double estimateDist = 0;//variable used for the estimated distance the car can go
        double galUse = 0; //variable used for the estimated gallons used to get to 100 miles
        double totalPrice = 0;


        do{
            System.out.print("please input how many gallons are in the tank: ");

            if(in.hasNextDouble()){
                galNum = in.nextDouble();
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
        done = false;

        do{
            System.out.print("please input how many miles you get per gallon: ");

            if(in.hasNextDouble()){
                fuelEfish = in.nextDouble();
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
        done = false;

        do{
            System.out.print("please input the price of gas per gallon: ");

            if(in.hasNextDouble()){
                pricePergal = in.nextDouble();
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
        done = false;

        System.out.println("");//adds a space in between the sections for readability

        System.out.println("gallons in tank: " + galNum);
        System.out.println("gas mileage: " + fuelEfish);
        System.out.println("gas cost: " + pricePergal);

        System.out.println("");//adds a space in between the sections for readability

        galUse = 100/fuelEfish;
        estimateDist = galNum * fuelEfish;

        if(galUse < galNum)
        {
            System.out.println("you will clear the 100 mile mark without needing to buy more gas");
            System.out.println("you will be able to travel " + estimateDist + "miles");
            totalPrice = galUse * pricePergal;
            System.out.println("the cost of the gas used is: " + totalPrice);
        }
        else
        {
            System.out.println("you will travel " + estimateDist + " miles");
            totalPrice = galUse * pricePergal;
            System.out.println("the cost of the gas used is: " + totalPrice);
        }




    }
}

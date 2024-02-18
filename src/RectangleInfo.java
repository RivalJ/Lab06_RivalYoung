import java.util.Scanner;

import static java.lang.Math.sqrt;

public class RectangleInfo {
    public static void main(String[] args){
        double width = 0;
        double height = 0;
        double diagonal = 0;
        double area = 0;
        double perimiter = 0;

        boolean done = false;
        String trash = "";
        Scanner in = new Scanner(System.in);
        System.out.println("welcome to rectangle info calculator!");
        do{//start of width input
            System.out.print("please input the width: ");
            if(in.hasNextDouble()){
                width = in.nextDouble();
                in.nextLine();
                done = true;
                System.out.println("you said the width is: " + width);
            }else{
                trash = in.next();
                in.nextLine();
                done = false;
                System.out.println("invalid input detected " + trash);
            }

        }while(!done);//end of width input
        done = false;
        do{//start of height input
            System.out.print("please input the height: ");
            if(in.hasNextDouble()){
                height = in.nextDouble();
                in.nextLine();
                done = true;
                System.out.println("you said the width is: " + height);
            }else{
                trash = in.next();
                in.nextLine();
                done = false;
                System.out.println("invalid input detected " + trash);
            }

        }while(!done);//end of height input

        perimiter = (width*2) + (height*2);
        area = height*width;
        diagonal = sqrt((Math.pow(height, 2) + Math.pow(width, 2)));

        System.out.println("the perimiter is " + perimiter);
        System.out.println("the area is " + area);
        System.out.println("the diagonal is " + diagonal);

    }
}

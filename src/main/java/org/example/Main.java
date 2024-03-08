package org.example;
import java.util.Scanner;

public class Main implements IInfinity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();

        //Phrase For 50
        System.out.print("Enter your phrase: ");
        main.PhraseFor(scanner.nextLine());
        System.out.println("\n");

        //Phrase For 50
        System.out.print("Enter your phrase: ");
        main.PhraseWhile(scanner.nextLine());
        System.out.println("\n");

//        //TwoMinutesFor
//        System.out.println("What`s the time?");
//        main.TwoMinutesFor();
//        System.out.println("\n");
//
//        //TwoMinutesWhile
//        System.out.println("What`s the time? Again?");
//        main.TwoMinutesWhile();
//        System.out.println("\n");
//
//        //TwoHoursFor
//        System.out.println("What`s the hour?");
//        main.TwoHoursFor();
//        System.out.println("\n");

        //TwoMinutesFor
        System.out.println("Time to calculate the function)");
        System.out.print("Enter min and max of interval: ");
        main.FunctionFor(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("\n");

        //TwoMinutesWhile
        System.out.println("Time to calculate the function) AGAIN WITH WHILE FUNCTION!!!");
        System.out.print("Enter min and max of interval... AGAIN!!! ");
        main.FunctionWhile(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("\n");
    }

    @Override
    public void PhraseFor(String buffer) {
        for(int i = 1; i != 51; i++){
            System.out.println(buffer + " " + (i));
        }
    }

    @Override
    public void PhraseWhile(String buffer) {
        int i = 1;
        while(i != 51){
            System.out.println(buffer + " " + (i));
            i++;
        }
    }

    @Override
    public void TwoMinutesFor() {
        for(int min = 0; min != 180; min++){
            System.out.println((min / 60) + " hour " + min + " min");
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void TwoMinutesWhile() {
        int min = 0;
        while(min != 180){
            System.out.println((min / 60) + " hour " + min + " min");
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            min++;
        }
    }

    @Override
    public void TwoHoursFor() {
        for(int min = 0; min != 10800; min++) {
            System.out.println(((min / 3600) % 60) + " hour " + ((min / 60) % 6) + " min" + (min % 60));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void FunctionFor(double min, double max) {
        double f = 0;
        for(double x = min; x <= max; x += 0.1){
            f = (x + 2 * x * x * x + 1.9)/(Math.sqrt(x - 1.5));
            System.out.println(f);
        }
    }

    @Override
    public void FunctionWhile(double min, double max){
        double x = min, f = 0;
        while(x <= max){
            f = (x + 2 * x * x * x + 1.9)/(Math.sqrt(x - 1.5));
            System.out.println(f);
            x += 0.1;
        }
    }
}
import java.util.Scanner;

public class ComputerGuesses {

        public static void main(String[] args) {
            System.out.println("Hi there!! Whats your name?");
            Scanner we = new Scanner(System.in);
            String name = we.nextLine();
            System.out.println("Hiya " + name + "! Nice to meet you! Lets play the guessing game");
            int x = 50;
            System.out.println("Is your number " + x + " ?");
            Scanner in = new Scanner(System.in);
            String y = in.nextLine();
            int max=100;
            int min=1;
            double w =Math.random();

            while (!y.equals("yes")) {
                if (y.equals("higher")) {
                    System.out.println("Is your number" + x + "?");
                    y = in.nextLine();
                    min=x+1;

                }
                if (y.equals ("lower")) {
                        System.out.println("Is your number" + x + "?");
                     y = in.nextLine();
                     max= x-1;

                }
                w =Math.random();
                x = (int) (w*(max-min)+min);

            }
            if (y.equals ("yes")){
                System.out.println("They call me the best guesser around!!");
            }


            }
        }

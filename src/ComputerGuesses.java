import java.util.Scanner;

public class ComputerGuesses {

        public static void main(String[] args) {
            System.out.println("Hi there!! Whats your name?");
            Scanner we = new Scanner(System.in);
            String name = we.nextLine();
            System.out.println("Hiya " + name + "! Nice to meet you! Lets play the guessing game");
            int x = (int) (Math.random() * 51);
            System.out.println("Is your number " + x + " ?");
            Scanner in = new Scanner(System.in);
            String y = in.nextLine();
            while (!y.equals("yes")) {
                if (y.equals("higher")) {
                    x = (int) (Math.random() * (51 + 5));
                    System.out.println("Is your number" + x + "?");
                    y = in.nextLine();
                }
                if (y.equals ("lower")) {
                        x = (int) (Math.random() * (51 - 5));
                        System.out.println("Is your number" + x + "?");
                     y = in.nextLine();

                }


            }
            if (y.equals ("yes")){
                System.out.println("They call me the best guesser around!!");
            }

            }
        }

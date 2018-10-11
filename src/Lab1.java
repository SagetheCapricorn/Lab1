import java.util.Scanner;

public class Lab1 {

    public static void main(String [] args){
        System.out.println("Hi there!! Whats your name?");
        Scanner we=new Scanner(System.in);
        String name= we.nextLine();
        System.out.println("Hiya "+ name+ "! Nice to meet you!");
        int x= (int)(Math.random()*101);
        Scanner in= new Scanner(System.in);
        System.out.println("Guess my hidden number!!");
        int y = in.nextInt();
        while(y != x){
            System.out.println("Sorry "+name+ ":( Please Guess Again!");
            y = in.nextInt();
        }
        System.out.println("Congrats you're a great guesser!!!");
    }
}

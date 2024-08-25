import java.util.Scanner;

public class demoProgram1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if(number>6){
            System.out.println("You won the game");
        }
        else {
            System.out.println("You lost the game");
        }


    }
}

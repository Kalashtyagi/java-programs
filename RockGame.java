import java.util.Scanner;
import java.util.Random;
public class RockGame
{

public static void main(String[] args) {

        for(int i=0;i<5;i++)
		{
        System.out.println("\nAttention please!\n________________ \nNow we are going  to play Rock Paper Scissor.");
        System.out.println("\nPlease choose:-\n\t 0 for Rock\n\t 1 for Paper\n\t 2 for Scissor");

        Scanner sc = new Scanner(System.in);
        Random ra = new Random();

        System.out.print("\nIt's your turn: ");
        int user_input = sc.nextInt();
        switch (user_input) {
            case 0: System.out.println("You selected Rock.");
			break;
            case 1: System.out.println("You selected Paper.");
			break;
            case 2: System.out.println("You selected Scissor.");
			break;
        }

        System.out.print("\nIt's computer's turn: ");
        int computer_input = ra.nextInt(3);
        System.out.println(computer_input);
        switch (computer_input) {
            case 0 -> System.out.println("Computer selected Rock.");
            case 1 -> System.out.println("Computer selected Paper.");
            case 2 -> System.out.println("Computer selected Scissor.");
        }

        if (user_input == computer_input) {
            System.out.println("Match Draw!");
        }
        else if ((user_input == 0 && computer_input == 2) || (user_input == 1 && computer_input == 0) || (user_input == 2 && computer_input == 1)) {
            System.out.println("\nCongratulations, You won!");
        }
        else {
            System.out.println("\nYou lose! Better luck next time.\n");
        }
		}
		  
    }
}
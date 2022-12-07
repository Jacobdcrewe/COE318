package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

  @Override
    public void display() {
        //FIX THIS
        System.out.println("House holds:\n" + this.game.getHouseCards().toString());
        System.out.println("You Hold:\n" + this.game.getYourCards().toString());
    }

  @Override
    public boolean hitMe() {
        //FIX THIS
        System.out.println("Another card? (y/n): ");
        String option = user.next();
        boolean choice = false;
        switch(option) {
            case "n":
                choice = false;
                break;
            case "y":
                choice = true;
                break;
            default:
                System.out.println("Please enter 'y' or 'n' to choose yes or no.");
                hitMe();
        }
        return choice;
    }

  @Override
    public void gameOver() {
        //FIX THIS
        this.display();
        int you = game.score(game.getYourCards());
        int house = game.score(game.getHouseCards());
        System.out.println("Your Score: " + you + ", House Score: " + house);
        if((you>house || house >21) && you <=21) {
            System.out.println("You Win!");
        } else {
            System.out.println("House Wins!");
        }
    }

}
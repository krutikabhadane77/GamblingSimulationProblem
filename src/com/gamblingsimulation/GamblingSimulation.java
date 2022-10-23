//UC1 As a gambler,would start with a stake of $100 every day and bet $1 every game.
//UC2 As a gambler make $1 bet so either win or loose $1.
//UC3 As a calculative gambler if won or lost 50% of the stake, would resign for the day.
package com.gamblingsimulation;
import java.lang.Math;
import java.util.Random;

public class GamblingSimulation {
    final int bet = 1;
    final int stake = 100;
    final int wins = 0;
    final int losses = 0;
    final int count = 0;


    public static void main(String[] args) {
        GamblingSimulation gambling = new GamblingSimulation();
        System.out.println("Welcome to Gambling Simulation Problem");
        System.out.println("stake per day of gambler is " + gambling.stake + " and bet is " + gambling.bet);
        playGame(gambling, gambling.bet, gambling.stake, gambling.wins, gambling.losses);
    }


    public static void playGame(GamblingSimulation gambling, int bet, int stake, int wins, int looses) {
        while(stake!=0){
            Random random = new Random();
            int game = random.nextInt(2);
            if (game == 0) {
                stake -= gambling.bet;
                looses += 1;
                System.out.println("Gambler loose the bet");
                if (looses == 50) {
                    System.out.println("Gambler reached max losses");
                    break;
                }
            } else {
                stake += gambling.bet;
                System.out.println("Gambler won the bet");
                wins += 1;
                if (wins == 50) {
                    System.out.println("Gambler reached max wins");
                    break;
                }
            }
        }
        System.out.println("Total wins "+wins);
        System.out.println("Total looses "+looses);
    }
}
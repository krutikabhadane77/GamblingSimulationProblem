//UC1 As a gambler,would start with a stake of $100 every day and bet $1 every game.
//UC2 As a gambler make $1 bet so either win or loose $1.
//UC3 As a calculative gambler if won or lost 50% of the stake, would resign for the day.
//UC4 After 20 days of playing every day would like to know the total amount won or lost.
package com.gamblingsimulation;
import java.util.Random;

public class GamblingSimulation {
    final int bet = 1;
    final int stake = 100;
    final int dayWin = 0;
    final int totalWin=0;
    public static void main(String[] args) {
        GamblingSimulation gambling = new GamblingSimulation();
        System.out.println("Welcome to Gambling Simulation Problem");
        System.out.println("stake per day of gambler is " + gambling.stake + " and bet is " + gambling.bet);
        playGame(gambling, gambling.bet, gambling.stake, gambling.dayWin, gambling.totalWin);
    }


    public static void playGame(GamblingSimulation gambling, int bet, int stake, int dayWin, int totalWin) {
        for (int day = 0; day <= 20; day++) {
            while (stake != 50 && stake != 150) {
                Random random = new Random();
                int game = random.nextInt(2);
                if (game == 0) {
                    stake -= gambling.bet;
                    System.out.println("Gambler loose the bet");
                } else {
                    stake += gambling.bet;
                    System.out.println("Gambler won the bet");
                }
            }
            dayWin = stake - 100;
            System.out.println("Amount won for the day " +day+ "is " +dayWin);
            totalWin += dayWin;
        }
        System.out.println("Total amount won for 20 days is : "+totalWin);
    }
}
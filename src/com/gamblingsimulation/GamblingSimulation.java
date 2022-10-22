//UC1 As a gambler,would start with a stake of $100 every day and bet $1 every game.
//UC2 As a gambler make $1 bet so either win or loose $1.
package com.gamblingsimulation;
import java.lang.Math;
import java.util.Random;

public class GamblingSimulation {
    final int bet=1;
    final int stakePerDay=100;
    public static void main(String[] args){
        GamblingSimulation gambling=new GamblingSimulation();
        System.out.println("Welcome to Gambling Simulation Problem");
        System.out.println("stake per day of gambler is "+gambling.stakePerDay+" and bet is "+gambling.bet);
        playGame(gambling);
    }

    public static void playGame(GamblingSimulation gambling){
        Random random=new Random();
        int stake=0;
        int bet=random.nextInt(2);
        if (bet==1) {
            System.out.println("Gambler won the bet");
            stake += gambling.bet;
        }
        else
        {
            stake -= gambling.bet;
            System.out.println("Gambler loose the bet");
        }
    }
}

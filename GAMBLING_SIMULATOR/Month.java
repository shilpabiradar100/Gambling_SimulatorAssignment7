package GAMBLING_SIMULATOR;
import java.util.*;
public class Month {
    static void gamble(int noOfTimes, int $Stack, int $Goal) {
        int bets = 0; // total number of bets made
        int wins = 0; // total number of games won
        for (int i = 0; i < noOfTimes; i++) {
            int cash = $Stack;
            while (cash > 0 && cash < $Goal) {
                bets++;
                if (Math.random() < 0.5)
                    cash++; // win $1
                else
                    cash--; // lose $1
            }
            if (cash == $Goal)
                wins++; // to find no. of wins
        }
        // print results
        System.out.println();
        System.out.println(wins + " wins out of of " + noOfTimes);
        double perWon=100.0 * wins / noOfTimes;
        double perLoss= 100.0 * (noOfTimes - wins) / noOfTimes;
        System.out.println("Percent of games won = " + perWon);
        System.out.println("Percent of games lost = " +perLoss);
        System.out.println("Total bets in " + noOfTimes + " games = " + bets);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n, $stack, $goal;
       /* System.out.println("As a Gambler, would start with a stake of $100 every day and bet $1 every game. If Yes then type Yes else No type:");
        String answer= sc.next();
        if(answer=="Yes")
        {
            System.out.println("Welcome to Gambling World");
        }
        else
        {
            System.exit(0);
        }*/
        System.out.println("As a Gambler make $1 bet so either win or loose $1:");
        $stack = sc.nextInt();
        System.out.println("enter goal amount");
        $goal = sc.nextInt();
        gamble(20, $stack, $goal);
        gamble(30, $stack, $goal);

    }
}

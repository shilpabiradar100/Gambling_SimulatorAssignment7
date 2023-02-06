package GAMBLING_SIMULATOR;
import java.util.*;
public class LuckyDays {
    static int counter = 2;

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
        double perWon = 100.0 * wins / noOfTimes;
        double perLoss = 100.0 * (noOfTimes - wins) / noOfTimes;
        perWon = 100.0 * wins / noOfTimes;
         perLoss = 100.0 * (noOfTimes - wins) / noOfTimes;
        System.out.println("Percent of games won = " + perWon);
        System.out.println("Percent of games lost = " + perLoss);
        System.out.println("Percent of games lost = " + perLoss);
        System.out.println("Total bets in " + noOfTimes + " games = " + bets);

    }

    static boolean isLuckyDay(int n) {

        if (counter > n)
            return true;
        if (n % counter == 0)
            return false;
        int next_position = n - (n / counter);   /*calculate next position of input no.Variable "next_position" is just for
        readability of the program we can remove it and update in "n" only */
        counter++;
        return isLuckyDay(next_position);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);
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
        System.out.println("Enter the goal amount");
        $goal = sc.nextInt();
        gamble(30, $stack, $goal);
        System.out.println("Enter the no of days");
        n = sc.nextInt();
        gamble(n, $stack, $goal);
        if (isLuckyDay(n))
            System.out.println(n + " is a lucky days.");
        else
            System.out.println(n + " is not a lucky days.");

    }
}
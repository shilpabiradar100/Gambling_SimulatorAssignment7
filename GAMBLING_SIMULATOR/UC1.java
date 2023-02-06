package GAMBLING_SIMULATOR;
import java.util.Scanner;
public class UC1 {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("As a Gambler, would start with a stake of $100 every day and bet $1 every game. If Yes then type Yes else No type:");
            String answer= sc.next();
            if(answer=="Yes")
            {
                System.out.println("Welcome to Gambling World");
            }
            else
            {
                System.exit(0);
            }
        }
    }


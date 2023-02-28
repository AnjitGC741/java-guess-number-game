import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner userChoice = new Scanner(System.in);
        Scanner guessNumber = new Scanner(System.in);
        Scanner quit = new Scanner(System.in);
        Scanner decision = new Scanner(System.in);
        while(true)
        {
            System.out.println("**Welcome to guessing number game**");
            System.out.println();
            System.out.println("Enter game mode");
            System.out.println("1.Hard (guessing number range is between 1-100)");
            System.out.println("2.Medium (guessing number range is between 1-50)");
            System.out.println("3.Easy (guessing number range is between 1-25)");
            System.out.println("4.Customize (choose the number range by yourself)");
            System.out.println("5.Exist the game");
            System.out.print("So what have you choose:- ");
            int input = userChoice.nextInt();
            switch (input)
            {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        System.out.println();
                    }
                    System.out.println("Oh!You have decided to play hard mode, read some rules before playing game.");
                    System.out.println("Rules:-");
                    System.out.println("1.You have only 5 guess to make");
                    System.out.println("2.At beginning you have 40 point total. After every wrong guess 7 point will be reduced.");
                    System.out.print("Are you ready(y/n):- ");
                    char playerDecision = decision.next().charAt(0);
                    for (int i = 0; i < 10; i++) {
                        System.out.println();
                    }
                    if(playerDecision == 'y')
                    {
                        System.out.println("Guess number between 1-100");
                        //generate the random number
                        int totalPoint = 40;
                        int flag =0;
                        Random rand = new Random();
                        int randomNum = rand.nextInt(100) + 1;
                        System.out.println("lets the game begin");
                        for(int i=1;i<=5;i++)
                        {
                            System.out.print("Guess number "+ i +":- ");
                            int userGuessNumber = guessNumber.nextInt();
                            if(userGuessNumber == randomNum)
                            {
                                System.out.println("Congratulation!! you got the number.");
                                flag = 1;
                                break;
                            }
                            else {
                                totalPoint = totalPoint - 7;
                                if(i!=5)
                                {
                                    if(userGuessNumber > randomNum)
                                    {
                                        if((userGuessNumber-randomNum) > 20)
                                        {
                                            System.out.println("You are guessing too much higher, go low");
                                        }
                                        else if((userGuessNumber - randomNum) < 10)
                                        {
                                            System.out.println("You are little to higher,go low ");
                                        }
                                        else {
                                            System.out.println("You are middley higher,go low");
                                        }
                                    }
                                    else {
                                        if((randomNum - userGuessNumber) > 20){
                                            System.out.println("You are guessing too much lower, go high");
                                        }
                                        else if((randomNum - userGuessNumber) < 10){
                                            System.out.println("You are little to lower,go high");
                                        }
                                        else {
                                            System.out.println("You are middley lower,go high");
                                        }
                                    }
                                }
                            }
                        }
                        if(flag == 0)
                        {
                            System.out.println("The number was "+ randomNum);
                        }
                        else
                        {
                            System.out.println("You got "+totalPoint+" points out of 40");
                        }
                        System.out.println("Enter 1 to exist the game and other to continue :- ");
                        int quitGame = quit.nextInt();
                        if(quitGame == 1)
                        {
                            System.exit(0);
                        }


                    }
                    else
                    {
                        System.out.println("See you next time");
                        System.exit(0);
                    }


                    break;
                case 2:
                    for (int i = 0; i < 5; i++) {
                        System.out.println();
                    }
                    System.out.println("Oh!You have decided to play medium mode, read some rules before playing game.");
                    System.out.println("Rules:-");
                    System.out.println("1.You have only 7 guess to make");
                    System.out.println("2.At beginning you have 40 point total. After every wrong guess 5 point will be reduced.");
                    System.out.print("Are you ready(y/n):- ");
                    char playerDecision2 = decision.next().charAt(0);
                    for (int i = 0; i < 5; i++) {
                        System.out.println();
                    }
                    if(playerDecision2 == 'y')
                    {
                        System.out.println("Guess number between 1-50");
                        //generate the random number
                        int totalPoint = 40;
                        int flag =0;
                        Random rand = new Random();
                        int randomNum = rand.nextInt(50) + 1;
                        System.out.println("lets the game begin");
                        for(int i=1;i<=7;i++)
                        {
                            System.out.print("Guess number "+ i +":- ");
                            int userGuessNumber = guessNumber.nextInt();
                            if(userGuessNumber == randomNum)
                            {
                                System.out.println("Congratulation!! you got the number.");
                                flag = 1;
                                break;
                            }
                            else {
                                totalPoint = totalPoint - 5;
                                if(i!=7)
                                {
                                    if(userGuessNumber > randomNum)
                                    {
                                        if((userGuessNumber-randomNum) > 10)
                                        {
                                            System.out.println("You are guessing too much higher, go low");
                                        }
                                        else if((userGuessNumber - randomNum) < 5)
                                        {
                                            System.out.println("You are little to higher,go low ");
                                        }
                                        else {
                                            System.out.println("You are middley higher,go low");
                                        }
                                    }
                                    else {
                                        if((randomNum - userGuessNumber) > 10){
                                            System.out.println("You are guessing too much lower, go high");
                                        }
                                        else if((randomNum - userGuessNumber) < 5){
                                            System.out.println("You are little to lower,go high");
                                        }
                                        else {
                                            System.out.println("You are middley lower,go high");
                                        }
                                    }
                                }
                            }
                        }
                        if(flag == 0)
                        {
                            System.out.println("The number was "+ randomNum);
                        }
                        else
                        {
                            System.out.println("You got "+totalPoint+" points out of 40");
                        }
                        System.out.println("Enter 1 to exist the game and other to continue :- ");
                        int quitGame = quit.nextInt();
                        if(quitGame == 1)
                        {
                            System.exit(0);
                        }

                    }
                    else
                    {
                        System.out.println("See you next time");
                        System.exit(0);
                    }
                    break;
                case 3:
                    for (int i = 0; i < 5; i++) {
                        System.out.println();
                    }
                    System.out.println("Oh!You have decided to play easy mode, read some rules before playing game.");
                    System.out.println("Rules:-");
                    System.out.println("1.You have only 10 guess to make");
                    System.out.println("2.At beginning you have 40 point total. After every wrong guess 4 point will be reduced.");
                    System.out.print("Are you ready(y/n):- ");
                    char playerDecision3 = decision.next().charAt(0);
                    for (int i = 0; i < 10; i++) {
                        System.out.println();
                    }
                    if(playerDecision3 == 'y')
                    {
                        System.out.println("Guess number between 1-25");
                        //generate the random number
                        int totalPoint = 40;
                        int flag =0;
                        Random rand = new Random();
                        int randomNum = rand.nextInt(25) + 1;
                        System.out.println("lets the game begin");
                        for(int i=1;i<=10;i++)
                        {
                            System.out.print("Guess number "+ i +":- ");
                            int userGuessNumber = guessNumber.nextInt();
                            if(userGuessNumber == randomNum)
                            {
                                System.out.println("Congratulation!! you got the number.");
                                flag = 1;
                                break;
                            }
                            else {
                                totalPoint = totalPoint - 4;
                                if(i!=10)
                                {
                                    if(userGuessNumber > randomNum)
                                    {
                                        if((userGuessNumber-randomNum) > 5)
                                        {
                                            System.out.println("You are guessing too much higher, go low");
                                        }
                                        else if((userGuessNumber - randomNum) < 2)
                                        {
                                            System.out.println("You are little to higher,go low ");
                                        }
                                        else {
                                            System.out.println("You are middley higher,go low");
                                        }
                                    }
                                    else {
                                        if((randomNum - userGuessNumber) > 5){
                                            System.out.println("You are guessing too much lower, go high");
                                        }
                                        else if((randomNum - userGuessNumber) < 2){
                                            System.out.println("You are little to lower,go high");
                                        }
                                        else {
                                            System.out.println("You are middley lower,go high");
                                        }
                                    }
                                }
                            }
                        }
                        if(flag == 0)
                        {
                            System.out.println("The number was "+ randomNum);
                        }
                        else
                        {
                            System.out.println("You got "+totalPoint+" points out of 40");
                        }
                        System.out.println("Enter 1 to exist the game and other to continue :- ");
                        int quitGame = quit.nextInt();
                        if(quitGame == 1)
                        {
                            System.exit(0);
                        }

                    }
                    else
                    {
                        System.out.println("See you next time");
                        System.exit(0);
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Bro choose only given option");
                    System.exit(0);
            }


        }
    }
}
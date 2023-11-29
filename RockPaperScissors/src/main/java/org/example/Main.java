package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your name");
        String name=scanner.next();
        RockPaperScissorGame rockPaperScissorGame=new RockPaperScissorGame(name);
        System.out.println("you will have three rounds with computer ,"+name);

        for (int i = 1; i <= 3; i++) {

            System.out.println("Round "+i);

            RockPaperScissorGame.printOptions();

            int userOption=scanner.nextInt();

      //      rockPaperScissorGame.play(userOption);


        }
        rockPaperScissorGame.showResult();


    }
}
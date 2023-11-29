package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class RockPaperScissorGame {
    private final String playerName;
    private int score;
    private static final List<String> OPTIONS=new ArrayList<>(Arrays.asList("rock","paper","scissor"));
    public RockPaperScissorGame(String playerName)
    {
        this.playerName=playerName;

    }

    public int getScore() {
        return score;
    }

    public String getPlayerName() {
        return playerName;
    }
    public void play(int indexOfOption)
    {
        indexOfOption--;
        int computerOption= (int) (Math.random() * 3);

        if(OPTIONS.get(computerOption).equals("rock") && OPTIONS.get(indexOfOption).equals("paper")
        || OPTIONS.get(computerOption).equals("paper") && OPTIONS.get(indexOfOption).equals("scissor")
        || OPTIONS.get(computerOption).equals("scissor") && OPTIONS.get(indexOfOption).equals("rock") )
        {
            score++;
        }
      //  printMoves(OPTIONS.get(computerOption),OPTIONS.get(indexOfOption));

    }
    /*private void printMoves(String computerMove, String userMove)
    {
        System.out.println("computer : "+computerMove+"\n"+playerName+
                           " : "+userMove );
    }*/

    public static void printOptions()
    {
        for (int i = 0; i < 3; i++) {
            System.out.println( (i+1)+". "+OPTIONS.get(i));
        }
        System.out.println("Enter your choice (1, 2, or 3):");
    }

    public void showResult()
    {
        if(score>=2)
        {
            System.out.println("you win "+(3-score)+"-"+score);
        }
        else{
            System.out.println("you lose "+(4-score)+"-"+score);
        }
    }




}

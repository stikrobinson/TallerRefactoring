/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerrefactoring;
import com.mycompany.tallerrefactoring.Choices.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author CltControl
 */
// Simulate a game of Rock, Paper, Scissors
public class RPSGame {
    public static void main(String args[]) {
        
        Player p1 = new RPSPlayer();
        Player p2 = new OnlyRockPlayer();
        
        int roundsToWin = 3;
        int roundsPlayed = 0;     // Number of rounds played
        int draws = 0;
        Choice p1Choice;
        Choice p2Choice;
        
        ArrayList<Choice> possibleChoices = new ArrayList<>(List.of(new Rock(), new Paper(), new Scissors()));

        // Game Loop
        do {
            roundsPlayed++;
            
            System.out.println("***** Round: " + roundsPlayed + " *****\n");
            System.out.println("Number of Draws: " + draws + "\n");
            
            //Player1
            p1Choice = p1.playerChoice(possibleChoices);            
            System.out.println("Player 1: " + p1Choice +
                               "  Player 1 Total Wins: " + p1.getWins());
            
            //Player2
            p2Choice = p2.playerChoice(possibleChoices);
            System.out.println("Player 2: " + p2Choice +
                               "  Player 2 Total Wins: " + p2.getWins());

            //Deciding the winner
            if(p1Choice.drawsAgainst(p2Choice)){
                draws++;
                System.out.println("\t\tDraw\n\n");
            }
            
            else{
                if(p1Choice.winsAgainst(p2Choice)){
                    p1.win();
                    System.out.println("Player 1 Wins\n\n");
                }
                else{
                    p2.win();
                    System.out.println("Player 2 Wins\n\n");
                }
            }
                        
        } while (p1.getWins() < roundsToWin && p2.getWins() < roundsToWin);
    
        System.out.println("GAME WON!");
        if(p1.getWins() >= roundsToWin) System.out.println("Player 1 Wins");
        else System.out.println("Player 2 Wins");
    }
}


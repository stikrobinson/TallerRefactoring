/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerrefactoring;
import com.mycompany.tallerrefactoring.Choices.*;
/**
 *
 * @author CltControl
 */
// Simulate a game of Rock, Paper, Scissors
public class RPSGame {
    public static void main(String args[]) {
        
        Player p1 = new Player();
        Player p2 = new Player();
        boolean gameWon = false;
        int roundsPlayed = 0;     // Number of rounds played
        int p1wins = p1.wins;
        int p2wins = p2.wins;
        int draw = 0;
        String p1Choice;
        String p2Choice;

        // Game Loop
        do {
            System.out.println("***** Round: " + roundsPlayed + " *****\n");
            System.out.println("Number of Draws: " + draw + "\n");
            p1Choice = p1.playerChoice();
            System.out.println("Player 1: " + p1Choice +
                               "  Player 1 Total Wins: " + p1wins);
            p2Choice = p2.playerChoice();
            System.out.println("Player 2: " + p2Choice +
                               "  Player 2 Total Wins: " + p2wins);

            if (p1Choice.equals("rock") && p2Choice.equals("paper")) {
                System.out.println("Player 2 Wins!");
                p2wins = p2.setWins();
            } else if (p1Choice.equals("paper") && p2Choice.equals("rock")) {
                System.out.println("Player 1 Wins!");
                p1wins = p1.setWins();
            } else if (p1Choice.equals("scissors") && p2Choice.equals("rock")) {
                System.out.println("Player 2 Wins!");
                p2wins = p2.setWins();
            } else if (p1Choice.equals("rock") && p2Choice.equals("scissors")) {
                System.out.println("Player 1 Wins!");
                p1wins = p1.setWins();
            } else if (p1Choice.equals("scissors") && p2Choice.equals("paper")) {
                System.out.println("Player 1 Wins!");
                p1wins = p1.setWins();
            } else if (p1Choice.equals("paper") && p2Choice.equals("scissors")) {
                System.out.println("Player 2 Wins!");
                p2wins = p2.setWins();
            }

            if (p1Choice.equals(p2Choice)) {
                draw++;
                System.out.println("\n\t\t Draw \n");
            }

            roundsPlayed++;
            if ((p1.getWins() >= 3) || (p2.getWins() >= 3)) {
                System.out.println("GAME WON!");
                gameWon = true;
            }
        } while (gameWon != true);
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerrefactoring;
import com.mycompany.tallerrefactoring.ChoiceGenerators.ChoiceGenerator;
import com.mycompany.tallerrefactoring.Choices.*;
import com.mycompany.tallerrefactoring.ChoiceGenerators.*;

/**
 *
 * @author CltControl
 */
class Player {
    int wins;       // # of wins
    int winTotal;
    private ChoiceGenerator cg;

    // Randomly choose rock, paper, or scissors
    public Choice playerChoice() {
        return cg.generateChoice();
    }

    public int setWins() {
        int winTotal = wins++;
        return winTotal;
    }

    public int getWins() {
        return(wins);
    }
}

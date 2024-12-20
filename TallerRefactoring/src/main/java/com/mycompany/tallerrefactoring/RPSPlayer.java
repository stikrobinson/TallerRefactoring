/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.tallerrefactoring;

import com.mycompany.tallerrefactoring.Choices.*;
import com.mycompany.tallerrefactoring.ChoiceGenerators.*;
import java.util.List;
/**
 *
 * @author CltControl
 */
public class RPSPlayer implements Player{
    private int wins;
    private ChoiceGenerator cg;
    
    public RPSPlayer(){
        wins = 0;
        cg = new DefaultChoiceGenerator();
    }
    
    @Override
    public int getWins() {
        return wins;
    }

    @Override
    public void win() {
        wins++;
    }

    @Override
    public Choice playerChoice(List<Choice> options) {
        return cg.generateChoice(options);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.tallerrefactoring;

import com.mycompany.tallerrefactoring.Choices.*;
import java.util.List;
/**
 *
 * @author CltControl
 */
public class OnlyRockPlayer implements Player{
    private int wins;
    
    public OnlyRockPlayer(){
        wins = 0;
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
        return new Rock();
    }
    
}

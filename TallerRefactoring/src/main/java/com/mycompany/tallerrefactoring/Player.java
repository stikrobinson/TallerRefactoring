/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerrefactoring;
import com.mycompany.tallerrefactoring.Choices.*;
import java.util.List;

/**
 *
 * @author CltControl
 */
public interface Player {
    public int getWins();
    public void win();
    public Choice playerChoice(List<Choice> options);
}

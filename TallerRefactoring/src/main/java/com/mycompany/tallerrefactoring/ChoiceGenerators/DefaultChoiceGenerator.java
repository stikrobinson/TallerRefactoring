/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerrefactoring.ChoiceGenerators;

import com.mycompany.tallerrefactoring.Choices.Choice;
import java.util.List;
import java.util.Random;

/**
 *
 * @author sebsm
 */
public class DefaultChoiceGenerator implements ChoiceGenerator{

    @Override
    public Choice generateChoice(List<Choice> options) {
        Random random = new Random();
        return options.get( random.nextInt( options.size() ) );
    }
    
}

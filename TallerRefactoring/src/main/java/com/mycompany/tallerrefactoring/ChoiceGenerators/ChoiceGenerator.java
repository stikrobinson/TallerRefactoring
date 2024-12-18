/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.tallerrefactoring.ChoiceGenerators;

import com.mycompany.tallerrefactoring.Choices.Choice;
import java.util.Random;

/**
 *
 * @author CltControl
 */
public abstract class ChoiceGenerator {
    public Choice generateChoice(ArrayList<Choice> options){
        return Random.choice(options);
    }
}

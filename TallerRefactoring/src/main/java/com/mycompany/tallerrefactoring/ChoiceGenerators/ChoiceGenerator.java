/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.tallerrefactoring.ChoiceGenerators;

import com.mycompany.tallerrefactoring.Choices.Choice;
import java.util.List;
import java.util.Random;

/**
 *
 * @author CltControl
 */
public interface ChoiceGenerator {
    public Choice generateChoice(List<Choice> options);
}

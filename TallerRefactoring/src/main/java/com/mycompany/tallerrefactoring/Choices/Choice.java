/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.tallerrefactoring.Choices;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CltControl
 */
public abstract class Choice {
    private String name;
    private ArrayList<String> winsAgainst;
    
    public Choice(String n, List<String> w){
        name = n;
        winsAgainst = new ArrayList<>(w);
    }
    
    public String getName(){
        return name;
    }
    
    public boolean winsAgainst(String c){
        return winsAgainst.contains(c);
    }
    public boolean drawsAgainst(Choice c){
        return name.equals(c.getName());
    }
}

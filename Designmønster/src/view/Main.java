package view;

import model.CrossbowMan;
import model.InfantryUnit;
import model.Musketeer;
import model.RockHauler;
import model.SpearThrower;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MouNj
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CrossbowMan crossbowMan = new CrossbowMan(2, 5, 20, 3);
        Musketeer musketeer = new Musketeer(3, 7, 25, 5);
        RockHauler rockHauler = new RockHauler(5, 10, 15, 6);
        SpearThrower spearThrower = new SpearThrower(4, 15, 30, 2);
        
        musketeer.attack(crossbowMan); // Musketeer
        spearThrower.attack(rockHauler);
        crossbowMan.setName("cross");
        rockHauler.setName("rock");
        musketeer.setName("musk");
        spearThrower.setName("sper");
        
        crossbowMan.toString();
        rockHauler.toString();
        
    }
    
}

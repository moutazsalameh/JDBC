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
        CrossbowMan crossbowMan = new CrossbowMan(2, 5, 20, 3,"cross");
        Musketeer musketeer = new Musketeer(3, 7, 25, 5,"musk");
        RockHauler rockHauler = new RockHauler(5, 10, 15, 6,"rock");
        SpearThrower spearThrower = new SpearThrower(4, 15, 30, 2,"sper");

     
        musketeer.attack(crossbowMan); // Musketeer
        spearThrower.attack(rockHauler);
//        
//        crossbowMan.toString();
//        rockHauler.toString();

    }

}

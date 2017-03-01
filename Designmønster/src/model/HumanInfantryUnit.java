/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author MouNj
 */
public class HumanInfantryUnit {

    public InfantryUnit createUnit(int techLevel) {
        InfantryUnit charcter = null;
        switch (techLevel) {
            case 0:
                charcter = new CrossbowMan(2, 5, 20, 3, "Cr");
                charcter.setRace("Human");
                break;
            case 1:
                charcter = new InfantryUnit(2, 5, 20, 3, "IN");
                charcter.setRace("Human");
                break;
            case 2:
                charcter = new RockHauler(2, 5, 20, 3, "RO");
                charcter.setRace("Human");
                break;
            case 3:
                charcter = new SpearThrower(2, 5, 20, 3, "SP");
                charcter.setRace("Human");
                break;

        }
        return charcter;
    }

}

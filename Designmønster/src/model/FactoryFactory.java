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
public class FactoryFactory {

    public InfantryFactory createInfantryFactory(int race) {
        if (race == 1) {
            return new HumanInfantryFactory();
        } else if (race == 2) {
            return new OrcInfantryFactory();
        }
        return null;
    }
}

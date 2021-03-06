package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MouNj
 */
public class InfantryUnit {

    private String name;
    private int range;
    private int armor;
    private int hits;
    private int damage;

    public InfantryUnit(int range, int armor, int hits, int damage , String name) {
        this.range = range;
        this.armor = armor;
        this.hits = hits;
        this.damage = damage;
        this.name=name; 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void takeDamage(int damage) {
        int reduction = (int) (Math.random() * armor);
        if (damage > reduction) {
            hits = hits - (damage - reduction);
        }
        System.out.println("armor took " + reduction + " damage");
    }

    public void attack(InfantryUnit unit) {
        int attackDamage = (int) (Math.random() * damage) + 1;
        unit.takeDamage(attackDamage);
        System.out.println(name + " dealt " + unit.getName());
        System.out.println(unit.name + "__" + attackDamage + " hits romaning :" + unit.hits);
    }

 
}

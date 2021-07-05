package com.company;

public class Main {

    public static void main(String[] args) {
        Character paladin = new Character();
        paladin.setNameAndAge("Gilbert", 25);
        paladin.className = "Paladin";
        paladin.mana = 100;
        paladin.powers = new String[]{"Saint fist", "Power of God", "Stone heart"};

        paladin.speak();
        paladin.spells();

        int newMana1 = paladin.calculateMana();
        System.out.println("Now " + paladin.name + " mana is " + paladin.mana
                + " and after using " +paladin.powers[0] +" it will be " + newMana1);

        System.out.println(" ");

        Character mage = new Character();
        mage.setNameAndAge("Andrew", 17);
        mage.className = "Mage";
        mage.mana = 300;
        mage.powers = new String[]{"Fire blast", "Lightning strike", "Elemental attack"};

        mage.speak();
        mage.spells();
    }
}

class Character{
    String name;
    String className;
    int age;
    String[] powers;
    int mana;

    void speak(){
        System.out.println(name + " is " + className + ", he is " + age + " years old.");
    }

    void spells(){
        System.out.println(name + " can cast such spells as: " + powers[0] +", " + powers[1] + " and " + powers[2] );
    }

    int calculateMana(){
        int newMana = mana - 25;
        return newMana;
    }

    void setNameAndAge(String username, int years){
        name = username;
        age =  years;
    }
}
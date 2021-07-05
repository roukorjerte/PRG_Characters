package com.company;

public class Main {

    public static void main(String[] args) {
        Character paladin = new Character();
        paladin.name = "Gilbert";
        paladin.className = "Paladin";
        paladin.age = 25;
        paladin.powers = new String[]{"Saint fist", "Power of God", "Stone heart"};

        paladin.speak();
        paladin.spells();

        Character mage = new Character();
        mage.name = "Andrew";
        mage.className = "Mage";
        mage.age = 17;
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

    void speak(){
        System.out.println(name +" is " +className +", he is " +age +" years old.");
    }

    void spells(){
        System.out.println(name +" can cast such spells as: " +powers[0] +", " +powers[1] +" and " +powers[2] );
    }
}
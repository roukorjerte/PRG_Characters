package com.company;

public class Main {

    public static void main(String[] args) {
        Character paladin = new Character();
        paladin.setAtributes("", 25, "Paladin", 300);
        paladin.setPowers(new String[]{"Power of God", "Stone heart", "Faith fist"});

        paladin.setHealth(500);
        System.out.println("Using getter in main class " + paladin.getHealth());
        System.out.println(" ");

        paladin.speak();
        paladin.spells();

        paladin.printMana();
        System.out.println(" ");

        Character mage = new Character();
        mage.setAtributes("Andrew", 17, "Mage", 300);
        mage.setPowers(new String[]{"Fire blast", "Lightning strike", "Elemental attack"});

        mage.speak();
        mage.spells();
    }
}

class Character{
    private String name;
    private String className;
    private int age;
    private String[] powers;
    private int mana;
    private int health;

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

    void setAtributes(String username, int years, String characterClass,int manaCount){
        if (username.isEmpty()){
            System.out.println("Please enter character name");
        }
        else
        name = username;
        age =  years;
        className = characterClass;
        mana = manaCount;
    }

    void printMana(){
        int newMana1 = calculateMana();
        System.out.println("Now " + name + " mana is " + mana
                + " and after using " +powers[0] +" it will be " + newMana1);
    }

    public void setPowers(String[] skills) {
        this.powers = skills;
    }

    public void setHealth(int hp){
        health = hp;
    }

    public int getHealth(){
        return health;
    }
}
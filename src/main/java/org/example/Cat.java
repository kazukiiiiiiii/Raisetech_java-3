package org.example;

public class Cat {
    private String name;
    private int age;
    private String color;
    private boolean isInoculation;


    public Cat(String name, int age, String color, boolean isInoculation) {

        this.name = name;
        this.age = age;
        this.color = color;
//        予防接種の有無
        this.isInoculation = isInoculation;

    }


    //ゲッター
    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public boolean isInoculation() {
        return isInoculation;
    }
}

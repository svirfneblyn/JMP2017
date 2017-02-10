package com.rubanovich.jmptasks.duckfamily.Ducks;

import com.rubanovich.jmptasks.duckfamily.Ducks.IModel.Duck;

/**
 * Created by Ihar_Rubanovich on 2/8/2017.
 */
public class QuackDuck extends Duck {

    @Override
    public void swim() {
        System.out.println("Quack Duck SWIM Ability");
    }

    public void quack() {
        System.out.println("Quack Duck QUACK ABILITY");
    }

    @Override
    public void abilitysDemo() {
        swim();
        quack();
    }
}

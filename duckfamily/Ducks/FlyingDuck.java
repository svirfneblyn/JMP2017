package com.rubanovich.jmptasks.duckfamily.Ducks;

import com.rubanovich.jmptasks.duckfamily.Ducks.IModel.Duck;

/**
 * Created by Ihar_Rubanovich on 2/8/2017.
 */
public class FlyingDuck extends Duck {
    @Override
    public void swim() {
        System.out.println("Flying Duck swim ability");
    }

    public void fly() {
        System.out.println("Flying Duck fly ability");
    }

    @Override
    public void abilitysDemo() {
        swim();
        fly();
    }
}

package com.rubanovich.jmptasks.duckfamily.Ducks;

import com.rubanovich.jmptasks.duckfamily.Ducks.IModel.Duck;

/**
 * Created by Ihar_Rubanovich on 2/9/2017.
 */
public class ToyDuck extends Duck {
    @Override
    public void swim() {
        System.out.println("Toy DUCK swim ability");
    }

    public void sing() {
        System.out.println("Toy DUCK sing ability");
    }

    @Override
    public void abilitysDemo() {
        swim();
        sing();
    }
}

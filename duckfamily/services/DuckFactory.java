package com.rubanovich.jmptasks.duckfamily.services;

import com.rubanovich.jmptasks.duckfamily.Ducks.IModel.Duck;
import com.rubanovich.jmptasks.duckfamily.Ducks.FlyingDuck;
import com.rubanovich.jmptasks.duckfamily.Ducks.QuackDuck;
import com.rubanovich.jmptasks.duckfamily.Ducks.ToyDuck;

/**
 * Created by Ihar_Rubanovich on 2/9/2017.
 */
public class DuckFactory {

    public DuckFactory() {
    }

    public Duck getDuck(String typeDuck) {
        Duck duck = null;
        if (typeDuck.equals("quack")) {
            duck = new QuackDuck();
            return duck;
        }
        if (typeDuck.equals("fly")) {
            duck = new FlyingDuck();
            return duck;
        }
        if (typeDuck.equals("toy")) {
            duck = new ToyDuck();
            return duck;
        }
        return duck;
    }
}

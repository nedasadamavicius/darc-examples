package org.example;

import org.example.FlyBehavior.FlyBehavior;
import org.example.FlyBehavior.FlyNoWay;
import org.example.FlyBehavior.FlyWithWings;

public class Main {
    public static void main(String[] args) {
        Duck duck;
        Duck[] ducks = {new RubberDuck(), new DecoyDuck(), new MallardDuck(), new RedheadDuck()};
        FlyBehavior flyBehavior;
        FlyBehavior[] flyBehaviors = {new FlyWithWings(), new FlyNoWay()};

        for(Duck newDuck : ducks) {
            System.out.println("Changing the duck to -> " + newDuck.getClass().getSimpleName());
            duck = newDuck;
            duck.setFlyBehavior(flyBehaviors[0]);
            duck.swim();
            duck.performFly();
        }
    }
}
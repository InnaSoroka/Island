package animals.herbivores;

import animals.Animal;
import direction.Direction;
import food.Food;

public class Goat extends Animal {
    public Goat () {
       super("Goat", 60, 140, 3, 10);
    }

    @Override
    public void eat(Food food) {

    }

    @Override
    public void move(Direction direction) {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public boolean isAlive() {
        return false;
    }
}

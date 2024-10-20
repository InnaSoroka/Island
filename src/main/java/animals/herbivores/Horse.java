package animals.herbivores;

import animals.Animal;
import direction.Direction;
import food.Food;

public class Horse extends Animal {
    public Horse () {
        super("Horse", 400, 20, 4, 60);
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

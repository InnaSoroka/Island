package animals.predators;

import animals.Animal;
import direction.Direction;
import food.Food;

public class Eagle extends Animal {
    public Eagle() {
        super("Eagle", 6, 20, 3, 1);
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

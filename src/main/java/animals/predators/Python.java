package animals.predators;

import animals.Animal;
import direction.Direction;
import food.Food;

public class Python extends Animal {
    public Python() {
       super("Python", 15, 30, 1, 3);
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

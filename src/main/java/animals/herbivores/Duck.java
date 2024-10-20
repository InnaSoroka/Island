package animals.herbivores;

import animals.Animal;
import direction.Direction;
import food.Food;

public class Duck extends Animal {
    public Duck () {
        super("Duck", 1, 200,4, (int) 0.15);
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

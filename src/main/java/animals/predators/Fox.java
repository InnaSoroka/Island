package animals.predators;

import animals.Animal;
import direction.Direction;
import food.Food;

public class Fox extends Animal {
    public Fox() {
        super("Fox", 8, 30, 2, 2);
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

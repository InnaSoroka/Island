package animals.herbivores;

import animals.Animal;
import direction.Direction;
import food.Food;

public class Caterpillar extends Animal {
    public Caterpillar () {
        super("Caterpillar", (int)0.01, 1000, 0, 0);
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

package animals.herbivores;

import animals.Animal;
import direction.Direction;
import food.Food;

public class Hog extends Animal {
    public Hog () {
        super("Hog", 400, 50, 2, 50);
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

package animals.herbivores;

import animals.Animal;
import direction.Direction;
import food.Food;

public class Deer extends Animal {
    public Deer () {
        super("Deer", 300, 20, 4, 50);
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

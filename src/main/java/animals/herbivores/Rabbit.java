package animals.herbivores;

import animals.Animal;
import direction.Direction;
import food.Food;

public class Rabbit extends Animal {
    public Rabbit () {
        super("Rabbit", 2, 150, 2, (int)0.45);
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

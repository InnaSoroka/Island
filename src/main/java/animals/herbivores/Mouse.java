package animals.herbivores;

import animals.Animal;
import direction.Direction;
import food.Food;

public class Mouse extends Animal {
    public Mouse () {
        super("Mouse", (int)0.05, 500, 1, (int)0.01);
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

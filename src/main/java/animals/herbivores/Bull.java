package animals.herbivores;

import animals.Animal;
import direction.Direction;
import food.Food;

public class Bull extends Animal {
    public Bull () {
        super("Bull", 700, 10, 3,100);
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

package animals.predators;

import animals.Animal;
import direction.Direction;
import food.Food;

public class Bear extends Animal {
    public Bear (){
        super("Bear", 500, 5, 2, 80);
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

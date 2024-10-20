package animals.herbivores;

import animals.Animal;
import direction.Direction;
import food.Food;

public class Sheep extends Animal {
    public Sheep () {
        super("Sheep", 70, 140, 3, 15);
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

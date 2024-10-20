package animals.plants;

import animals.Animal;
import direction.Direction;
import food.Food;

public abstract class Plant extends Animal {
    public Plant () {
        super("Plant", 1, 200, 0, 0);
    }

    @Override
    public void reproduce() {
    }

    @Override
    public boolean isAlive() {
        return false;
    }
}

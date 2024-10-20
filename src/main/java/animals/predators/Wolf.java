package animals.predators;

import animals.Animal;
import direction.Direction;
import food.Food;

import javax.xml.stream.Location;

public class Wolf extends Animal {
    public Wolf(){
        super("Wolf", 50, 30, 3, 8);
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

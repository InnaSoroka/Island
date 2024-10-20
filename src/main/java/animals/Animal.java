package animals;

import direction.Direction;
import food.Food;

import javax.xml.stream.Location;

public abstract class Animal {
    protected String name;
    protected int weight;
    protected int maxCount;
    protected int speed;
    protected int satiety;
    protected int hunger;
    protected Location location;

    protected Animal(String name, int weight, int maxCount, int speed, int satiety) {
        this.name = name;
        this.weight = weight;
        this.maxCount = maxCount;
        this.speed = speed;
        this.satiety = satiety;
        this.hunger = 0;
    }
    public abstract void eat(Food food);
    public abstract void move(Direction direction);
    public abstract void reproduce();
    public abstract boolean isAlive();

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSatiety() {
        return satiety;
    }

    public int getHunger() {
        return hunger;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}

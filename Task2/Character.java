package Task2;

public abstract class Character {
    private String name;
    private int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract void attack(Character target);

    public boolean isAlive() {
        return health > 0;
    }

    public void getStatus() {
        System.out.printf("Я %s, у меня - %dhp%n", name, health);
    }
}

package Task2;

public class Warrior extends Character {
    public Warrior(String name, int health) {
        super(name, health);
    }

    public void attack(Character target) {
        int damage = 15;
        int health = target.getHealth();

        if (target instanceof Warrior) {
            target.setHealth(health - damage / 2);
            System.out.printf("%s нанес %s - %d урона%n", getName(), target.getName(), damage / 2);
        } else {
            target.setHealth(health - damage);
            System.out.printf("%s нанес %s - %d урона%n", getName(), target.getName(), damage);
        }

    }
}

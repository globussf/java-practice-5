package Task2;

import java.util.Random;

public class Mage extends Character {
    private int mana;

    public Mage(String name, int health, int mana) {
        super(name, health);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void attack(Character target) {
        if (mana < 10) {
            System.out.println("Недостаточно маны для атаки");
        } else {
            Random random = new Random();
            int damage = random.nextInt(10, 26);
            int health = target.getHealth();

            mana -= 10;
            target.setHealth(health - damage);
            System.out.printf("%s нанес %s - %d урона%n", getName(), target.getName(), damage);
        }
    }

    public void getStatus() {
        System.out.printf("Я %s, у меня - %dhp и %d маны%n", getName(), getHealth(), mana);
    }
}

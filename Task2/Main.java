package Task2;

import java.util.ArrayList;

public class Main {
    public void main() {
        Warrior warrior1 = new Warrior("Лох", 100);
        Warrior warrior2 = new Warrior("Тох", 100);

        Mage mage1 = new Mage("Толик", 100, 100);
        Mage mage2 = new Mage("Артём", 100, 50);

        Arena arena = new Arena();

        arena.addParticipants(warrior1);
        arena.addParticipants(warrior2);
        arena.addParticipants(mage1);
        arena.addParticipants(mage2);

        arena.startBattle();

        ArrayList<Character> participants = arena.getPaticipants();

        System.out.printf("%n=====================================================================%n%n");

        participants.get(0).getStatus();

        System.out.printf("%n=====================================================================%n%n");

        System.out.println("Всего боёв: " + Arena.getTotalBattles());
    }
}

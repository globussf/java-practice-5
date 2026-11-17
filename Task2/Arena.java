package Task2;

import java.util.ArrayList;
import java.util.Random;

public class Arena {
    protected static int totalBattles;
    protected ArrayList<Character> participants;

    public Arena() {
        participants = new ArrayList<>();
    }

    public void addParticipants(Character c) {
        participants.add(c);
    }

    public ArrayList<Character> getPaticipants() {
        return participants;
    }

    public static int getTotalBattles() {
        return totalBattles;
    }

    public void startBattle() {
        while (participants.size() >= 2) {
            Random random = new Random();
            int randAttacker = random.nextInt(0, participants.size());
            int randTarget = random.nextInt(0, participants.size());
            if (randAttacker == randTarget) {
                continue;
            } else {
                Character target = participants.get(randTarget);
                participants.get(randAttacker).attack(target);
                totalBattles++;

                if (!target.isAlive()) {
                    System.out.printf("%n=====================================================================%n%n");
                    System.out.printf("%s пал в бою%n", target.getName());
                    System.out.printf("%n=====================================================================%n%n");
                    participants.remove(target);
                }
            }

        }
    }
}

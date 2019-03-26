package Fight;

import java.util.Random;

public class BoxingMatch {
    public BoxingMatch() {
    }

    public String attack(Fighter fighter1, Fighter fighter2) {
        while (fighter1.health >= 0 && fighter2.health >= 0) {
            damage(fighter1, fighter2);
        }
        if (fighter1.health > 0) {
            System.out.println("Player 1 has won!");
            return (String) fighter1.name;
        } else {
            System.out.println("Player 2 has won!");
            return (String) fighter2.name;
        }

    }

    public void damage(Fighter fighter1, Fighter fighter2) {
        Random rand = new Random();
        int n = rand.nextInt(2);//0 or 1
        System.out.println("Player " + n + " took a hit!");

        if (n == 0)
            fighter1.health = fighter1.health - fighter2.damagePerAttack;
        else
            fighter2.health = fighter2.health - fighter1.damagePerAttack;
    }
}

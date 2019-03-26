package Fight;

public class Fighter {
    String name;
    Float health;
    Float damagePerAttack;


    public Fighter(String name, Float health, Float damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public Fighter() {
    }

    public void attack(Fighter opponent){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getHealth() {
        return health;
    }

    public void setHealth(Float health) {
        this.health = health;
    }

    public Float getDamagePerAttack() {
        return damagePerAttack;
    }

    public void setDamagePerAttack(Float damagePerAttack) {
        this.damagePerAttack = damagePerAttack;
    }
}

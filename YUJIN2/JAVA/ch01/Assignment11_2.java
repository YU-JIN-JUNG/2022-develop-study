package ch01;

public class Assignment10_2 {
    public static void main(String[] args) {
        Monster orc = new Monster("오크");
        Monster skeleton = new Monster("해골");
        Monster.battle(orc, skeleton);
    }
}

class Monster {
    private String name;
    private int hp = 30;
    private static int maxHP = 30;

    public Monster(String s) {
        name = s;
        hp = maxHP;
    }

    public void attack(Monster enemy) {
        enemy.hp = enemy.hp - 10;
        System.out.printf("[%s]의 공격 -> %s의 체력: %d/30 |n", name, enemy.name, enemy.hp);
    }

    public static void battle(Monster a, Monster b) {
        while (a.hp > 0 && b.hp > 0) {
            Monster attacker = (Math.random() < 0.5) ? a : b;
            Monster defender = (attacker == a) ? b : a;
            attacker.attack(defender);
        }
    }
}

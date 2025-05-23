package org.example;
//OZELLIKLI ENUM YAPISI OLUSTURMA. SABIT VE ILISKILI DEGERLER ICIN
public enum Weapon {
    SWORD(50, 1.5),
    AXE(60, 1.2),
    BOW(30, 2.0);

    private final int damage;
    private final double attackSpeed;

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public Integer getDamage() {
        return damage;
    }

    public Double getAttackSpeed() {
        return attackSpeed;
    }
}
 //Enum sınıfı sabit türlerin davranışlarını ve özelliklerini modellemek için temiz ve güvenli bir yol
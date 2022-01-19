package com.company.weapon.strong;

import com.company.weapon.Weapon;

public class StrongWeaponRange extends Weapon {
    public StrongWeaponRange(boolean twoHands){
        w_damage = 15;
        w_range = 8;
        w_attack_speed = 0.5;
        w_critical_damage_scale = 2;
        w_critical_damage_chance = 30;
        w_miss_chance = 60;
        w_requires_two_hand = true;
    }

    @Override
    public String toString() {
        return String.valueOf(w_attack_speed);
    }
}

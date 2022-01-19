package com.company.weapon.week;

import com.company.weapon.Weapon;

public class WeekWeaponRange extends Weapon {
    public WeekWeaponRange(boolean twoHands) {
        w_damage = 20;
        w_range = 2;
        w_critical_damage_scale = 2;
        w_critical_damage_chance = 45;
        w_requires_two_hand = twoHands;
        if(!twoHands) {
            w_attack_speed = 1.4;
            w_miss_chance = 45;
        }
        else {
            w_attack_speed = 1;
            w_miss_chance = 40;
        }
    }
}

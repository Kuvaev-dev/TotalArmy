package com.company.weapon.normal;

import com.company.weapon.Weapon;

public class NormalWeaponRange extends Weapon {
    public NormalWeaponRange(boolean twoHand){
        w_damage = 40;
        w_range = 4;
        w_critical_damage_scale = 4;
        w_critical_damage_chance = 45;
        w_requires_two_hand = twoHand;
        if(!twoHand) {
            w_attack_speed = 1.2;
            w_miss_chance = 45;
        }
        else {
            w_attack_speed = 1;
            w_miss_chance = 40;
        }
    }

    @Override
    public String toString() {
        return String.format("%f,%f,%f,%f,%f,%f,%b",
                this.w_damage,this.w_range,this.w_attack_speed,
                this.w_critical_damage_chance,this.w_critical_damage_scale,
                this.w_miss_chance,this.w_requires_two_hand);
    }
}

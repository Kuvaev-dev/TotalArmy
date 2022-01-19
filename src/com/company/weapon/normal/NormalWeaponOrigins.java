package com.company.weapon.normal;

import com.company.weapon.Weapon;
import com.company.weapon.WeaponOrigins;

public class NormalWeaponOrigins implements WeaponOrigins {
    @Override
    public Weapon CreateWeapon(boolean twoHand) {
        return new NormalWeaponRange(twoHand);
    }
}

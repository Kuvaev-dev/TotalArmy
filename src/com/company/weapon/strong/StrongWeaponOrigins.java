package com.company.weapon.strong;

import com.company.weapon.*;

public class StrongWeaponOrigins implements WeaponOrigins {
    @Override
    public Weapon CreateWeapon(boolean twoHands) {
        return new StrongWeaponRange(twoHands);
    }
}

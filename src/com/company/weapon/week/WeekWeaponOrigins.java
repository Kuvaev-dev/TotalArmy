package com.company.weapon.week;

import com.company.weapon.Weapon;
import com.company.weapon.WeaponOrigins;

public class WeekWeaponOrigins implements WeaponOrigins {

    @Override
    public Weapon CreateWeapon(boolean twoHands) { return new WeekWeaponRange(twoHands); }
}

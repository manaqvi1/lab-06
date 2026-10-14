package com.example.lab_6

class Wizard(val name: String, var mana: Int, var spellPower: Int) {


    /**
     * Casts a spell and returns the damage dealt
     *
     * Supported spells:
     * - "Explosion": costs 10 mana, deals 3 × spellPower damage
     * - "Frostbite": costs 5 mana, deals 2 × spellPower damage
     *
     * If the wizard does not have enough mana or the spell name is invalid,
     * the spell fails and returns 0.
     *
     * @param spell the name of the spell to cast
     * @return the integer amount of damage dealt, or 0 if the spell fails
     */
    fun castSpell(spell: String): Int {
        when (spell) {
            "Explosion" -> {
                if (mana >= 10) {
                    mana -= 10
                    return spellPower * 3
                } else return 0 // not enough mana
            }
            "Frostbite" -> {
                if (mana >= 5) {
                    mana -= 5
                    return spellPower * 2
                } else return 0 // not enough mana
            }
            else -> {
                return 0 // invalid spell
            }
        }
    }
}
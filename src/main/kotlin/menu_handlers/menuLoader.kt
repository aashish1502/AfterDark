package menu_handlers

import player_data.Player

class MenuLoader {

    fun printVitals( player: Player) {

        println("The vitals for your player are");
        println(player.name)
        println("Health: ${player.health}\tMana: ${player.mana}\tStamina: ${player.stamina}")
        println("Blessings: ${player.isBlessed}\t Health: ${player.health}")

    }

    fun displayChoices(optionsToDisplay: List<MenuOption<out Actions>>) {

        for((i, menuOption) in optionsToDisplay.withIndex()) {
            println("$i: ${menuOption.dialogToScreen}");
        }


    }

}
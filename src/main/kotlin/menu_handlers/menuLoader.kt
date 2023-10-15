package menu_handlers

import player_data.Player

object MenuLoader {

    fun printVitals(player: Player) {

        println("The vitals for your player are");
        println(player.name)
        println("Health: ${player.health}\tMana: ${player.mana}\tStamina: ${player.stamina}")
        println("Blessings: ${player.isBlessed}\t Health: ${player.health}")

    }

    fun displayChoices(optionsToDisplay: ArrayList<MenuOption<out Actions>>) {

        for ((i, menuOption) in optionsToDisplay.withIndex()) {
            println("$i: ${menuOption.dialogToScreen}");
        }

    }

    fun selectedOptionCaller(choiceIndex: Int, optionsToDisplay: ArrayList<MenuOption<out Actions>>): Actions {

        val newActionToCall = optionsToDisplay.get(choiceIndex).action
        if (newActionToCall.reducable == true) {
            optionsToDisplay.removeAt(choiceIndex);
        }

        return newActionToCall;
    }


}
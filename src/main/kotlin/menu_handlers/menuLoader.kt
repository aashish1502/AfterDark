package menu_handlers

import player_data.Player
import producers.ActionProducer

object MenuLoader {

    private val actionProducer = ActionProducer;

    private val optionsToDisplay = mutableListOf(
        MenuOptionVersionTwo("shopOpenObject", "Open Shop"),
        MenuOptionVersionTwo("exitGameObject", "Exit")
    )


    fun printVitals(player: Player) {

        println("The vitals for your player are");
        println(player.name)
        println("Health: ${player.health}\tMana: ${player.mana}\tStamina: ${player.stamina}")
        println("Blessings: ${player.isBlessed}\t Health: ${player.health}")

    }

    fun getMenuLength() : Int {
        return optionsToDisplay.size;
    }

    fun displayChoices() {

        for ((i, menuOption) in optionsToDisplay.withIndex()) {
            println("$i: ${menuOption.dialogToScreen}");
        }

    }

    fun selectedOptionCaller(choiceIndex: Int): Actions {

        val newActionToCall = actionProducer._CreateAction<Actions>(optionsToDisplay.get(choiceIndex).action)
        if (newActionToCall.reducible) {
            optionsToDisplay.removeAt(choiceIndex);
        }

        return newActionToCall;
    }


}
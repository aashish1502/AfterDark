import action_handlers.ActionHandler
import exceptions.InvalidOptionException
import menu_handlers.*
import player_data.Player
import java.lang.Exception
import java.util.Objects
import java.util.Scanner


/*
* TODO: Create producers and consumers for actions so that you can save memory
*   - Implement a way to save the state of objects and attributes of the user so that the user can continue where they left off.
* */

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)
    val name = sc.next()
    val myPlayer = Player(name)

    while (myPlayer.health > 0) {
        try {

            MenuLoader.printVitals(myPlayer)
            MenuLoader.displayChoices()
            val selection = sc.nextInt();
            if (selection > MenuLoader.getMenuLength()) {
                throw InvalidOptionException("Please select the right option")
            }
            ActionHandler.initializeAction(MenuLoader.selectedOptionCaller(selection))
        } catch (e: Exception) {
            println(e.localizedMessage)
        }
    }

}


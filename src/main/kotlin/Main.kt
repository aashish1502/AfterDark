import action_handlers.ActionHandler
import exceptions.InvalidOptionException
import menu_handlers.*
import player_data.Player
import java.lang.Exception
import java.util.Objects
import java.util.Scanner


val menuOptions: ArrayList<MenuOption<out Actions>> = ArrayList()


fun main(args: Array<String>) {

    menuOptions.add(MenuOption(OpenShopAction(), "Open Shop"))
    menuOptions.add(MenuOption(ExitAction(), "Exit"))

    val sc = Scanner(System.`in`)
    val name = sc.next()
    val myPlayer = Player(name)

    while (myPlayer.health > 0) {
        try {

            MenuLoader.printVitals(myPlayer)
            MenuLoader.displayChoices(menuOptions)
            val selection = sc.nextInt();
            if (selection > menuOptions.size) {
                throw InvalidOptionException("Please select the right option")
            }
            ActionHandler.initializeAction(MenuLoader.selectedOptionCaller(selection, menuOptions))
        } catch (e: Exception) {
            println(e.localizedMessage)
        }
    }


}


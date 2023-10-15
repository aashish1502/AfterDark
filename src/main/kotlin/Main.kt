import action_handlers.ActionHandler
import menu_handlers.*
import player_data.Player
import java.lang.Exception
import java.util.Objects
import java.util.Scanner


val menuOptions: ArrayList<MenuOption<out Actions>> = ArrayList()
val actionHandler = ActionHandler()
val menuLoader = MenuLoader()


fun main(args: Array<String>) {

    menuOptions.add(MenuOption(OpenShopAction(), "Open Shop"))
    menuOptions.add(MenuOption(ExitAction(), "Exit"))

    val sc = Scanner(System.`in`)
    val name = sc.next()
    val myPlayer = Player(name)
    val menuController = MenuLoader();

    while (myPlayer.health > 0) {
        try {

            menuController.printVitals(myPlayer)
            menuController.displayChoices(menuOptions);
            // add exceptions to make sure selected things are valid
            sc.next();
            actionHandler.initializeAction(menuController())
        }
        catch (e : Exception) {
            println(e.message)
        }
    }


}


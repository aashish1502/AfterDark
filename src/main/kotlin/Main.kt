import menu_handlers.*
import player_data.Player
import java.util.Objects
import java.util.Scanner


val menuOptions = listOf(
    MenuOption(OpenShopAction(), "Open Shop"),
    MenuOption(ExitAction(), "Exit")
)

val menuLoader = MenuLoader()


fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)
    val name = sc.next()
    val myPlayer = Player(name)
    val menuController = MenuLoader();

    while(myPlayer.health > 0) {
        menuController.printVitals(myPlayer)
        menuController.displayChoices(menuOptions);
        sc.next();
    }


}


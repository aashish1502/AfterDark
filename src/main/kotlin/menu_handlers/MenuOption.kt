package menu_handlers


@Deprecated("This has been replaced with a producer consumer architecture")
data class MenuOption<T : Actions>(val action: T, val dialogToScreen: String) {
    fun printDialog() {
        print(dialogToScreen);
    }
}


data class MenuOptionVersionTwo(val action: String, val dialogToScreen: String) {
    fun printDialog() {
        print(dialogToScreen);
    }

    fun getActionString() : String {
        return action
    }
}


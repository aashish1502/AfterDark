package menu_handlers

data class MenuOption <T : Actions > (val action: T, val dialogToScreen : String){
    fun printDialog() {
        print(dialogToScreen);
    }
}


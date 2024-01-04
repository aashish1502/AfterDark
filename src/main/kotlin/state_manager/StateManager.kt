package state_manager

object StateManager {

    val currentState = GameState.MAIN_MENU;


}

enum class GameState {
    MAIN_MENU, GAMEPLAY, PAUSE_MENU, OPTIONS_MENU, INVENTORY, LOAD_GAME, NEW_GAME, GAME_OVER
}
package action_handlers

import menu_handlers.Actions

object ActionHandler {
    fun <T : Actions> initializeAction(action : T) {
        action.callAction();
    }

}



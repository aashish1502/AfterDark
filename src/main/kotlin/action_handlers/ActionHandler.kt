package action_handlers

import menu_handlers.Actions

class ActionHandler () {
    fun <T : Actions> initializeAction(action : T) {
        action.callAction();
    }



}



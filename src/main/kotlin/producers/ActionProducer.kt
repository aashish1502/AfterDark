package producers

import menu_handlers.Actions
import menu_handlers.ExitAction
import menu_handlers.OpenShopAction
import kotlin.Exception

/*
* This file code contains the singleton object of ActionProducer
* - The ActionProducer class takes a string that will return an object
* - The action will be a sub-class of Actions Object
* - This action can then be passed to a consumer such as the ActionHandller object
* - This will make it so that when saving objects we will not have to save complete objects into a file only their respective
* strings
* - This can then be used to make the game more or less editable from a simple text file if need be
* - TODO: find a way to create an object by taking in consideration the saved states.
*
* */

object ActionProducer {

    fun <T : Actions> _CreateAction(actionString : String) : T  {

        when(actionString) {
            "shopOpenObject" -> return OpenShopAction() as T
            "exitGameObject" -> return ExitAction() as T
        }

        throw Exception("Unknown action: $actionString")

    }


}

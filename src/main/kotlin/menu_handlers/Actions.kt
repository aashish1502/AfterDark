package menu_handlers

import kotlin.system.exitProcess

abstract class Actions (){
    abstract fun callAction()
    abstract val reducible : Boolean;

    /*
    * TODO: Make an architecture to make this a parent class that can be used by multiple types of children
    *
    *                   ______ Effects etc..
    * -Action---Eat____/
    *        \________Run
    * */
}


class ExitAction() : Actions() {
    override val reducible: Boolean = false;
    override fun callAction() {
        exitProcess(1)
    }


}

class OpenShopAction : Actions () {
    override val reducible: Boolean = false;
    override fun callAction() {

        println("I am implementing this so i can test some features I am trying to implement")

    }

}
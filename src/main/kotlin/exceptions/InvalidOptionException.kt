package exceptions


// This exception will be thrown when a user selects an option that is invalid
class InvalidOptionException(message : String) : Exception(message) {

    fun getMessage() {
        println(message);
    }


}
import kotlin.math.log

lateinit var currenUserName: String
lateinit var currentUserPassword: String
lateinit var authenticator: Authenticator
var currentUser = Users()
fun main() {

    welcomeScreen()
}

fun welcomeScreen() {
    LiveDataBase.dataBaseStaticObj = LiveDataBase(currentUser)
    createOrLogin()



}

fun printer(vararg typinglines: String) {
    for (e in typinglines)
        println(e)
}

fun createOrLogin() {
    printer("Welcome", "for Creating Acoount type 1 below, else if you already have an account type 2 \n")

    while (true) {
        val loginOrSignin = readLine()
        if (loginOrSignin.equals("2")) {
            logInUser()

            break

        } else if (loginOrSignin.equals("1")) {
            createUser()
            break

        } else {
            printer("invalid input try again")

        }
    }


}

fun createUser() {
    currentUser.createNewUser()

//    printer("you want to signup", "pls Enter your userName and Password Down below", "username = ")
//    val currenUserName = readLine()
//    println("yourusername is : $currenUserName")
//    printer("paaword = ")
//    val currentUserPassword = readLine()
//    println("yourusername is : $currentUserPassword")
//    currentUser =
//        currenUserName?.let { currentUserPassword?.let { it1 -> Users(userName = it, passWord = it1, "", "") } }!!
//
//    LiveDataBase.dataBaseStaticObj.createNewUser(currentUser)
//    authenticator = Authenticator()
//    var authenticatorRes = authenticator.isRealUser(currentUser)
//    if (authenticator.isRealUser(currentUser)) {
//        logInUser()
//    } else {
//        createUser()
//        printer("creating User was sucessfull", "now you can login to your account")
//    }
}
//testbranch im base
//fun logInUser() {
//    val userName: String
//    val password: String
//    val logedinUser: Users
//    printer("welcome to login prosess enter your user and password down below", "username:")
//    userName = readLine().toString()
//    printer("password:")
//    password = readLine().toString()
//    logedinUser = Users(userName = userName, passWord = password, "", "")
//    authenticator = Authenticator()
//    var authenticatorRes = authenticator.isRealUser(logedinUser)
//    currentUser = logedinUser
//    if (authenticatorRes) {
//        printer("welcome ${currentUser.userName} you sucessfully loged in ")
//        return
//    } else {   printer("username or password is incorrect ")
//        var enteredValue=""
//        while (true){
//            printer("if you want to go to signup page type 'X' if you want to try again type 'Y'")
//       enteredValue= readLine().toString()
//            if (enteredValue.equals("x")||enteredValue.equals("X")){
//                printer("backing to signup page ....")
//                createUser()
//                break
//            }else if (enteredValue.equals("y")||enteredValue.equals("Y")){
//                printer("trying again ....")
//
//                logInUser()
//                break
//
//            }else{
//                printer("invalid input")
//            }
//
//        }
//
//
//
//    }

fun logInUser(){
    val userName: String
    val password: String
    val logedinUser: Users
    printer("welcome to login prosess enter your user and password down below", "username:")
    userName = readLine().toString()
    printer("password:")
    password = readLine().toString()
  logedinUser = Users(userName = userName, passWord = password, "", "")
    authenticator = Authenticator()
    authenticator.logInUser(logedinUser)


}

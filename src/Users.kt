import java.util.*

class Users(
    var userName: String = "",
    var passWord: String = "",
    var firstName: String = "",
    var lastName: String = "",
)
{
    var DateOfbirth: Int=2000
    var age = 0;
    var numberOfIncorrectPasswords = 0


   fun createNewUser(){
       printer("you want to signup", "pls Enter your userName and Password Down below", "username = ")
       val currenUserName = readLine()
       println("yourusername is : $currenUserName")
       printer("paaword = ")
       val currentUserPassword = readLine()
       println("yourusername is : $currentUserPassword")
       currentUser =
           currenUserName?.let { currentUserPassword?.let { it1 -> Users(userName = it, passWord = it1, "", "") } }!!

       LiveDataBase.dataBaseStaticObj.createNewUser(currentUser)
       authenticator = Authenticator()
       var authenticatorRes = authenticator.isRealUser(currentUser)
       if (authenticator.isRealUser(currentUser)) {
           logInUser()
       } else {
           createUser()
           printer("creating User was sucessfull", "now you can login to your account")
       }
   }

}
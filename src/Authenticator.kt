class Authenticator() {
    var liveDataBase = LiveDataBase.dataBaseStaticObj
    var isLogined = false
// for (e in liveDate)

    fun isRealUser(currentUser: Users): Boolean {
        for (e in liveDataBase.mapOfusers) {
            if (e.value.userName == currentUser.userName && e.value.passWord == currentUser.passWord) {
                isLogined = true
                liveDataBase.currentLogedinUser = e.value
                return true
            }


        }
        return false

    }

//    fun logInUser(
//        userName: String,
//        password: String,
//        logedinUser: Users
//    ) {
//
//        var logedinUser = Users(userName = userName, passWord = password, "", "")
//
//        authenticator = Authenticator()
//
//        var authenticatorRes = authenticator.isRealUser(logedinUser)
//        currentUser = logedinUser
//        if (authenticatorRes) {
//            printer("welcome ${currentUser.userName} you sucessfully loged in ")
//            return
//        } else {
//            printer("username or password is incorrect ")
//            var enteredValue = ""
//            while (true) {
//                printer("if you want to go to signup page type 'X' if you want to try again type 'Y'")
//                enteredValue = readLine().toString()
//                if (enteredValue.equals("x") || enteredValue.equals("X")) {
//                    printer("backing to signup page ....")
//                    createUser()
//                    break
//                } else if (enteredValue.equals("y") || enteredValue.equals("Y")) {
//                    printer("trying again ....")
//
//                    logInUser()
//                    break
//
//                } else {
//                    printer("invalid input")
//                }
//
//            }
//
//
//        }
//    }

    fun logInUser( user:Users
                       ): Users{

    var User = Users(userName = user.userName, passWord =user.passWord, "", "")
   var    logedinUser =User
        authenticator = Authenticator()
        var authenticatorRes = authenticator.isRealUser(logedinUser)
        currentUser = logedinUser
        if (authenticatorRes) {
            printer("welcome ${currentUser.userName} you sucessfully loged in ")
            return logedinUser
        } else {
            loginFailedSituation()
return logedinUser

        }


    }

    private fun loginFailedSituation() {
        printer("username or password is incorrect ")
        var enteredValue = ""
        while (true) {
            printer("if you want to go to signup page type 'X' if you want to try again type 'Y'")
            enteredValue = readLine().toString()
            if (enteredValue.equals("x") || enteredValue.equals("X")) {
                printer("backing to signup page ....")
                createUser()
                break
            } else if (enteredValue.equals("y") || enteredValue.equals("Y")) {
                printer("trying again ....")

                logInUser()
                break

            } else {
                printer("invalid input")
            }

        }
    }
}
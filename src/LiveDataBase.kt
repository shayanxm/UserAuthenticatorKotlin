import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray

public class LiveDataBase(newUser:Users){
    companion object {
        @JvmStatic   lateinit var dataBaseStaticObj: LiveDataBase
    }init {
       dataBaseStaticObj  = this
    }
    lateinit var currentLogedinUser:Users
var mapOfusers= mutableMapOf<String,Users>()
  //  var mapOfusers= mutableMapOf(newUser.userName to newUser)

    fun createNewUser(newUser:Users){

        dataBaseStaticObj.mapOfusers.put(newUser.userName,newUser)

    }

}
/*
 * Class - collection of data and instructions which have a name (logical)
 * which can be used to create objects - the actual thing exists in RAM
 */

class AppUser(

    //class Contructor
    //class can contain properties here
    val name: String,
    val joinDate: String,
    val proVersion: Boolean
) {
    //Class body - where functions (instructions) resides here
    fun getFirstInitial(): Char {
        return name[0]
    }

}

/*
 * data - keywords adds automatically generated function like equals(), toString(), copy() 
 * 
 */
data class User(
    val uid: String,
    val name: String,
    val displayPictureUrl: String = "empty_person"
)

fun main(args: Array<String>) {
    
//Creating new Objects from the class AppUser by passing required properties in class constructor
val appUser = AppUser(
    "Sri",
    "4 years ago",
    false
)

/*
 * can Skip displayPictureUrl value as it is predined or  
 * we can also override it by sepecifying different one, or
 * we can specify name of arguements to avoid value mismatch or to specify differenr order
 */
val user1 = User(
    "1234",
    "Ram" 
)

//
val user2 = User(
    displayPictureUrl = "jarvis.jpg",
    uid = "4321",
    name = "Maris"    
)

}
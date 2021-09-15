package org.satti.kotlin.person
class Person( _firstName : String , _lastName  : String, _hasPartner : Boolean = false , _height : Double = 0.0, _age : Int = 0
                 ) {

    var firstName: String = _firstName
    var lastName: String = _lastName
    var height: Double = _height
    var age : Int = _age
    var hasPartner : Boolean = _hasPartner
    private set
    var partner: Person? = null
      set(value)  {
        field = value
        hasPartner = (field != null)

    }

    constructor(_firstName: String , _lastName: String, _partner: Person):this(_firstName,_lastName){
        hasPartner = true
        partner = _partner
    }

    fun fullname (): String{
        return "$firstName $lastName"
    }

    override fun toString(): String {
        return fullname()
    }

    override fun hashCode(): Int {
        return (firstName.hashCode() * 28) + (lastName.hashCode() * 31)
    }

    override fun equals(other: Any?): Boolean {
        if (other is Person) {
            return (firstName == other.firstName) &&
                    (lastName == other.lastName)
        }else {
            return false
        }
    }
 }






import org.satti.kotlin.person.Person

fun main() {

//creating default constructor instance
    val satish = Person("satish", "batta", true, 65.4, 29)
    println(satish)
    val karthik = Person("karthik", "batta", false)
    val cuteGirl = Person("somecute", "cuteLast", karthik)

//creating secondary constructor instance
    val somegirl = Person("cutegirl", "forme", satish)
    println(somegirl)
    
// checking secondary and primary instance
    if (somegirl.hasPartner) {
        println("$somegirl has her partner :${somegirl.partner}.")
    } else {
        println("somegirl has no partner")
    }
    //changing somegirl last name
    somegirl.lastName = "forme batta"
    println(somegirl)

    println(cuteGirl)

    if (cuteGirl.hasPartner) {
println("$cuteGirl has partner:${cuteGirl.partner} ")

    } else {
        println("$cuteGirl  yet has no partner  in her life")

    }
}

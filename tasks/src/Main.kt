

fun greetTraveler():String{

    return "Welcome to the Desert, Traveler!"
}

fun currentTemperature (morningTemperature: Int , afternoonTemperature: Int):String{

    val temp = (morningTemperature + afternoonTemperature)/2
    return "Average Temperature: $temp"

}

fun findOasis(x:Int , y:Int ):String{

    return "Oasis found at ($x , $y)"

}

fun startCamelRide(time: Int , speed: Int =5):String{

    val distance = time * speed
    return "Camel Ride: Distance = $distance km, Speed = $speed km/h, Time = $time hours"

}

fun exploreDune(height: Int, climbRate: Int):String {

    val temp = height.toDouble() / climbRate.toDouble()
    return "Time to Climb the Dune: %.2f hours".format(temp)
}

fun survivalChance(supplies: Int):String{

    val temp = supplies * 10
    return "Survival Chance: $temp"
}

fun main() {

    println(greetTraveler())
    println(findOasis(10,20))
    println(currentTemperature(25,40))
    println(startCamelRide(10))
    println(exploreDune(climbRate = 3, height = 20))
    println(survivalChance(8))


}




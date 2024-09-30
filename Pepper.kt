fun main() {
    println("Instructions- You may check for the following peppers: Bell Pepper, Pepperoncini, Anaheim, Hungarian, Serrano, Habanero, or Carolina Reaper.")
    println("What type of pepper did you eat?")
    val pepper = readLine()

    var sHU = 0

    if (pepper == "Green Pepper") {
       sHU = 0;
       println("The $pepper you ate has a scoville rating starting at $sHU");
    } else if (pepper == "Pepperoncini") {
        sHU = 100;
        println("The $pepper you ate has a scoville rating starting at $sHU");
    } else if (pepper == "Anaheim") {
        sHU = 500;
        println("The $pepper you ate has a scoville rating starting at $sHU");
    } else if (pepper == "Hungarian") {
        sHU = 5000;
        println("The $pepper you ate has a scoville rating starting at $sHU");
    } else if (pepper == "Serrano") {
        sHU = 10000;
        println("The $pepper you ate has a scoville rating starting at $sHU");
    } else if (pepper == "Habanero") {
        sHU = 100000;
        println("The $pepper you ate has a scoville rating starting at $sHU");
    } else {
        sHU = 1400000;
        println("The $pepper you ate has a scoville rating starting at $sHU");
    }

    var pungency: String
  
    // Write your code below
    if (sHU in 0..699) {
      pungency = "very mild";
    } else if (sHU in 700..2999) {
      pungency = "mild";
    } else if (sHU in 3000..24999) {
      pungency = "moderate";
    } else if (sHU in 25000..69999) {
      pungency = "high";
    } else {
      pungency = "very high";
      println("Caution eating")
      println("\n")
    }
   
    println("A pepper with $sHU Scoville Heat Units has a $pungency pungency.")
  
  }
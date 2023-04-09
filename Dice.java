public class Dice {


/**
 * @param sides Receives an integer that determines the number of sides the dice has.
 * @return Randomly generates a number between 1 and the number of sides the dice has.
 */
private double roll (int sides){
    return Math.floor(Math.random()*sides + 1);
}

}
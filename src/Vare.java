import java.util.Date;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 09/11/2020
 */

public class Vare {

    double stykpris; // price of one
    Date holdbarhed; // date of expire
    boolean kanSælges = true; // sellable (?)

    void smidUd() {
        kanSælges = false;
    } //Smid ud = throw out

}

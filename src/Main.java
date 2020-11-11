import java.util.Date;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 09/11/2020
 */

public class Main {

    public static void main(String[] args) {

        Apple a = new Apple();
        a.stykpris = 2;
        a.holdbarhed = new Date(1608768000);
        a.smidUd();
        a.moden = true;
        a.coolDown();

        Peas p = new Peas();
        p.stykpris = 0.1;
        p.holdbarhed = new Date(1608768000);
        p.freeze();

        Pear pear = new Pear();

        pear.moden = true;
        pear.stykpris = 3;
        p.holdbarhed = new Date(1608768000);
        pear.kanSælges = true;
        pear.coolDown();
        pear.konserver();

        Rose r = new Rose();

        r.stykpris = 10;
        r.color = "Red";
        r.inABundle = false;
        r.kanSælges = true;
        r.inWater();
        r.smidUd();


        Carrot g = new Carrot();

        g.stykpris = 0.3;
        g.holdbarhed = new Date(1608768000);
        g.kanSælges = true;
        g.smidUd();


    }

}

import java.util.Date;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 09/11/2020
 */

public class Apple extends Frugt implements Bearbejde {

    String sort = "Golden Delicious";
    String type = "spiseæble";
    boolean moden = false;


    @Override
    public void Bearbejde() {
        System.out.println("Der lavese æblemos eller æblejuice");
    }
}

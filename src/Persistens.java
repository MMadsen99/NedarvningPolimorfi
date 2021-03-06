
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 10/11/2020
 */

public class Persistens {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Velkommen til Grøntorvets lagersystem");
        System.out.println("Indlæser data...");

        Persistens p = new Persistens();
        p.save();
        p.load();
    }


    public void save() throws FileNotFoundException {

        java.io.File file = new java.io.File("data/varer.txt");
        // Create a file
        java.io.PrintWriter output = new java.io.PrintWriter(file);

        // Gemme varelageret i filen
        Lager lager = new Lager();
        lager.fyldOp();

        for (Vare vare : lager.vareLager) {
            System.out.println("Skriver i filen");
            output.println(vare.getClass().getSimpleName());
        }

        // Close the file
        output.close();
    }

    public void load() throws FileNotFoundException {
        // Create a File instance
        java.io.File file = new java.io.File("data/varer.txt");

        // Create a Scanner for the file
        Scanner input = new Scanner(file);
        Lager lager = new Lager();

        while (input.hasNext()) {
            String vareString = input.next();
            System.out.println(vareString);
            if(vareString=="Apple") lager.vareLager.add(new Apple());
            if(vareString=="Melon") lager.vareLager.add(new Peas());
        }

        // Indlæse varelageret i filen


        // Close the file
        input.close();
    }
}

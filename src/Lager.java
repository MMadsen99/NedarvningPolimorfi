import java.util.ArrayList;

public class Lager {

    public static void main(String[] args) {
        Lager lager = new Lager();
        lager.antalVare();
        lager.vareLager.size();

    }

     ArrayList<Vare> vareLager = new ArrayList<Vare>();

    public void fyldOp(){

        Rose rose = new Rose();
        vareLager.add(rose);

        Apple apple = new Apple();

        for (int i = 0; i < 10; i++) { // hvis jeg ville have flere æbler
            System.out.println("Æble tilføjet");
            vareLager.add(apple);
        }



        Carrot carrot = new Carrot(); // refactor til carrot
        vareLager.add(carrot);

        Pear pear = new Pear(); // den ene måde
        vareLager.add(pear);

       // Peas peas = new Peas();
        vareLager.add(new Peas()); // den anden måde




    }
    public  int antalVare() {

    return vareLager.size();


    }


}

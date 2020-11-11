import java.util.ArrayList;

public class Lager {

    public static void main(String[] args) {
        Lager lager = new Lager();
        lager.antalVare();

    }

     ArrayList<Vare> vareLager = new ArrayList<>();

    public void fyldOp(){

        Rose rose = new Rose();
        vareLager.add(rose);

        for (int i = 0; i < 10; i++) { // hvis jeg ville have flere æbler
            Apple apple = new Apple();
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

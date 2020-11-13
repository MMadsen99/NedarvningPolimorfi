import java.util.ArrayList;

public class Lager {

    public static void main(String[] args) {
        Lager lager = new Lager();
        fyldOp();
        lager.antalVare();


    }

     static ArrayList<Vare> vareLager = new ArrayList<Vare>();

    public static void fyldOp(){

        Rose rose = new Rose();
        vareLager.add(rose);

        Carrot carrot = new Carrot();
        vareLager.add(carrot);

        //ligger 10 æbler ind på lageret
        Apple apple = new Apple();
        for (int i = 0; i < 10; i++) {
            int plads = i + 1;
            System.out.println(" et er æble lagt ind på plads: " +  plads);
            vareLager.add(apple);
        }



        // 2 måder og tilføje en ting til ageret

        Pear pear = new Pear(); // den ene måde
        vareLager.add(pear);

        vareLager.add(new Peas()); // den anden måde




    }
    public  int antalVare() {


        System.out.println(vareLager.size());
    return vareLager.size();


    }


}

public class Carrot extends Grønsag implements Bearbejde {

    String color = "Orange";


    @Override
    public void Bearbejde() {
        System.out.println("Der laves gulerodskage eller andet");
    }
}

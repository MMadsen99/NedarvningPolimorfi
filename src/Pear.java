public class Pear extends Frugt implements Konserver {

    String Sort = "Gråpære";
    boolean moden = true;

    @Override
    public void konserver() {
        System.out.println("Ærterne blivet frosset ned");
    }
}

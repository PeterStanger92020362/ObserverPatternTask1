package observablepatterntask1;

public class ObservablePatternV1 {

    public static void main(String[] args) {

        Person personManu = new Person("Manu");
        Person personTama = new Person("Tama");

        Product productUte = new Product("4x4Ute");

        // register the observers
        productUte.registerObserver(personManu);
        productUte.registerObserver(personTama);

        //calling setQty > 0 should issue notification.
        productUte.setQty(10);
    }
}
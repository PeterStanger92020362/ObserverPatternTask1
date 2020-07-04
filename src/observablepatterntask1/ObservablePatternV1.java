package observablepatterntask1;

public class ObservablePatternV1 {

    public static void main(String[] args) {

        Person personManu = new Person("Manu");
        Person personTama = new Person("Tama");
        Person personFrancis = new Person("Francis");

        Product productUte = new Product("4x4Ute");
        Product productAngryDinosaur = new Product("Angry Dinosaur");

        // register the observers
        productUte.registerObserver(personManu);
        productUte.registerObserver(personTama);
        productUte.registerObserver(personFrancis);

        productAngryDinosaur.registerObserver(personTama);
        productAngryDinosaur.registerObserver(personFrancis);

        //calling setQty > 0 should issue notification.
        productUte.setQty(10);
        productAngryDinosaur.setQty(3);
    }
}
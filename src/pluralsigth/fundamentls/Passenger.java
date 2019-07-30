package pluralsigth.fundamentls;

public class Passenger {

    private int feeBags;
    private int checkedBags;
    private double perBagFee;

    public Passenger(int feeBags) {

        this(feeBags > 1 ? 25.0 : 50.0);

        this.feeBags = feeBags;
    }

    // chaining constructors
    public Passenger(int feeBags, int checkedBags) {
        this(feeBags); // this should be the first line in the new constructor
        this.checkedBags = checkedBags;
    }

    private Passenger (double perBagFee) {
        this.perBagFee = perBagFee;
    }





}

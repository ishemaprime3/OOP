public class Computers extends Product{
    private static final String price= "5000";

    public Computers(String name, String manufacture, String n_version) {
        super(name, manufacture, n_version);

    }

    public String store() {
        return "15";
    }
    @Override
    public String toString() {
        return super.toString() + "\t" + price + "\t" + store();
    }
}

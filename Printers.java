public class Printers extends Product{
    private static final String price= "4000";
    public Printers(String name, String manufacture, String n_version) {
        super(name, manufacture, n_version);
    }
    public String store() {
        return "40";
    }
    @Override
    public String toString() {
        return super.toString() + "\t" + price + "\t" + store();
    }

}

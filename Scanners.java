public class Scanners extends Product{
    private static final String price= "2500";
    public Scanners(String name, String manufacture, String n_version) {
        super(name, manufacture, n_version);
    }
    public String store() {
        return "20";
    }
    @Override
    public String toString() {
        return super.toString() + "\t" + price + "\t" + store();
    }
}

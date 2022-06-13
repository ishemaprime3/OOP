public class Product {

String name;
String manufacture;
String n_version;

    public String getName() {
        return name;
    }

    public String getManufacture() {
        return manufacture;
    }
    public String getn_version(){
        return n_version;
    }

    @Override
    public String toString() {
        return name+"\t"+manufacture+"\t"+n_version;
    }

    public Product(String name, String manufacture,  String n_version){
        this.name= name;
    this.manufacture= manufacture;
    this.n_version= n_version;
}

    public Product(String name, String manufacture, int n_version) {
    }


}

//Prime Ngarambe
//20356722

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> stList = new ArrayList<>();

        Computers Compproduct = new Computers("lenovo", "intel", "5");
        Printers Priproduct = new Printers("epson", "prime", "6");
        Scanners Scanproduct = new Scanners("HP", "thibaut", "10");
        stList.add(new Computers("Lenovo", "intel", "6"));
        stList.add(new Printers("Epson", "Prime", "7"));
        stList.add(new Scanners("Hp", "thibaut", "4"));
        stList.add(new Computers("Hp", "thibaut", "3"));
        stList.add(new Printers("HP", "Prime", "2"));
        stList.add(new Scanners("Epson", "thibaut", "7"));
        stList.add(new Computers("Acer", "intel", "8"));
        stList.add(new Printers("Epson", "Prime", "9"));
        stList.add(new Scanners("Hp", "thiaut", "1"));
        stList.add(new Computers("asus", "clov", "2"));



        for (Product st : stList) {
            System.out.println(st);
        }
    }
}

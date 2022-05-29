import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Account> accList = new ArrayList<>();
        accList.add(new Account(201, "Prime Ngarambe", "Saving", "5000","1.3"));
        accList.add(new Account(202, "Chadia Uwase", "Withdraw", "7000","2.5"));
        accList.add(new Account(203, "Moise Ngarambe", "Saving", "3000","0.4"));
        accList.add(new Account(204, "Thomas Niyonsenga", "Saving", "2000","6.9"));
        accList.add(new Account(205, "Melysa Gasana", "Withdraw", "3000","0.23"));
        accList.add(new Account(206, "Yvonne Treicy", "Checking", "6000","2.4"));
        accList.add(new Account(207, "Divine Mwiza", "Saving", "2000","1.3"));
        accList.add(new Account(208, "Benny Emmanuel", "Withdraw", "1000","4.1"));
        accList.add(new Account(209, "Angel Mignonne", "Saving", "2000","2.7"));
        accList.add(new Account(210, "Angel Curtis", "Checking", "8000","8.0"));



        for (Account acc:accList){
            System.out.println(acc);
        }
    }
}
public class Account {
    private int accNumb;
    private String Fname;
    private String type;
    private String balance;
    private String interest;


    public Account(int accNumb, String Fname, String type, String balance, String interest) {
        this.accNumb = accNumb;
        this.Fname = Fname;
        this.type = type;
        this.balance = balance;
        this.interest = interest;
    }

    public int getAccNumb() {
        return accNumb;
    }

    public String getFname() {
        return Fname;
    }

    public String getType() {
        return type;
    }
    public String getBalance() {
        return balance;
    }
    public String getInterest() {
        return interest;
    }

    public String toString() {
        return accNumb +"\t"+ Fname+"\t"+type+"\t"+balance+"\t"+interest;
    }
}

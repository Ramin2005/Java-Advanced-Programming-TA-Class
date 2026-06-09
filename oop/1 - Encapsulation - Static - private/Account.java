public class Account {

    private static int count = 0;
    private String name;
    private String password;
    private final int id;
    private long balance = 0;
    private final String pk = "123456";

    public Account(int id, String password){
        ++count;
        this.id = id;
        this.password = password;
    }

    public Account(String name, String password, int id){
        ++count;
        this.name = name;
        this.password = password;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword(String PK) {
        if (this.pk.equals(PK))
            return password;
        else
            return "";
    }

    public void setPassword(String Password, String PK) {
        if (this.pk.equals(PK) && this.password.equals(Password))
            this.password = Password;
    }

    public int getId() {
        return id;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance, String PK) {
        if (this.pk.equals(PK))
            this.balance = balance;
    }

    private long setBalance(long balance){
        this.balance = balance;

        return this.balance;
    }

    public static int getCount() {
        return count;
    }
}

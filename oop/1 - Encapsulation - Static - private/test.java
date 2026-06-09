
void main(){

    Account ac = new Account(1, "pass");
    System.out.println("id: " + ac.getId() +
     " password: "+ ac.getPassword("123456"));
    System.out.println(Account.getCount());

    Account ac_2 = new Account(1, "pass");
    System.out.println(Account.getCount());

}
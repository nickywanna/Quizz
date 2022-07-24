public class User {
    public String id;
    public String first_name;
    public String last_name;
    public Integer amount_of_money;


    public User (String id, String first_name,String last_name,Integer amount_of_money ){
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.amount_of_money = amount_of_money;

    }

    @Override
    public String toString() {

        return String.format("Id = %s; First Name = %s; Last Name = %s; Amount of money = %d", this.id, this.first_name, this.last_name, this.amount_of_money);

    }

}

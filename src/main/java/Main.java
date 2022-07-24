import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        TransactionHistory history = new TransactionHistory();

        List<User> UserList = new ArrayList<User>();
        UserList.add(new User("1", "Mykola", "Zuz", 1000));
        UserList.add(new User("2", "Slava", "Shevchenko", 500));
        UserList.add(new User("3", "Nikita", "Skovoroda", 2000));


        List<Product1> ProductList = new ArrayList<Product1>();
        ProductList.add(new Product1("12", "Milk", 100));
        ProductList.add(new Product1("13", "Water", 50));
        ProductList.add(new Product1("14", "Meat", 344));


        System.out.println(UserList);
        System.out.println(ProductList);

        buy_product(UserList.get(0), ProductList.get(1), history);


        System.out.println(history);

    }

    public static void buy_product(User user, Product1 product, TransactionHistory transactionHistory) throws Exception {

        if (user.amount_of_money >= product.price) {

            user.amount_of_money = user.amount_of_money - product.price;
            transactionHistory.addTransaction(user, product);
            System.out.println("Operation successful:");

        } else {

            throw new Exception("Not enough money");

        }

    }




}


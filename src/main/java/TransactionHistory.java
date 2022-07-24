import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionHistory {

    Map<String, List<Product1>> userToProducts = new HashMap<String, List<Product1>>();
    Map<String,List<User>> productToUsers = new HashMap<String, List<User>>();

    public  void addTransaction (User user, Product1 product1) {

        List<Product1> history = userToProducts.getOrDefault(user.id, new ArrayList<Product1>());
        history.add(product1);
        userToProducts.put(user.id, history);

        List<User> historyOfBuyingProduct = productToUsers.getOrDefault(product1.id, new ArrayList<User>());
        historyOfBuyingProduct.add(user);
        productToUsers.put(product1.id, historyOfBuyingProduct);


    }

    @Override
    public String toString() {

        return this.userToProducts.toString()+"\n" + this.productToUsers.toString();
    }




}

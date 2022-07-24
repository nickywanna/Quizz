public class Product1 {
    public String id;
    public String name;
    public Integer price;

    public Product1 (String id, String name,Integer price ) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString(){
        return String.format("Id = %s; Name = %s; Price = %d", this.id, this.name, this.price);
    }
}

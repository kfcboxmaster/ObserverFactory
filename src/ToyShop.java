import java.util.ArrayList;
import java.util.List;

public class ToyShop implements Observer{
    List<Product> list = new ArrayList<>();
    private String buyerName;
    public ToyShop(String buyerName){
        this.buyerName = buyerName;
    }
    @Override
    public void update(Product toy){
        System.out.println(buyerName + ", we glad to introduce our new toy!\n" + toy);
        list.add(toy);
        display();
    }
    @Override
    public void display(){
        System.out.println("That's our full list of inventory.");
        System.out.println(list + "\n " +
                "===========================================================");
    }
}

import java.util.List;

/**
 * Created by PetruninaIN on 22.01.2016.
 */
public class BasketMain {
    public static void main(String[] args) {
        Basket baskets = new Basket() {
            @Override
            public void addProduct(String product, int quantity) {

            }

            @Override
            public void removeProduct(String product) {

            }

            @Override
            public void updateProductQuantity(String product, int quantity) {

            }

            @Override
            public void clear() {

            }

            @Override
            public List<String> getProducts() {
                return null;
            }

            @Override
            public int getProductQuantity(String product) {
                return 0;
            }
        };
    }
}

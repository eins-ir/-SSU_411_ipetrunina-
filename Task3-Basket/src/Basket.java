import java.util.List;

/**
 * Created by PetruninaIN on 22.01.2016.
 */
public interface Basket {
    void addProduct(String product, int quantity);
    void removeProduct(String product);
    void updateProductQuantity(String product, int quantity);
    void clear();
    List<String> getProducts();
    int getProductQuantity(String product);
}
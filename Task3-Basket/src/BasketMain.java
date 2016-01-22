import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.util.*;

/**
 * Created by PetruninaIN on 22.01.2016.
 */

//???????? ??? map

public class BasketMain implements Basket{

        Map<String, Integer> hm = new HashMap<String, Integer>();

        @Override
        public void addProduct(String product, int quantity) {
                hm.put(product,quantity);
        }

        @Override
        public void removeProduct(String product) {
                hm.remove(product);
        }

        @Override
        public void updateProductQuantity(String product, int quantity) {
                int value = hm.get(product);
                hm.put(product, value + quantity);
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

        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter product:");
                String product = scanner.nextLine();
                System.out.println("Enter quantity:");
                int quantity = Integer.parseInt(scanner.nextLine());




        }
    }


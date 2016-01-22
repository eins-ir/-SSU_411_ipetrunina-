import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.util.*;

/**
 * Created by PetruninaIN on 22.01.2016.
 */

//???????? ??? map

public class BasketMain{
        public static void main(String[] args) {

        Map<String, Integer> hm = new HashMap<String, Integer>();

        Basket basket = new Basket() {
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
                        hm.clear();
                }

                @Override
                public List<String> getProducts() {
                        Set<Map.Entry<String, Integer>> set = hm.entrySet();
                        for (Map.Entry<String, Integer> me : set) {
                                System.out.print(me.getKey());
                        }
                        return null;
                }

                @Override
                public int getProductQuantity(String product) {
                        Set<Map.Entry<String, Integer>> set = hm.entrySet();
                        for (Map.Entry<String, Integer> me : set) {
                                System.out.print(me.getKey()+ ": ");
                                System.out.println(me.getValue());
                        }
                        return 0;
                }
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product:");
        String product = scanner.nextLine();
        System.out.println("Enter quantity:");
        int quantity = Integer.parseInt(scanner.nextLine());
        //basket.addProduct(product,quantity);
       // basket.getProducts();

        }
    }


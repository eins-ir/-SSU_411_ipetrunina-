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
                                System.out.println();
                        }
                        return null;
                }

                @Override
                public int getProductQuantity(String product) {
                        System.out.print(hm.get(product));
                        return 0;
                }
        };

        Scanner scanner = new Scanner(System.in);
        while (true) {
                System.out.println("1 - add product");
                System.out.println("2 - delete product");
                System.out.println("3 - update product quantity");
                System.out.println("4 - delete all");
                System.out.println("5 - get products list");
                System.out.println("6 - get product quantity");
                System.out.println("Enter command:");
                int command = Integer.parseInt(scanner.nextLine());

                if(command == 1) {
                        System.out.println("Enter product:");
                        String product = scanner.nextLine();
                        System.out.println("Enter quantity:");
                        int quantity = Integer.parseInt(scanner.nextLine());
                        basket.addProduct(product, quantity);
                }
                else if(command == 2) {
                        System.out.println("Enter product:");
                        String product = scanner.nextLine();
                        basket.removeProduct(product);
                }
                else if(command == 3) {
                        System.out.println("Enter product:");
                        String product = scanner.nextLine();
                        System.out.println("Enter quantity:");
                        int quantity = Integer.parseInt(scanner.nextLine());
                        basket.updateProductQuantity(product,quantity);
                }
                else if(command == 4) {
                        basket.clear();
                }
                else if(command == 5) {
                        basket.getProducts();
                }
                else if(command == 6) {
                        System.out.println("Enter product:");
                        String product = scanner.nextLine();
                        basket.getProductQuantity(product);
                }
                else System.out.println("Error command");
                System.out.println();
                System.out.println();
        }
        }
    }


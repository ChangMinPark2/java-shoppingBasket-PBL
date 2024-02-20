package view;

import model.Product;

import java.util.Map;
import java.util.Set;

public class OutputView {
    public static final String READ_PRODUCTS = "상품 목록 확인";
    public static final String NOT_HAVE_PRODUCT = "해당 상품은 없습니다.";

    private OutputView() {
    }

    public static void readProducts(Set<Product> products) {
        System.out.println(READ_PRODUCTS);
        for (Product product : products) {
            System.out.println(product.getName() + " : " + product.getPrice());
        }
        System.out.println();
    }

    public static void printCart(Map<String, Integer> carts) {
        for (String name : carts.keySet()) {
            System.out.println(name + " : " + carts.get(name) + "개");
        }
    }
}

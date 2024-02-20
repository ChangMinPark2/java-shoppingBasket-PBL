package controller;

import model.Cart;
import model.Product;
import view.InputView;
import view.OutputView;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import static view.OutputView.NOT_HAVE_PRODUCT;
import static view.OutputView.readProducts;

public class ShoppingController {
    public void start() throws Exception {
        int productCount = Integer.parseInt(InputView.inputCount());
        Set<Product> products = new HashSet<>();
        createProduct(productCount, products);
        readProducts(products);
        Cart cart = new Cart();

        while (true) {
            String input = InputView.getUserAction();
            if (input.equals("읽기")) {
                readCart(cart);
                break;
            }
            createCart(input, cart, products);
            removeCart(input, cart, products);
        }
    }

    private void readCart(Cart cart) {
        OutputView.printCart(cart.showItem());
    }
    private void createCart(String input, Cart cart, Set<Product> products) throws Exception {
        if (input.equals("등록")) {
            String[] inputs = InputView.inputProductAndCount();
            Product product = getProductFromSet(products, inputs[0]);
            if (product != null) {
                cart.addProduct(product.getName(), Integer.parseInt(inputs[1]));
            } else {
                throw new Exception("없는 상품을 등록하셨습니다.");
            }
        }
    }

    private void removeCart(String input, Cart cart, Set<Product> products) throws Exception {
        if (input.equals("제거")) {
            String inputs = InputView.getProductNameToRemove();
            Product product = getProductFromSet(products, inputs);
            if (product != null) {
                cart.removeProduct(product.getName());
            } else {
                throw new Exception("없는 상품을 제거하셨습니다.");
            }
        }
    }

    private void createProduct(int count, Set<Product> products) throws IOException {
        for(int i = 0; i < count; i++) {
            String[] product = InputView.inputProductAndPrice();
            products.add(new Product(product[0], Integer.parseInt(product[1])));
        }
    }

    private Product getProductFromSet(Set<Product> products, String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
}

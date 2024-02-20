package model;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<String, Integer> items;

    public Cart() {
        this.items = new HashMap<>();
    }
    public void addProduct(String name, int count) {
        this.items.put(name, count);
    }

    public void removeProduct(String name) throws Exception {
        if (this.items.isEmpty()) throw new Exception("장바구니가 비어 있습니다.");
        this.items.remove(name);
    }

    public Map<String, Integer> showItem() {
        return this.items;
    }
}

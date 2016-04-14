package shopping.basket;

import shopping.domain.Item;

import java.io.Serializable;
import java.math.BigDecimal;

public class BasketItem implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Item item;

    private Integer quantity =1;

    public BasketItem(final Item item) {
        this.item=item;
    }

    public void incrementQuantity() {
        quantity++;
    }

    public BigDecimal getTotalPrice() {
        return item.getPrice().multiply(new BigDecimal(quantity));
    }

    public Item getItem() {
        return item;
    }

}

package shopping.basket;

import shopping.domain.Item;
import shopping.domain.Product;

import java.math.BigDecimal;

public abstract class BaseBasketTest {

    static final BigDecimal BANANA_PRICE = new BigDecimal("1.60");
    static final BigDecimal APPLE_PRICE = new BigDecimal("0.55");
    static final BigDecimal ORANGE_PRICE = new BigDecimal("2.55");
    static final BigDecimal LEMON_PRICE = new BigDecimal("0.25");
    static final BigDecimal PEACH_PRICE = new BigDecimal("1.27");

    final Item banana = new Item(Product.BANANA, BANANA_PRICE);
    final Item apple = new Item(Product.APPLE, APPLE_PRICE);
    final Item orange = new Item(Product.ORANGE, ORANGE_PRICE);
    final Item lemon = new Item(Product.LEMON, LEMON_PRICE);
    final Item peach = new Item(Product.PEACH, PEACH_PRICE);

    static final Integer TOTAL_ITEMS =2;

}

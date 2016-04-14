package shopping.basket;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.math.BigDecimal;
import java.util.Collection;

import static java.util.Arrays.asList;
import static junit.framework.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MultipleItemsShoppingBasketTest extends BaseBasketTest {

    private final ShoppingBasket shoppingBasket = new ShoppingBasket();


    private Integer numberOfItems;

    private BigDecimal totalBasketPrice;

    public MultipleItemsShoppingBasketTest(final Integer numberOfItems,
                                           final BigDecimal totalBasketPrice) {
        this.numberOfItems = numberOfItems;
        this.totalBasketPrice = totalBasketPrice;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return asList(new Object[][]{
                {0, BANANA_PRICE.add(ORANGE_PRICE).add(APPLE_PRICE).add(LEMON_PRICE).add(PEACH_PRICE).multiply(new BigDecimal(0))},
                {1, BANANA_PRICE.add(ORANGE_PRICE).add(APPLE_PRICE).add(LEMON_PRICE).add(PEACH_PRICE).multiply(new BigDecimal(1))},
                {5, BANANA_PRICE.add(ORANGE_PRICE).add(APPLE_PRICE).add(LEMON_PRICE).add(PEACH_PRICE).multiply(new BigDecimal(5))},
                {20, BANANA_PRICE.add(ORANGE_PRICE).add(APPLE_PRICE).add(LEMON_PRICE).add(PEACH_PRICE).multiply(new BigDecimal(20))},
                {25, BANANA_PRICE.add(ORANGE_PRICE).add(APPLE_PRICE).add(LEMON_PRICE).add(PEACH_PRICE).multiply(new BigDecimal(25))},
                {30, BANANA_PRICE.add(ORANGE_PRICE).add(APPLE_PRICE).add(LEMON_PRICE).add(PEACH_PRICE).multiply(new BigDecimal(30))}
        });
    }

    @Test
    public void multipleItemsTest() {
        for (Integer count = 0; count < numberOfItems; count++) {
            shoppingBasket.addItem(banana);
            shoppingBasket.addItem(orange);
            shoppingBasket.addItem(apple);
            shoppingBasket.addItem(lemon);
            shoppingBasket.addItem(peach);
        }
        assertEquals(totalBasketPrice.setScale(0, BigDecimal.ROUND_HALF_DOWN),
                shoppingBasket.calculateTotalPrice().setScale(0, BigDecimal.ROUND_HALF_DOWN));
    }
}

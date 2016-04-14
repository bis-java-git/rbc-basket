package shopping.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public final class Item implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String name;

    private final BigDecimal Price;

    public Item(final String name, final BigDecimal price) {
        this.name = name;
        Price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return Price;
    }


}

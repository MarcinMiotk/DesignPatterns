package net.keinesorgen.patterns.visitor.example2gof;

import java.util.Objects;

/**
 *
 */
class Currency {

    private int price;

    Currency(int price) {
        this.price = price;
    }

    void add(Currency from) {
        this.price += from.getPrice();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrice());
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Currency) {
            Currency c = (Currency) o;
            return Objects.equals(c.getPrice(), getPrice());
        }
        return false;
    }

    int getPrice() {
        return price;
    }

}

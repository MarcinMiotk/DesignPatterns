package net.keinesorgen.patterns.visitor.example2gof;

/**
 *
 */
class Card extends Equipment {

    private final int price;

    Card(String name, int price) {
        super(name);
        this.price = price;
    }

    @Override
    void accept(EquipmentVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    Watt getPower() {
        return new Watt();
    }

    @Override
    Currency getNetPrice() {
        return new Currency(price);
    }

    @Override
    Currency getDiscountPrice() {
        return new Currency((int) (price * 0.10));
    }

}

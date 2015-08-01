package net.keinesorgen.patterns.visitor.example2gof;

/**
 *
 */
class FloppyDisc extends Equipment {

    private final int price;

    FloppyDisc(String name, int price) {
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
        return new Currency(0);
    }
}

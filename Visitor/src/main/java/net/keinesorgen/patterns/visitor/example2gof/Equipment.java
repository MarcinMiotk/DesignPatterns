package net.keinesorgen.patterns.visitor.example2gof;

/**
 *
 */
abstract class Equipment {

    private final String name;

    Equipment(String name) {
        this.name = name;
    }

    abstract Watt getPower();

    abstract Currency getNetPrice();

    abstract Currency getDiscountPrice();

    abstract void accept(EquipmentVisitor visitor);

    String getName() {
        return name;
    }
}

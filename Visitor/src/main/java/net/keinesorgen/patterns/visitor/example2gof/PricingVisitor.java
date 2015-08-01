package net.keinesorgen.patterns.visitor.example2gof;

/**
 *
 */
class PricingVisitor extends EquipmentVisitor {

    private final Currency total = new Currency(0);

    @Override
    void visit(FloppyDisc floppyDisc) {
        getTotal().add(floppyDisc.getNetPrice());
    }

    @Override
    void visit(Card card) {
        getTotal().add(card.getNetPrice());
    }

    @Override
    void visit(Computer chassis) {
        getTotal().add(chassis.getNetPrice());
    }

    @Override
    void visit(Bus bus) {
        getTotal().add(bus.getNetPrice());
    }

    Currency getTotal() {
        return total;
    }

}

package net.keinesorgen.patterns.visitor.example2gof;

/**
 *
 */
class InventoryVisitor extends EquipmentVisitor {

    private final StringBuilder sb = new StringBuilder();

    @Override
    void visit(FloppyDisc floppyDisc) {
        sb.append(floppyDisc.getName());
        sb.append(", ");
    }

    @Override
    void visit(Card card) {
        sb.append(card.getName());
        sb.append(", ");
    }

    @Override
    void visit(Computer chassis) {
        sb.append(chassis.getName());
        sb.append(", ");
    }

    @Override
    void visit(Bus bus) {
        sb.append(bus.getName());
        sb.append(", ");
    }

    @Override
    public String toString() {
        return sb.toString();
    }

}

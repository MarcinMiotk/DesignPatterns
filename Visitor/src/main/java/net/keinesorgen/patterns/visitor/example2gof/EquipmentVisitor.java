package net.keinesorgen.patterns.visitor.example2gof;

/**
 *
 */
abstract class EquipmentVisitor {

    abstract void visit(FloppyDisc floppyDisc);

    abstract void visit(Card card);

    abstract void visit(Computer chassis);

    abstract void visit(Bus bus);
}

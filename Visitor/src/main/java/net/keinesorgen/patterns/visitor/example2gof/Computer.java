package net.keinesorgen.patterns.visitor.example2gof;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
class Computer extends Equipment {

    private final List<Equipment> parts = new ArrayList<>();

    private Computer(String name) {
        super(name);
    }

    @Override
    Watt getPower() {
        return new Watt();
    }

    @Override
    Currency getNetPrice() {
        return new Currency(0);
    }

    @Override
    Currency getDiscountPrice() {
        return new Currency(0);
    }

    @Override
    void accept(EquipmentVisitor visitor) {
        for (Equipment candidate : parts) {
            candidate.accept(visitor);
        }
        visitor.visit(this);
    }

    boolean add(Equipment candidate) {
        return parts.add(candidate);
    }

    static class ComputerBuilder {

        // mandatory
        private final String name;
        private Bus bus;
        private Card card;
        // optional
        private FloppyDisc floppy;

        public ComputerBuilder(String name) {
            this.name = name;
        }

        ComputerBuilder bus(Bus bus) {
            this.bus = bus;
            return this;
        }

        ComputerBuilder card(Card card) {
            this.card = card;
            return this;
        }

        ComputerBuilder floppy(FloppyDisc floppy) {
            this.floppy = floppy;
            return this;
        }

        Computer build() throws ComputerBuildingException {
            if (bus == null) {
                throw new ComputerBuildingException("bus is mandatory");
            }
            if (card == null) {
                throw new ComputerBuildingException("card is mandatory");
            }
            Computer computer = new Computer(name);
            computer.add(bus);
            computer.add(card);
            computer.add(floppy);
            return computer;
        }

        class ComputerBuildingException extends Exception {

            public ComputerBuildingException(String string) {
                super(string);
            }

        }
    }
}

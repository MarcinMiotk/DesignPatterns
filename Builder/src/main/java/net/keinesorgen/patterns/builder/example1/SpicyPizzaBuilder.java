package net.keinesorgen.patterns.builder.example1;

/**
 * ConcreteBuilder no 2
 */
class SpicyPizzaBuilder extends PizzaBuilder {

    @Override
    public void buildDough() {
        pizza.setDough("pan baked");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("hot");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("pepperoni+salami");
    }

}

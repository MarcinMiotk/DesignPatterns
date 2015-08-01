package net.keinesorgen.patterns.builder.example1;

/**
 * Product
 */
class Pizza {

    private String dough = "";
    private String sauce = "";
    private String topping = "";

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    /**
     * @return the dough
     */
    public String getDough() {
        return dough;
    }

    /**
     * @return the sauce
     */
    public String getSauce() {
        return sauce;
    }

    /**
     * @return the topping
     */
    public String getTopping() {
        return topping;
    }
}

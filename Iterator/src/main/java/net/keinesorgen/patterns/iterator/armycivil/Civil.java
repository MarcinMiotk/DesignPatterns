package net.keinesorgen.patterns.iterator.armycivil;

/**
 *
 */
public class Civil extends Person {

    private final int birthYear;

    public Civil(int birthYear) {
        this.birthYear = birthYear;
    }

    /**
     * @return the birthYear
     */
    protected int getBirthYear() {
        return birthYear;
    }

    @Override
    public String toString() {
        return "Civil - " + birthYear + " year of birth";
    }

}

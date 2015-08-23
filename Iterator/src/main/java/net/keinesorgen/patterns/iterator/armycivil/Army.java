package net.keinesorgen.patterns.iterator.armycivil;

/**
 *
 */
public class Army extends Person {

    private int rank;

    public Army() {
    }

    public Army(int rank) {
        this.rank = rank;
    }

    /**
     * @return the rank
     */
    protected int getRank() {
        return rank;
    }

    /**
     * @param rank the rank to set
     */
    protected void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Army - " + rank + " rank";
    }

}

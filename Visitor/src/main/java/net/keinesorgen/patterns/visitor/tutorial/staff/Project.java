package net.keinesorgen.patterns.visitor.tutorial.staff;

public class Project {

    private final int profit;
    private final int duration;

    public Project(int profit, int duration) {
        this.profit = profit;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public int getProfit() {
        return profit;
    }
}

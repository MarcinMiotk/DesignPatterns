package net.keinesorgen.patterns.memento.example3;

/**
 *
 */
public class PreviousCalculationImp implements PreviousCalculationTakeCareTaker, PreviousCalculationToOriginator {

    private final int firstNumber;
    private final int secondNumber;

    public PreviousCalculationImp(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    /**
     * @return the firstNumber
     */
    @Override
    public int getFirstNumber() {
        return firstNumber;
    }

    /**
     * @return the secondNumber
     */
    @Override
    public int getSecondNumber() {
        return secondNumber;
    }

}

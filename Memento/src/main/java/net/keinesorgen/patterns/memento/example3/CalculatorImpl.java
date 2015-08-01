package net.keinesorgen.patterns.memento.example3;

/**
 *
 */
public class CalculatorImpl implements Calculator {

    private int firstNumber;
    private int secondNumber;

    @Override
    public void setFirstNumber(int value) {
        this.firstNumber = value;
    }

    @Override
    public void setSecondNumber(int value) {
        this.secondNumber = value;
    }

    @Override
    public int getCalculationResult() {
        return firstNumber+secondNumber;
    }

    @Override
    public PreviousCalculationTakeCareTaker backupLastCalculation() {
        return new PreviousCalculationImp(firstNumber, secondNumber);
    }

    @Override
    public void restorePreviousCalculation(PreviousCalculationTakeCareTaker memento) {
        if (memento instanceof PreviousCalculationToOriginator) {
            this.firstNumber = ((PreviousCalculationToOriginator) memento).getFirstNumber();
            this.secondNumber = ((PreviousCalculationToOriginator) memento).getSecondNumber();
        }
    }

}

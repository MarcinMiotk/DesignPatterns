package net.keinesorgen.patterns.memento.example3;

/**
 *
 */
interface Calculator {

    void setFirstNumber(int value);

    void setSecondNumber(int value);

    int getCalculationResult();

    // memento
    PreviousCalculationTakeCareTaker backupLastCalculation();

    void restorePreviousCalculation(PreviousCalculationTakeCareTaker memento);

}

package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal numberOfPills = BigDecimal.valueOf(387);
        BigDecimal pillsPerBox = BigDecimal.valueOf(20);
        BigDecimal requiredBoxes = calculateNumberOfRequiredBoxes(numberOfPills, pillsPerBox);
        System.out.println(requiredBoxes);
    }

    private static BigDecimal calculateNumberOfRequiredBoxes(BigDecimal numberOfPills, BigDecimal pillsPerBox) {
        return // TODO implement calculation
    }
}
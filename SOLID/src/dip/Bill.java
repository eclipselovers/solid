package dip;

import java.util.Date;

interface DeductionCalculator {
    float calcDeduction(float amount, int percentage);
}

interface VATCalculator {
    float calcVAT(float amount);
}

class Deduction implements DeductionCalculator {
    @Override
    public float calcDeduction(float amount, int percentage) {
        return amount * percentage / 100;
    }
}

class VAT implements VATCalculator {
    @Override
    public float calcVAT(float amount) {
        return amount * 0.21f; 
        }
}

public class Bill {
    public String code;
    public Date billDate;
    public float billAmount;
    public float VATAmount;
    public float billDeduction;
    public float billTotal;
    public int deductionPercentage;

    private DeductionCalculator deductionCalculator;
    private VATCalculator vatCalculator;

    public Bill(DeductionCalculator deductionCalculator, VATCalculator vatCalculator) {
        this.deductionCalculator = deductionCalculator;
        this.vatCalculator = vatCalculator;
    }

    public void totalCalc() {
        billDeduction = deductionCalculator.calcDeduction(billAmount, deductionPercentage);
        VATAmount = vatCalculator.calcVAT(billAmount);
        billTotal = (billAmount - billDeduction) + VATAmount;
    }
}

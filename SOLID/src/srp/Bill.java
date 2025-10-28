package srp;

import java.util.Date;

public class Bill {
	public String code;
	public Date billDate;
	public float billAmount;
	public float VAT;
	public float billDeduction;
	public float billTotal;
	public int deductionPercentage;

	// Fakturaren totala kalkulatzen duen metodoa.
	public void totalCalc() {
		// Dedukzioa kalkulatu
		billdedukzioa deduk = new billdedukzioa(billAmount, deductionPercentage);
		billDeduction = deduk.calc();
		// VAT kalkulatzen dugu
		VATcalc vat = new VATcalc(billAmount);
		VAT = vat.calc();
		// Totala kalkulatzen dugu
		billTotal = (billAmount - billDeduction) + VAT;
	}
}

package dip;

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
	Deduction d=new Deduction();
	billDeduction = d .calcDeduction(billAmount ,deductionPercentage);
	// VAT kalkulatzen dugu
	VAT vat=new VAT();
	VATAmount = vat.calcVAT(billAmount);
	// Totala kalkulatzen dugu
	billTotal = (billAmount - billDeduction) + VATAmount
	}
}

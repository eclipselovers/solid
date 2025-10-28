package srp;

public class VATcalc {
	public float billAmount;
	public float vatp;
	
	public VATcalc(float amount) {
		billAmount = amount;
		vatp =(float) 0.16;
	}
	
	public VATcalc(float amount, double p) {
		billAmount = amount;
		vatp = (float)p;
	}

	
	public float calc() {
		return  billAmount*vatp;
	}
}

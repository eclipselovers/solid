package srp;

public class billdedukzioa {
	public float billAmount;
	public int deductionPercentage;
	
	public billdedukzioa(float bamount,int dporcent) {
		billAmount = bamount;
		deductionPercentage = dporcent;
	}
	
	public float calc() {
		return (billAmount * deductionPercentage) / 100;
	}
}

package employee;

public class SalesEmployee extends Employee {
	private int totalSales;
	private double totalCom;
	private static final int COM_RATE = 2;

	public SalesEmployee() {
		// TODO Auto-generated constructor stub
	}

	public int getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(int totalSales) {
		this.totalSales = totalSales;
	}

	public double getTotalCom() {
		return totalCom;
	}

	public void setTotalCom(double totalCom) {
		this.totalCom = totalCom;
	}

	public static int getComRate() {
		return COM_RATE;
	}

}

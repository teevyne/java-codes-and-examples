package assignmentSolution;

import java.util.ArrayList;
public class EarningsList {

	private ArrayList<Earnings> earnList = new ArrayList<>();
	private int MAX;
	private int amount;

	public EarningsList(ArrayList<Earnings> earnList, int MAX) {
		this.MAX = 0;
		this.earnList = earnList;
		this.MAX = MAX;
	}

	public EarningsList(int amount) {
		this.MAX = 0;
		// TODO Auto-generated constructor stub
		this.amount = amount;
	}

	public ArrayList<Earnings> getEarnList() {
		return earnList;
	}

	public void setEarnList(ArrayList<Earnings> earnList) {
		this.earnList = earnList;
	}
	
	public int getTotalEmployees() {
		return earnList.size();
	}
	
	public boolean isFull() {
		return earnList.size() == MAX;
	}
	
	public boolean addEarning(Earnings newEarn) {
		if(!isFull()) {
			earnList.add(newEarn);
			return true;
		}
		else {
			System.out.println("The list is already full!");
			return false;
		}
	}
	
	//Get an earning in a particular position
	public Earnings getEarning(int earnPosition) {
		if (earnPosition >= 1 && earnPosition <= earnList.size()) {
			return earnList.get(earnPosition - 1);
		}
		else {
			System.out.println("This earning is not listed");
			return null;
		}
	}
	
	public double calculateTotalEarnings() {
		double totalSalary = 0;
		for (Earnings earn : earnList) {
			totalSalary += earn.getSalary();
		}
		return totalSalary;
	}
	
	@Override
	public String toString()
	{
	return earnList.toString();
	}
}

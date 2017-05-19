package Sheet5Classes;

class GymMembership {
	
	private static int memberCounter = 100;
	private String memberName;
	private int memberNo;
	private double memCost = 30;
	private String payment;
	
	public GymMembership () {
		memberNo = memberCounter; 
		memberCounter++;
		payment = "Monthly";//default
	}
	
	public  GymMembership(String memberName, String payment) {

		this();//includes the first constructor
		setName(memberName);
		setPayment(payment);
		setMemCost(memCost);
		
	}
	
	public void setName(String memberName){
		this.memberName = memberName;
	}
		
	public void setPayment (String payment) {
		if(payment.equals("Monthly") || payment.equals("Per Year")){
			this.payment = payment;
		}else {
			System.out.println("Paymetn should be Mothly or Per Year \nType Monthly or Per Year");
		}
	}
	
	public void setMemCost (double memCost){
		
		if (payment.equals("Monthly")){
			this.memCost = memCost;
		} else if  (payment.equals("Per Year")){
			this.memCost =(memCost*12)/1.15;
		}
	}
	
	String getName() {
		return memberName;
	}
	
	double getMemberCost () {		
		return memCost;
	}
	
	String getPayment () {
		return payment;
	}
	
	int getMemberNo () {
		return memberNo;
	}
	
	public String toString () {
		return "Member ID: " + memberNo +
				"\nName: " + memberName +
				String.format("\nCost: €%.2f", memCost) +
				" " + payment + "\n";
	}
}

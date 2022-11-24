package startproject;

public class construction {

	protected String accName;
	protected String accNo;
	protected String bankName;	
	public construction() {
	
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
		
	public construction(String accName, String accNo, String bankName) {
		super();
		this.accName = accName;
		this.accNo = accNo;
		this.bankName = bankName;
	}
	protected void display() {
		{
		System.out.println("Account Name " +accName);
		System.out.println("Account Number " +accNo);
		System.out.println("Bank Name " +bankName);
		}
		class CurrentAccount extends construction{
			private String tinNumber;

			public CurrentAccount() {
				
					
}

	public construction(String accName,String accNo, String bankName,String tinNumber) {
 
			super(accName,accNo,bankName);
			this.tinNumber = tinNumber;

		}
	public String getTinNumber() {
		return tinNumber;
	}

	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}
	public void display() {
		super.display();
	}

	public static void main(String[] args) {
		

	}

}

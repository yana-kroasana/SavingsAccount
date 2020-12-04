package objects;

public class SavingsAccount {
	public double balance;
	public double interestRate = 0.1;
	public String name;
	
	public void deposit( double sum ) {
		balance += sum;
		System.out.println("Successful deposit " + sum + " new balance " + balance );
	}
	
	public void withdraw( double sum ) {
		if( sum < 0 || sum > balance ) {
			System.out.println("error");
			return;
		}
		
		balance -= sum;
		System.out.println("Successful withdraw " + sum + " new balance " + balance );
	}
}

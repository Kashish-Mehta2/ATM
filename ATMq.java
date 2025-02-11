package ATM;
import java.util.Scanner;

public class ATMq {
	
	    private int balance;
	    private int pin;
	    
	    // Constructor to initialize balance and pin
	    public void ATM(int balance, int pin) {
	        this.balance = balance;
	        this.pin = pin;
	    }
	    
	    // Display the ATM menu
	    public void displayMenu() {
	        System.out.println("1: Check Balance");
	        System.out.println("2: Deposit");
	        System.out.println("3: Withdraw");
	        System.out.println("4: Change Pin");
	        System.out.println("5: Exit");
	    }
	    
	    // Deposit method to add amount to the balance
	    public void deposit(int amount) {
	        if (amount <= 0) {
	            System.out.println("Please enter a positive amount.");
	            return;
	        }
	        balance += amount;
	    }
	    
	    // Withdraw method to subtract amount from the balance
	    public void withdraw(int amount) {
	        if (amount <= 0) {
	            System.out.println("Please enter a positive amount.");
	            return;
	        }
	        if (balance < amount) {
	            System.out.println("Insufficient Balance!");
	            return;
	        }
	        balance -= amount;
	    }
	    
	    // Getter for balance
	    public int getBalance() {
	        return balance;
	    }
	    
	    // Validate the PIN entered by the user
	    public boolean validatePin(int pin) {
	        return this.pin == pin;
	    }
	    
	    // Change the PIN to a new one
	    public void changePin(int newPin) {
	        pin = newPin;
	        System.out.println("Pin Changed Successfully.");
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        ATM atm = new ATM(1000, 6474);
	        System.out.print("Enter your PIN: ");
	        
	        // Validate PIN
	        int pin = scanner.nextInt();
	        
	        if (atm.ValidatePin(pin)) {
	            int option = 0;
	            while (option != 5) {
	                atm.displayMenu();
	                System.out.print("Choose an option: ");
	                option = scanner.nextInt();
	                
	                switch (option) {
	                    case 1:
	                        System.out.println("Balance: " + atm.getBalance());
	                        break;
	                    case 2:
	                        System.out.print("Enter amount to deposit: ");
	                        int depositAmount = scanner.nextInt();
	                        atm.deposit(depositAmount);
	                        break;
	                    case 3:
	                        System.out.print("Enter amount to withdraw: ");
	                        int withdrawAmount = scanner.nextInt();
	                        atm.withdraw(withdrawAmount);
	                        break;
	                    case 4:
	                        System.out.print("Enter your new PIN: ");
	                        int newPin = scanner.nextInt();
	                        atm.changePin(newPin);
	                        break;
	                    case 5:
	                        System.out.println("Thank you for using the ATM.");
	                        System.out.println("Have a nice day!");
	                        break;
	                    default:
	                        System.out.println("Invalid option. Please try again.");
	                        break;
	                }
	            }
	        } else {
	            System.out.println("Incorrect PIN entered.");
	        }
	        
	        scanner.close();
	    }
	}



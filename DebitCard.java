 



/**
 * Write a description of class DebitCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DebitCard extends BankCard
{
    private int pin_Number;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;
    //creating the constructor class for DebitCard with its respective parameters
    public DebitCard(int balanceAmount, int cardId, String bankAccount, String issuerBank, String clientName, int pin_Number){
        super(balanceAmount, cardId, bankAccount, issuerBank);
        this.setClientName(clientName);
        this.pin_Number=pin_Number;
        this.hasWithdrawn=false;
    }
    //Creating the corressponding accessor method for the attribute of Debit Card class
    public int getPIN_Number(){
        return this.pin_Number;
    }
    public int getWithdrawalAmount(){
        return this.withdrawalAmount;
    }
    public String getDateOfWithdrawal(){
        return this.dateOfWithdrawal;
    }
    public boolean getHasWithdrawn(){
        return this.hasWithdrawn;
    }
    
    //Creating a mutator method for Withdrawal amount for which we use set keyword
    public void setWithdrawalAmount(int withdrawalAmount){
        this.withdrawalAmount=withdrawalAmount;
    }
    public void withdraw(int WithdrawalAmount, String DateOfWithdrawal, int PIN_Number){
        if(this.pin_Number == PIN_Number && super.getBalanceAmount() >= WithdrawalAmount){
           this.withdrawalAmount=WithdrawalAmount;
           this.setWithdrawalAmount(WithdrawalAmount);
           this.dateOfWithdrawal=DateOfWithdrawal;
           this.setBalanceAmount(this.getBalanceAmount() - WithdrawalAmount);
           this.hasWithdrawn=true;
        }
        else if(PIN_Number != this.pin_Number){
        System.out.println("Invalid PIN number");
        }
        else{
        System.out.println("Cash is not sufficient");
        }
    }
    //Displaying the details of the Debit card
    public void display(){
        super.display();
        if(this.hasWithdrawn=true){
            System.out.println("PIN Number:" +this.pin_Number);
            System.out.println("Withdrawal Amount:" +this.withdrawalAmount);
            System.out.println("Date Of Withdrawal:" +this.dateOfWithdrawal);
        }
        else{
            System.out.println("No transaction has been carried out");
        }
        
    }
}



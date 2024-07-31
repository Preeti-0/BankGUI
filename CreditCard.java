 


/**
 * Write a description of class CreditCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreditCard extends BankCard
{
    private int cvc_number;
    private int creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    //Creating the constructor for the CreditCard class with its parameter
    public CreditCard(int cardId, String clientName, String issuerBank, String bankAccount, int balanceAmount, int cvc_number,
    double interestRate, String expirationDate){
        super(balanceAmount, cardId, bankAccount, issuerBank);
        super.setClientName(clientName);
        super.setBalanceAmount(balanceAmount);
        this.cvc_number=cvc_number;
        this.interestRate=interestRate;
        this.expirationDate=expirationDate;
        this.isGranted=false;
    }
    //creating the accessor method for each attribute of the CreditCard class
    public int getCVC_number(){
        return this.cvc_number;
    }
    public int getCreditLimit(){
        return this.creditLimit;
    }
    public double getInterestRate(){
        return this.interestRate;
    }
    public String getExpirationDate(){
        return this.expirationDate;
    }
    public int getGracePeriod(){
        return this.gracePeriod;
    }
    public boolean getIsGranted(){
        return this.isGranted;
    }
    //setting the credit limit
    public void setCreditLimit(int CreditLimit,int GracePeriod){
        if(CreditLimit <= 2.5 * super.getBalanceAmount()){
            this.creditLimit=CreditLimit;
            this.gracePeriod=GracePeriod;
            this.isGranted=true;
        }
        else{
            System.out.println("Credit Limit cannot be issued");
        }
    }
    //The method named canelCreditCard
    public void cancelcreditCard(){
        if(this.isGranted=true){
            this.cvc_number=0;
            this.creditLimit=0;
            this.gracePeriod=0;
            this.isGranted=false;
        }
    }
    //Displaying the details of the Credit Card class
    public void display(){
        super.display();
        if(isGranted == true){
            System.out.println("CVC number:" +this.cvc_number);
            System.out.println("Credit Limit:" +this.creditLimit);
            System.out.println("Interest rate:" +this.interestRate);
            System.out.println("Expiration Date:" +this.expirationDate);
            System.out.println("Grace Period:" +this.gracePeriod);
        }
        else{
            System.out.println("Credit Limit and Grace Period is not assigned.");
        }
    }
}


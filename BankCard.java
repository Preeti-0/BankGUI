 

/**
 * Write a description of class BankCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankCard
{
    private int cardId;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private int balanceAmount;
    //here we are making constructor and giving it parameter
    public BankCard(int balanceAmount,int cardId, String bankAccount, String issuerBank){
        this.balanceAmount=balanceAmount;
        this.cardId=cardId;
        this.bankAccount=bankAccount;
        this.issuerBank=issuerBank;
        this.clientName="";
    }
    //Creating the accessor method for the corresponding attributes
    public int getBalanceAmount(){
        return this.balanceAmount;
    }

    public int getCardId(){
        return this.cardId;
    }

    public String getBankAccount(){
        return this.bankAccount;
    }

    public String getIssuerBank(){
        return this.issuerBank;
    }
    
    public String getClientName(){
        return this.clientName;
    }
    //Setting the client name
    public void setClientName(String clientName){
        this.clientName= clientName;
    }

    public void setBalanceAmount(int balanceAmount){
        this.balanceAmount= balanceAmount;
    }
    //Displaying the details of the BankCard class
    public void display(){
        if(this.clientName==""){               //* here clientName is an empty string*/ 
            System.out.println("Client name is not assigned.");
        }
        else{
        System.out.println("Client Name:" +this.clientName);
        System.out.println("Balance Amount:" +this.balanceAmount);
        System.out.println("Card Id:" +this.cardId);
        System.out.println("Bank Account:" +this.bankAccount);
        System.out.println("Issuer Bank:" +this.issuerBank);
        }
    }
}


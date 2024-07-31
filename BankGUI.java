 
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import java.util.ArrayList;
/**
 * Write a description of class GUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class BankGUI 
{
    JFrame fr, fr_debitCard, fr2_creditCard;//creating the 3 frames
    //Creating the text-fields of BankGUI constructor, debitCard method and creditCard method
    JTextField tf_debitCardId, tf_debitClientName, tf_debitPinNumber, tf_debitIssuerBank, tf_debitBankAccount, tf_debitBalanceAmount, 
    tf_debitWithdrawalAmount, tf_creditCardId, tf_creditClientName, tf_creditIssuerBank, tf_creditBankAccount, tf_creditBalanceAmount,
    tf_creditCVCNumber, tf_creditCreditLimit, tf_creditInterestRate, tf_creditGracePeriod;
    //Creating the buttons used in BankGUI, DebitCard and CreditCard
    JButton jbut_debitCard, jbut_creditCard, jbut_withdraw, jbut_debitClear, jbut_debitHome, jbut_debitAddDebitCard,
    jbut_debitGoToCreditCard,jbut_creditClear , jbut_creditHome, jbut_creditSetCreditLimit, jbut_creditCancelCreditLimit,
    jbut_creditAddCreditCard, jbut_creditGoToDebitCard, jbut_debitDisplay, jbut_creditDisplay;
    //Creating the labels used in BankGUI, DebitCard and CreditCard
    JLabel lbl, lbl_debitCard, lbl_debitCardId, lbl_debitClientName, lbl_debitPinNumber, lbl_debitIssuerBank, lbl_debitBankAccount, 
    lbl_debitBalanceAmount, lbl_debitWithdrawalAmount, lbl_debitDateOfWithdrawal, lbl_creditCard, lbl_creditCardId, 
    lbl_creditClientName, lbl_creditIssuerBank, lbl_creditBankAccount, lbl_creditBalanceAmount, lbl_creditCVCNumber, lbl_creditCreditLimit, lbl_creditInterestRate,
    lbl_creditExpirationDate, lbl_creditGracePeriod;
    //Creating the combo-boxes used in BankGU, DebitCard and CreditCard
    JComboBox debit_CmBox1, debit_CmBox2, debit_CmBox3, credit_CmBox1, credit_CmBox2, credit_CmBox3;

    ArrayList<BankCard> arrayBankCard = new ArrayList<BankCard>();
    public BankGUI()//it is the constructor
    {
        fr = new JFrame("Welcome");

        JPanel panel = new JPanel();
        panel.setBorder(new CompoundBorder(BorderFactory.createLineBorder(new Color(0,0,0), 10),
                BorderFactory.createLineBorder(new Color(34,34,34),10)));
        panel.setBackground(new Color(68,68,68));
        panel.setBounds(1,1,773,606);
        panel.setLayout(null);

        JPanel paneell = new JPanel();
        paneell.setBorder(new CompoundBorder(BorderFactory.createLineBorder(new Color(102,102,102), 10),
                BorderFactory.createLineBorder(new Color(34,34,34),10)));
        paneell.setBackground(new Color(68,68,68));
        paneell.setBounds(30,30,695,505);
        paneell.setLayout(null);
        panel.add(paneell);

        JPanel paneel2 = new JPanel();
        paneel2.setBorder(new CompoundBorder(BorderFactory.createLineBorder(new Color(102,102,102), 10),
                BorderFactory.createLineBorder(new Color(34,34,34),10)));
        paneel2.setBackground(new Color(255,255,255));
        paneel2.setBounds(174,44,319,100);
        paneel2.setLayout(null);
        paneell.add(paneel2);

        JPanel paneel3 = new JPanel();
        paneel3.setBorder(new CompoundBorder(BorderFactory.createLineBorder(new Color(102,102,102), 5),
                BorderFactory.createLineBorder(new Color(34,34,34),5)));
        paneel3.setBackground(new Color(255,255,255));
        paneel3.setBounds(30,339,300,72);
        paneel3.setLayout(null);
        paneell.add(paneel3);

        JPanel paneel4 = new JPanel();
        paneel4.setBorder(new CompoundBorder(BorderFactory.createLineBorder(new Color(102,102,102), 5),
                BorderFactory.createLineBorder(new Color(34,34,34),5)));
        paneel4.setBackground(new Color(255,255,255));
        paneel4.setBounds(355,339,300,72);
        paneel4.setLayout(null);
        paneell.add(paneel4);

        lbl = new JLabel("WELCOME");   
        lbl.setBounds(80,30,300,50);
        lbl.setFont(new Font("Arial", Font.BOLD, 30));// set the position and size of the label
        paneel2.add(lbl);

        jbut_debitCard= new JButton("Go to Debit Card");//set the position, size and design of the label
        jbut_debitCard.setBounds(10,16,280,40);
        jbut_debitCard.setFont(new Font("ARIAL", Font.BOLD, 18));
        jbut_debitCard.setForeground(Color.WHITE);
        jbut_debitCard.setBackground(new Color(80,80,80));
        paneel3.add(jbut_debitCard);

        jbut_creditCard = new JButton("Go to Credit Card");
        jbut_creditCard.setBounds(10,16,280,40);
        jbut_creditCard.setFont(new Font("ARIAL", Font.BOLD, 18));
        jbut_creditCard.setForeground(Color.WHITE);
        jbut_creditCard.setBackground(new Color(80,80,80));
        paneel4.add(jbut_creditCard);

            jbut_debitCard.addActionListener(new ActionListener(){//this button takes the user to the DebitCard frame form the home frame
                public void actionPerformed(ActionEvent e){
                    debitCard();
                }
            });

            jbut_creditCard.addActionListener(new ActionListener(){// this button takes the user to the CreditCard frame from the home frame
                public void actionPerformed(ActionEvent e){
                    creditCard();
                }
            });

        fr.add(panel);
        fr.setSize(773,606);
        fr.setVisible(true);
        fr.setResizable(false);
    }

    public void debitCard(){
        fr_debitCard= new JFrame("Debit Card");

        JPanel panel1 = new JPanel();
        panel1.setBorder(new CompoundBorder(BorderFactory.createLineBorder(new Color(0,0,0), 7),
                BorderFactory.createLineBorder(new Color(80,80,80),7)));
        panel1.setBackground(new Color(68,68,68));
        panel1.setBounds(0,0,1009,690);
        panel1.setLayout(null);

        JPanel paneelll = new JPanel();
        paneelll.setBorder(BorderFactory.createLineBorder(new Color(0,0,0), 7));
        paneelll.setBackground(new Color(204,204,153));
        paneelll.setBounds(13,13,686,623);
        paneelll.setLayout(null);        
        panel1.add(paneelll);

        JPanel paneelll1 = new JPanel();
        paneelll1.setBorder(BorderFactory.createLineBorder(new Color(0,0,0), 7));
        paneelll1.setBackground(new Color(204,204,153));
        paneelll1.setBounds(711,13,270,623);
        paneelll1.setLayout(null);        
        panel1.add(paneelll1);

        lbl_debitCard  = new JLabel("DEBIT CARD");//
        lbl_debitCard.setBounds(260,29,173,63);
        lbl_debitCard.setFont(new Font("Times New Roman", Font.BOLD, 25));
        paneelll.add(lbl_debitCard);

        lbl_debitCardId = new JLabel("Card ID:");
        lbl_debitCardId.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lbl_debitCardId.setBounds(67,128,72,28);
        paneelll.add(lbl_debitCardId);
        
        tf_debitCardId = new JTextField(30);
        tf_debitCardId.setBorder(BorderFactory.createLineBorder(new Color(0,0,0), 2));
        tf_debitCardId.setBounds(161,128,187,35);
        paneelll.add(tf_debitCardId);

        lbl_debitClientName = new JLabel("Client Name:");
        lbl_debitClientName.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lbl_debitClientName.setBounds(36,199,120,25);
        paneelll.add(lbl_debitClientName);
        
        tf_debitClientName = new JTextField(30);
        tf_debitClientName.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),2));
        tf_debitClientName.setBounds(161,199,187,35);
        paneelll.add(tf_debitClientName);

        lbl_debitPinNumber = new JLabel("PIN Number:");
        lbl_debitPinNumber.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lbl_debitPinNumber.setBounds(395,204,120,25);
        paneelll.add(lbl_debitPinNumber);
        
        tf_debitPinNumber = new JTextField(4);
        tf_debitPinNumber.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),2));
        tf_debitPinNumber.setBounds(513,198,156,40);
        paneelll.add(tf_debitPinNumber);

        lbl_debitIssuerBank = new JLabel("Issuer Bank:");
        lbl_debitIssuerBank.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lbl_debitIssuerBank.setBounds(42,267,114,25);
        paneelll.add(lbl_debitIssuerBank);
        
        tf_debitIssuerBank = new JTextField(30);
        tf_debitIssuerBank.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),2));
        tf_debitIssuerBank.setBounds(161,267,187,35);
        paneelll.add(tf_debitIssuerBank);

        lbl_debitBankAccount = new JLabel("Bank Account:");
        lbl_debitBankAccount.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lbl_debitBankAccount.setBounds(24,335,131,25);
        paneelll.add(lbl_debitBankAccount);
        
        tf_debitBankAccount = new JTextField(30);
        tf_debitBankAccount.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),2));
        tf_debitBankAccount.setBounds(159,335,192,35);
        paneelll.add(tf_debitBankAccount);

        lbl_debitBalanceAmount = new JLabel("Balance Amount:");
        lbl_debitBalanceAmount.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lbl_debitBalanceAmount.setBounds(373,343,147,25);
        paneelll.add(lbl_debitBalanceAmount);
        
        tf_debitBalanceAmount = new JTextField(30);
        tf_debitBalanceAmount.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),2));
        tf_debitBalanceAmount.setBounds(513,337,156,37);
        paneelll.add(tf_debitBalanceAmount);

        jbut_withdraw = new JButton("To Withdraw");
        jbut_withdraw.setBounds(296,395,134,32);
        jbut_withdraw.setFont(new Font("Times New Roman", Font.BOLD, 20));
        jbut_withdraw.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),2));
        paneelll.add(jbut_withdraw);

        lbl_debitWithdrawalAmount = new JLabel("Withdrawal Amount:");
        lbl_debitWithdrawalAmount.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lbl_debitWithdrawalAmount.setBounds(175,446,169,28);
        paneelll.add(lbl_debitWithdrawalAmount);
        
        tf_debitWithdrawalAmount = new JTextField(30);
        tf_debitWithdrawalAmount.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),2));
        tf_debitWithdrawalAmount.setBounds(357,448,180,32);
        paneelll.add(tf_debitWithdrawalAmount);

        lbl_debitDateOfWithdrawal = new JLabel("Date of withdrawal:");
        lbl_debitDateOfWithdrawal.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lbl_debitDateOfWithdrawal.setBounds(156,511,160,28);
        paneelll.add(lbl_debitDateOfWithdrawal);
        String[] day = {"1","2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        debit_CmBox1 = new JComboBox(day);
        debit_CmBox1.setBounds(327,511,93,29);
        debit_CmBox1.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),2));
        String[] month = {"January", "February", "March", "april", "may", "June", "July", "August", "September", "October", "November", "December"};
        debit_CmBox2 = new JComboBox(month);
        debit_CmBox2.setBounds(426,511,93,29);
        debit_CmBox2.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),2));
        String[] year = {"2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023"};
        debit_CmBox3 = new JComboBox(year);
        debit_CmBox3.setBounds(525,511,93,29);
        debit_CmBox3.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),2));
        paneelll.add(debit_CmBox1);
        paneelll.add(debit_CmBox2);
        paneelll.add(debit_CmBox3);

        jbut_debitClear = new JButton("Clear All");
        jbut_debitClear.setBounds(303,570,120,32);
        jbut_debitClear.setFont(new Font("Times New Roman", Font.BOLD, 20));
        jbut_debitClear.setForeground(Color.BLACK);
        jbut_debitClear.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),2));
        paneelll.add(jbut_debitClear);

        jbut_debitHome = new JButton("HOME");
        jbut_debitHome.setBounds(60,150,140,50);
        jbut_debitHome.setFont(new Font("Times New Roman", Font.BOLD,20));
        jbut_debitHome.setForeground(Color.BLACK);
        jbut_debitHome.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),2));
        paneelll1.add(jbut_debitHome);

        jbut_debitAddDebitCard = new JButton("ADD DEBIT CARD");
        jbut_debitAddDebitCard.setBounds(30,250,205,50);
        jbut_debitAddDebitCard.setFont(new Font("Times New Roman", Font.BOLD,20));
        jbut_debitAddDebitCard.setForeground(Color.BLACK);
        jbut_debitAddDebitCard.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),2));
        paneelll1.add(jbut_debitAddDebitCard);

        jbut_debitGoToCreditCard = new JButton("GO TO CREDIT CARD");
        jbut_debitGoToCreditCard.setBounds(10,350,250,50);
        jbut_debitGoToCreditCard.setFont(new Font("Times New Roman", Font.BOLD,20));
        jbut_debitGoToCreditCard.setForeground(Color.BLACK);
        jbut_debitGoToCreditCard.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),2));
        paneelll1.add(jbut_debitGoToCreditCard);

        jbut_debitDisplay = new JButton("DISPLAY");
        jbut_debitDisplay.setBounds(30,450,205,50);
        jbut_debitDisplay.setFont(new Font("Times New Roman", Font.BOLD,20));
        jbut_debitDisplay.setForeground(Color.BLACK);
        jbut_debitDisplay.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),2));
        paneelll1.add(jbut_debitDisplay);

            jbut_debitClear.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    //Clear all text fields
                    tf_debitCardId.setText("");
                    tf_debitClientName.setText("");
                    tf_debitPinNumber.setText("");
                    tf_debitIssuerBank.setText("");
                    tf_debitBankAccount.setText("");
                    tf_debitBalanceAmount.setText("");
                    tf_debitWithdrawalAmount.setText("");
                    //Reset all JComboBoxes to default index
                    debit_CmBox1.setSelectedIndex(0);
                    debit_CmBox2.setSelectedIndex(0);
                    debit_CmBox3.setSelectedIndex(0);
                }
            });

            jbut_debitGoToCreditCard.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    fr_debitCard.dispose();//DebitCard frame gets hidden
                    creditCard();//CreditCard frame appears
                }
            });

        
            jbut_debitHome.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    fr_debitCard.dispose();//DebitCard frame gets hidden
                    fr.setVisible(true);//Home frame gets display
                }
            });

            jbut_debitAddDebitCard.addActionListener(new ActionListener(){//funtion for AddDebitCard button
                public void actionPerformed(ActionEvent e){
                    if(tf_debitCardId.getText().isEmpty() || tf_debitClientName.getText().isEmpty() || tf_debitPinNumber.getText().isEmpty() || tf_debitIssuerBank.getText().isEmpty() ||
                    tf_debitBankAccount.getText().isEmpty() || tf_debitBalanceAmount.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(fr_debitCard, "Fill all the details. Please fill up the empty field.", "Error", JOptionPane.INFORMATION_MESSAGE);
                        return;//stop the program execution
                    }
                    else
                    {
                        try//for getting text from field and add into arraylist
                        {
                            int cardId = Integer.parseInt(tf_debitCardId.getText());
                            String clientName = tf_debitClientName.getText();
                            int pin_Number = Integer.parseInt(tf_debitPinNumber.getText());
                            String issuerBank = tf_debitIssuerBank.getText();
                            String bankAccount = tf_debitBankAccount.getText();
                            int balanceAmount = Integer.parseInt(tf_debitBalanceAmount.getText());
                            boolean cardIdExists = false;//Here we have used flag
                            if (balanceAmount <= 0){
                                JOptionPane.showMessageDialog(fr_debitCard, "Balance Amount is invalid.", "Error", JOptionPane.INFORMATION_MESSAGE);
                                return;//stop the program execution
                            }
                            
                            //using for loop to iterate through BankCard
                            for(BankCard card : arrayBankCard){
                                DebitCard debitCard = (DebitCard)card;//type cast object to DebitCard
                                //checking if the cardId of debitCard is equal to cardId or not
                                if(debitCard.getCardId() == cardId){
                                    cardIdExists = true;//Setting the cardIdExists flag to true
                                    break;//stop the program exexution
                                }
                            }
                            if(cardIdExists){
                                JOptionPane.showMessageDialog(fr_debitCard, "Card ID already exists. Please enter a unique Card ID.", "Error", JOptionPane.INFORMATION_MESSAGE);
                        
                            }
                            else{
                                BankCard objDebitCard = new DebitCard(balanceAmount, cardId, bankAccount, issuerBank, clientName, pin_Number);
                                arrayBankCard.add(objDebitCard);
                                JOptionPane.showMessageDialog(fr_debitCard, "Debit Card added successfully.", "Successful", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }catch(NumberFormatException zee)//Here, the number format exception is used if any of the parameter might not accept string or integer
                        {
                            JOptionPane.showMessageDialog(fr_debitCard, "Please enter correct value", "Error", JOptionPane.INFORMATION_MESSAGE);
                            tf_debitCardId.setText("");
                            tf_debitClientName.setText("");
                            tf_debitPinNumber.setText("");
                            tf_debitIssuerBank.setText("");
                            tf_debitBankAccount.setText("");
                            tf_debitBalanceAmount.setText("");
                        }   
                    }
                }
            });

            jbut_debitDisplay.addActionListener(new ActionListener(){//this line is for the function of Display button in DebitCard 
                public void actionPerformed(ActionEvent display_object)
                {   //if the arrayBankCard of debitCard method is empty display message
                    if(arrayBankCard.isEmpty()){
                        JOptionPane.showMessageDialog(fr_debitCard, "Debit Card Unavailable", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        //for loop iterates the array named arrayBankCard and assigns element to the variable "display" of type "BankCard"
                        for(BankCard display: arrayBankCard){
                            //to check if a display is object of DebitCard or not
                            if(display instanceof DebitCard){
                                DebitCard debitCard = (DebitCard) display;
                                System.out.println("Balance Amount: "+ debitCard.getBalanceAmount()+ "\n" + "Bank Account: "+debitCard.getBankAccount()+ "\n" + "Issuer Bank:"
                                    +debitCard.getIssuerBank()+ "\n" + "Card Id: " + debitCard.getCardId() + "Client Name: " + debitCard.getClientName()+ "\n" +
                                    "PIN Number: " + debitCard.getPIN_Number()+ "\n");

                            }
                            else{
                                System.out.println("Debit Card is not available");
                            }
                        }
                    }
                }
            });

            jbut_withdraw.addActionListener(new ActionListener(){//actionlistener for withdraw button in Debit Card method
                public void actionPerformed(ActionEvent moneywithdraw)
                {
                    //checks if any fields are empty
                    if(tf_debitWithdrawalAmount.getText().isEmpty() || tf_debitPinNumber.getText().isEmpty() || tf_debitCardId.getText().isEmpty()){
                        JOptionPane.showMessageDialog(fr_debitCard,"Empty fields found.", "Alert", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        //if the values of withdrawalAmount and Pin Nunmber is less than zero display message
                        if(Integer.parseInt(tf_debitWithdrawalAmount.getText())<0 || Integer.parseInt(tf_debitPinNumber.getText())<0){
                            JOptionPane.showMessageDialog(fr_debitCard, "Values less than zero  is not accepted", "Card Id Error", JOptionPane.ERROR_MESSAGE);
                        }
                        else{
                            try{
                                //Get the requiured input data from the fields
                                int cardId = Integer.parseInt(tf_debitCardId.getText());
                                int withdrawalAmount = Integer.parseInt(tf_debitWithdrawalAmount.getText());
                                String day = (String) debit_CmBox1.getSelectedItem();
                                String month = (String) debit_CmBox2.getSelectedItem();
                                String year = (String) debit_CmBox3.getSelectedItem();
                                String dateOfWithdrawal = day + "/" + month + "/" +year;
                                int pinNumber = Integer.parseInt(tf_debitPinNumber.getText());
                                boolean cardIdFound = false;//created a flag named cardIdFound and set it false 
                                
                                for(BankCard money_withdraw: arrayBankCard){
                                    if(money_withdraw instanceof DebitCard){
                                        DebitCard debitCard = (DebitCard) money_withdraw;
                                        if(debitCard.getCardId() == cardId){
                                            cardIdFound = true;//setting the cardIdFound to true 
                                            int balanceAmount = debitCard.getBalanceAmount();
                                            if(withdrawalAmount <= balanceAmount){
                                                debitCard.withdraw(withdrawalAmount, dateOfWithdrawal, pinNumber);
                                                if(debitCard.getPIN_Number() == pinNumber){
                                                    JOptionPane.showMessageDialog(fr_debitCard, withdrawalAmount+" Withdrawan Successfully"
                                                    +"\n"+ "Date:" +dateOfWithdrawal + "\n"+ "Pin Number: " + pinNumber, "Money Withdraw", JOptionPane.INFORMATION_MESSAGE);
                                                }
                                                else{
                                                    JOptionPane.showMessageDialog(fr_debitCard, "Incorrect Pin Number", "Pin number Error", JOptionPane.ERROR_MESSAGE);
                                                }
                                            }
                                            else{
                                                JOptionPane.showMessageDialog(fr_debitCard, "Withdraw amount cannot exceed balance amount", "Alert", JOptionPane.ERROR_MESSAGE);
                                                }
                                                break; //found the card id so break the loop
                                        }
                                    }
                                }
                                if(!cardIdFound){
                                    //if cardIdFound is not true display error message
                                    JOptionPane.showMessageDialog(fr_debitCard, "Card ID does not match debit card", "Card ID Error", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                            catch(NumberFormatException mee){
                                JOptionPane.showMessageDialog(fr_debitCard, "Please enter valid data in the required field", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                }
            });

            
        

        fr_debitCard.add(panel1);
        fr_debitCard.setSize(1009,690);
        fr_debitCard.setVisible(true);
        fr_debitCard.setResizable(false);
    }

    public void creditCard(){
        fr2_creditCard= new JFrame("Credit Card");

        JPanel panel2 = new JPanel();
        panel2.setBorder(new CompoundBorder(BorderFactory.createLineBorder(new Color(0,0,0), 7),
                BorderFactory.createLineBorder(new Color(80,80,80),7)));
        panel2.setBackground(new Color(68,68,68));
        panel2.setBounds(0,0,1009,690);
        panel2.setLayout(null);

        JPanel paneelll3 = new JPanel();
        paneelll3.setBorder(BorderFactory.createLineBorder(new Color(0,0,0), 7));
        paneelll3.setBackground(new Color(204,204,153));
        paneelll3.setBounds(13,13,686,623);
        paneelll3.setLayout(null);        
        panel2.add(paneelll3);

        JPanel paneelll4 = new JPanel();
        paneelll4.setBorder(BorderFactory.createLineBorder(new Color(0,0,0), 7));
        paneelll4.setBackground(new Color(204,204,153));
        paneelll4.setBounds(711,13,270,623);
        paneelll4.setLayout(null);        
        panel2.add(paneelll4);

        lbl_creditCard  = new JLabel("CREDIT CARD");
        lbl_creditCard.setBounds(260,29,173,63);
        lbl_creditCard.setFont(new Font("Times New Roman", Font.BOLD, 25));
        paneelll3.add(lbl_creditCard);

        lbl_creditCardId = new JLabel("Card ID:");
        lbl_creditCardId.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lbl_creditCardId.setBounds(67,128,72,28);
        paneelll3.add(lbl_creditCardId);
        
        tf_creditCardId = new JTextField(30);
        tf_creditCardId.setBorder(BorderFactory.createLineBorder(new Color(0,0,0), 2));
        tf_creditCardId.setBounds(161,128,187,35);
        paneelll3.add(tf_creditCardId);

        lbl_creditCreditLimit = new JLabel("Credit Limit:");
        lbl_creditCreditLimit.setFont(new Font("Times New Roman", Font.BOLD,18));
        lbl_creditCreditLimit.setBounds(373,138,147,25);
        paneelll3.add(lbl_creditCreditLimit);
        
        tf_creditCreditLimit = new JTextField(30);
        tf_creditCreditLimit.setBorder(BorderFactory.createLineBorder(new Color(0,0,0), 2));
        tf_creditCreditLimit.setBounds(498,140,156,35);
        paneelll3.add(tf_creditCreditLimit);

        lbl_creditClientName = new JLabel("Client Name:");
        lbl_creditClientName.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lbl_creditClientName.setBounds(36,199,120,25);
        paneelll3.add(lbl_creditClientName);
        
        tf_creditClientName = new JTextField(30);
        tf_creditClientName.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),2));
        tf_creditClientName.setBounds(161,199,187,35);
        paneelll3.add(tf_creditClientName);

        lbl_creditIssuerBank = new JLabel("Issuer Bank:");
        lbl_creditIssuerBank.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lbl_creditIssuerBank.setBounds(380,204,120,25);
        paneelll3.add(lbl_creditIssuerBank);
        
        tf_creditIssuerBank = new JTextField(30);
        tf_creditIssuerBank.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),2));
        tf_creditIssuerBank.setBounds(500,204,170,35);
        paneelll3.add(tf_creditIssuerBank);

        lbl_creditBankAccount = new JLabel("Bank Account:");
        lbl_creditBankAccount.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lbl_creditBankAccount.setBounds(20,267,131,25);
        paneelll3.add(lbl_creditBankAccount);
        
        tf_creditBankAccount = new JTextField(30);
        tf_creditBankAccount.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),2));
        tf_creditBankAccount.setBounds(161,267,187,35);
        paneelll3.add(tf_creditBankAccount);

        lbl_creditBalanceAmount = new JLabel("Balance Amount:");
        lbl_creditBalanceAmount.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lbl_creditBalanceAmount.setBounds(373,270,147,25);
        paneelll3.add(lbl_creditBalanceAmount);
        
        tf_creditBalanceAmount = new JTextField(30);
        tf_creditBalanceAmount.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),2));
        tf_creditBalanceAmount.setBounds(513,270,156,35);
        paneelll3.add(tf_creditBalanceAmount);

        lbl_creditCVCNumber = new JLabel("CVC Number:");
        lbl_creditCVCNumber.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lbl_creditCVCNumber.setBounds(24,335,131,25);
        paneelll3.add(lbl_creditCVCNumber);
        
        tf_creditCVCNumber = new JTextField(30);
        tf_creditCVCNumber.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),2));
        tf_creditCVCNumber.setBounds(159,335,192,35);
        paneelll3.add(tf_creditCVCNumber);

        lbl_creditInterestRate = new JLabel("Interest Rate:");
        lbl_creditInterestRate.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lbl_creditInterestRate.setBounds(373,335,147,25);
        paneelll3.add(lbl_creditInterestRate);
        
        tf_creditInterestRate = new JTextField(30);
        tf_creditInterestRate.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),2));
        tf_creditInterestRate.setBounds(513,335,156,35);
        paneelll3.add(tf_creditInterestRate);

        lbl_creditExpirationDate = new JLabel("Expiration Date:");
        lbl_creditExpirationDate.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lbl_creditExpirationDate.setBounds(140,440,160,28);
        paneelll3.add(lbl_creditExpirationDate);
        String[] day = {"1","2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        credit_CmBox1 = new JComboBox(day);
        credit_CmBox1.setBounds(290,440,93,29);
        credit_CmBox1.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),2));
        String[] month = {"January", "February", "March", "april", "may", "June", "July", "August", "September", "October", "November", "December"};
        credit_CmBox2 = new JComboBox(month);
        credit_CmBox2.setBounds(390,440,93,29);
        credit_CmBox2.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),2));
        String[] year = {"2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023"};
        credit_CmBox3 = new JComboBox(year);
        credit_CmBox3.setBounds(490,440,93,29);
        credit_CmBox3.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),2));
        paneelll3.add(credit_CmBox1);
        paneelll3.add(credit_CmBox2);
        paneelll3.add(credit_CmBox3);

        lbl_creditGracePeriod = new JLabel("Grace Period:");
        lbl_creditGracePeriod.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lbl_creditGracePeriod.setBounds(175,500,169,28);
        paneelll3.add(lbl_creditGracePeriod);
        
        tf_creditGracePeriod = new JTextField(30);
        tf_creditGracePeriod.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),2));
        tf_creditGracePeriod.setBounds(300,500,180,32);
        paneelll3.add(tf_creditGracePeriod);

        jbut_creditClear = new JButton("Clear All");
        jbut_creditClear.setBounds(303,570,120,32);
        jbut_creditClear.setFont(new Font("Times New Roman", Font.BOLD, 20));
        jbut_creditClear.setForeground(Color.BLACK);
        jbut_creditClear.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),2));
        paneelll3.add(jbut_creditClear);

        jbut_creditHome = new JButton("HOME");
        jbut_creditHome.setBounds(60,100,140,50);
        jbut_creditHome.setFont(new Font("Times New Roman", Font.BOLD,20));
        jbut_creditHome.setForeground(Color.BLACK);
        jbut_creditHome.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),2));
        paneelll4.add(jbut_creditHome);

        jbut_creditSetCreditLimit = new JButton("SET CREDIT LIMIT");
        jbut_creditSetCreditLimit.setBounds(30,175,205,50);
        jbut_creditSetCreditLimit.setFont(new Font("Times New Roman", Font.BOLD,20));
        jbut_creditSetCreditLimit.setForeground(Color.BLACK);
        jbut_creditSetCreditLimit.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),2));
        paneelll4.add(jbut_creditSetCreditLimit);

        jbut_creditCancelCreditLimit = new JButton("CANCEL CREDIT LIMIT");
        jbut_creditCancelCreditLimit.setBounds(10,250,250,50);
        jbut_creditCancelCreditLimit.setFont(new Font("Times New Roman", Font.BOLD,18));
        jbut_creditCancelCreditLimit.setForeground(Color.BLACK);
        jbut_creditCancelCreditLimit.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),2));
        paneelll4.add(jbut_creditCancelCreditLimit);

        jbut_creditAddCreditCard = new JButton("ADD CREDIT CARD");
        jbut_creditAddCreditCard.setBounds(30,325,205,50);
        jbut_creditAddCreditCard.setFont(new Font("Times New Roman", Font.BOLD,20));
        jbut_creditAddCreditCard.setForeground(Color.BLACK);
        jbut_creditAddCreditCard.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),2));
        paneelll4.add(jbut_creditAddCreditCard);

        jbut_creditGoToDebitCard = new JButton("GO TO DEBIT CARD");
        jbut_creditGoToDebitCard.setBounds(30,400,205,50);
        jbut_creditGoToDebitCard.setFont(new Font("Times New Roman", Font.BOLD,18));
        jbut_creditGoToDebitCard.setForeground(Color.BLACK);
        jbut_creditGoToDebitCard.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),2));
        paneelll4.add(jbut_creditGoToDebitCard);

        jbut_creditDisplay = new JButton("DISPLAY");
        jbut_creditDisplay.setBounds(30,475,205,50);
        jbut_creditDisplay.setFont(new Font("Times New Roman", Font.BOLD,18));
        jbut_creditDisplay.setForeground(Color.BLACK);
        jbut_creditDisplay.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),2));
        paneelll4.add(jbut_creditDisplay);

            jbut_creditClear.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    //set the text-fields to empty
                    tf_creditCardId.setText("");
                    tf_creditCreditLimit.setText("");
                    tf_creditClientName.setText("");
                    tf_creditIssuerBank.setText("");
                    tf_creditBankAccount.setText("");
                    tf_creditBalanceAmount.setText("");
                    tf_creditCVCNumber.setText("");
                    tf_creditInterestRate.setText("");
                    tf_creditGracePeriod.setText("");
                    //Reset the combo box to default index
                    credit_CmBox1.setSelectedIndex(0);
                    credit_CmBox2.setSelectedIndex(0);
                    credit_CmBox3.setSelectedIndex(0);   
                }
            });
            //this is the button to dispose the frame fr2_creditCard and make Home frame visible
            jbut_creditHome.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    fr2_creditCard.dispose();
                    fr.setVisible(true);
                }
            });
            //this is the button to GoToDebitCard, frame fr2_creditCard disposes and debitCard frame appears
            jbut_creditGoToDebitCard.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    fr2_creditCard.dispose();
                    debitCard();
                }
            });
            
            jbut_creditAddCreditCard.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    //if any of the fields remain empty error message is displayed
                    if(tf_creditCardId.getText().isEmpty() ||  tf_creditIssuerBank.getText().isEmpty() || tf_creditBankAccount.getText().isEmpty() 
                    || tf_creditBalanceAmount.getText().isEmpty() || tf_creditCVCNumber.getText().isEmpty() || tf_creditInterestRate.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(fr2_creditCard, "Please fill up all the required fields.", "Error", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        try
                        {
                            //getting all the text fields from the GUI
                            int cardId = Integer.parseInt(tf_creditCardId.getText());
                            String clientName = tf_creditClientName.getText();
                            String issuerBank = tf_creditIssuerBank.getText();
                            String bankAccount = tf_creditBankAccount.getText();
                            int balanceAmount = Integer.parseInt(tf_creditBalanceAmount.getText());
                            int cvc_number = Integer.parseInt(tf_creditCVCNumber.getText());
                            double interestRate = Double.parseDouble(tf_creditInterestRate.getText());
                            String day = (String) credit_CmBox1.getSelectedItem();
                            String month = (String) credit_CmBox2.getSelectedItem();
                            String year = (String) credit_CmBox3.getSelectedItem();
                            String expirationDate = day + "/" + month + "/" + year;
                            boolean cardIdManage = false;//flag is set to check 
                            
                            if(balanceAmount <=0){
                                //if balanceAmount is less than zero display message
                                JOptionPane.showMessageDialog(fr2_creditCard, "Balance Amount is invalid.", "Error", JOptionPane.INFORMATION_MESSAGE);
                                return;
                            }
                            //using for loop to iterate through BankCard
                            for(BankCard card : arrayBankCard){
                                CreditCard creditCard = (CreditCard)card;//  type cast object card to CreditCard
                                if(creditCard.getCardId() == cardId){
                                    cardIdManage = true;//setting the cardIdManage  flag to true
                                    break;// stop the program execution
                                }
                            }    
                            if(cardIdManage){
                                //if cardIdManage is found display suitable message
                                JOptionPane.showMessageDialog(fr2_creditCard, "Card id already exists. Please enter a unique value", "Error", JOptionPane.INFORMATION_MESSAGE);
                                return;
                            }
                            else{
                                BankCard objCreditCard = new CreditCard(cardId, clientName, issuerBank, bankAccount, balanceAmount, cvc_number, interestRate,expirationDate);
                                arrayBankCard.add(objCreditCard);
                                JOptionPane.showMessageDialog(fr2_creditCard, "Credit Card added successfully.", "Successful", JOptionPane.INFORMATION_MESSAGE);
                            
                            }
                        }catch(NumberFormatException see)
                        {
                            //checking if the values entered in text field is not according to the data types declared error message is displayed
                            JOptionPane.showMessageDialog(fr2_creditCard, "Please enter correct values", "Error", JOptionPane.INFORMATION_MESSAGE);
                            tf_creditCardId.setText("");
                            tf_creditClientName.setText("");
                            tf_creditIssuerBank.setText("");
                            tf_creditBankAccount.setText("");
                            tf_creditBalanceAmount.setText("");
                            tf_creditCVCNumber.setText("");
                            tf_creditInterestRate.setText("");
                        }
                        }
                    }
            });
            
            

            jbut_creditDisplay.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent display_object)
                {
                    if(arrayBankCard.isEmpty()){
                        JOptionPane.showMessageDialog(fr2_creditCard, "Credit Card Unavailable", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        //using for loop to iterate arrayBankCard
                        for(BankCard display: arrayBankCard){
                            //to check if display is an object of CreditCard or not
                            if(display instanceof CreditCard){
                                CreditCard creditCard = (CreditCard) display;
                                System.out.println("Card Id: " + creditCard.getCardId()+ "\n" + "Client Name: " + creditCard.getClientName()+ "\n" + 
                                    "Issuer Bank: " + creditCard.getIssuerBank()+ "\n" + "Bank Account: " + creditCard.getBankAccount()+ "\n" +
                                    "Balance Amount: " + creditCard.getBalanceAmount()+ "\n" + "CVC Number: " + creditCard.getCVC_number()+ "\n" +
                                    "Interest Rate: " + creditCard.getInterestRate()+ "\n" + "Expiration Date: " + creditCard.getExpirationDate()+ "\n");

                            }
                            else{
                                System.out.println("Credit Card is not available");
                            }
                        }
                    }
                }
            });
            
            jbut_creditSetCreditLimit.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent setLimit)
                {
                    if(tf_creditCardId.getText().isEmpty() || tf_creditCreditLimit.getText().isEmpty() || tf_creditGracePeriod.getText().isEmpty()){
                        JOptionPane.showMessageDialog(fr2_creditCard, "Please fill in all the fields.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        try{
                            //getting the fields from the GUI
                            int cardId = Integer.parseInt(tf_creditCardId.getText());
                            int creditLimit = Integer.parseInt(tf_creditCreditLimit.getText());
                            int gracePeriod = Integer.parseInt(tf_creditGracePeriod.getText());
                            boolean cardFound = false;
                            
                            //using for loop to iterate arrayBankCard of object set_limit
                            for(BankCard set_limit: arrayBankCard){
                                if(set_limit instanceof CreditCard){
                                    CreditCard creditCard = (CreditCard) set_limit;
                                    if(creditLimit > 0 && gracePeriod > 0){
                                        
                                        if(creditCard.getCardId() == cardId){
                                            cardFound = true;//flag is changed to true
                                            if(creditLimit <= 2.5 * set_limit.getBalanceAmount()){
                                                creditCard.setCreditLimit(creditLimit, gracePeriod);
                                                JOptionPane.showMessageDialog(fr2_creditCard, "Credit Limit added successfully","Successful", JOptionPane.INFORMATION_MESSAGE);
                                                break;//to  break the code after this if the above code is correct
                                            }
                                            
                                            else{
                                                
                                                JOptionPane.showMessageDialog(fr2_creditCard, "Credit limit should be less than 2.5 ties balance amount", "Error", JOptionPane.ERROR_MESSAGE);
                                                break;// to use this code if the above code is wrong
                                            }
                                        }
                                        else {
                                            //if cardId of the crceditCard is equal to stored cardI
                                            JOptionPane.showMessageDialog(fr2_creditCard, "Card Id is wrong", "Error", JOptionPane.ERROR_MESSAGE);
                                        }
                                    }
                                    else{
                                        //if credit limit and grace period is less than zero print the below message
                                        JOptionPane.showMessageDialog(fr2_creditCard, " Credit Limit or Grace Period cannot be less than zero.", "Error", JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                            }
                        }
                        catch(NumberFormatException shee){
                             JOptionPane.showMessageDialog(fr2_creditCard, "Please enter valid data in the required field", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            });
            
            jbut_creditCancelCreditLimit.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent cancelCredit)
                {
                     if(tf_creditCardId.getText().isEmpty()){
                         JOptionPane.showMessageDialog(fr2_creditCard, "Please enter the card id.", "Error", JOptionPane.ERROR_MESSAGE);
                     }
                     else{
                        try{
                            int cardId = Integer.parseInt(tf_creditCardId.getText());
                            //using for loop to iterate BankCard
                            for(BankCard cancel_card: arrayBankCard){
                                //check if cancel_card is the object of CreditCard
                                if(cancel_card instanceof CreditCard){
                                    CreditCard creditCard = (CreditCard) cancel_card;
                                    //check if the cardId of creditCard is equal to the entered cardId or not
                                    if(creditCard.getCardId() == cardId){
                                         creditCard.cancelcreditCard();
                                         JOptionPane.showMessageDialog(fr2_creditCard, "Credit Card cancelled successfully", "Successful", JOptionPane.INFORMATION_MESSAGE);
                                         break;
                                    }
                                    else{
                                        //if the cardId of the creditCard and the inputted cardId is wrong print below message.
                                         JOptionPane.showMessageDialog(fr2_creditCard, "Invalid card id.", "Error", JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                            }
                        }
                        catch(NumberFormatException shee){
                           JOptionPane.showMessageDialog(fr2_creditCard, "Please enter a valid card id.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            });

        fr2_creditCard.add(panel2);
        fr2_creditCard.setSize(1009,690);
        fr2_creditCard.setVisible(true);
        fr2_creditCard.setResizable(false);

    }
    public static void main(String[] args)
    {
        new BankGUI();
    }
}


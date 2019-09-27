import java.lang.*;
import java.util.*;
class Account 
{
    static String cust_name;
    static int accno;
    static long balance;

    Scanner sc = new Scanner(System.in);

    void openAccount()
    {
        System.out.println("Enter account Number");
        accno = sc.nextInt();
        System.out.println("Enter name :");
        cust_name = sc.next();
        System.out.println("Enter initial deposit: ");
        balance = sc.nextLong();

    }

    void deposit()
    {
        long amount;
        System.out.println("Enter the amount u want to Deposit: ");
        amount=sc.nextLong();
        balance += amount;
    }

    void ShowAccount()
    {
        System.out.println("..........................................");
        System.out.println("Acct_no  Name  balance");
        System.out.println(accno + "\t " + cust_name + "\t " + balance );
        System.out.println("..........................................");
    }


}


class Saving extends Account
{
    void withdrawal()
    {
        long amt;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount u want to withdraw");
        amt = sc.nextLong();
        System.out.println(super.balance);
        if(balance>amt)
        {
            balance = balance - amt;
        }else{
            System.out.println("Not sufficient Account balance!!");
        }

    }

}


class Current extends Account
{
    Current(){
        if(balance!=1000)
        {
            System.out.println("minimum balance should be maintain!!!");
            
            serviceCharge();
        }
    }
    void serviceCharge()
    {
        balance = balance - 20;
        System.out.println("***************************************************************************");
        System.out.println("\t \t \t" + "Service Charge");
        System.out.println("Current balance is: " + balance  + " " + "After deducting service charge");
        System.out.println("***************************************************************************");
    }

}

class Bank 
{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choise 0-saving 1-current Account for opening bank Account ?");
        int ch = sc.nextInt();
        if(ch==0){

            Account a = new Account();
            a.openAccount();
            a.deposit();
            a.ShowAccount();
            Saving s = new Saving();
            s.withdrawal();
            s.ShowAccount();

        }else{
            Account a = new Account();
            a.openAccount();
            a.deposit();
            a.ShowAccount();
            Current c = new Current();

        }
       

    }
}
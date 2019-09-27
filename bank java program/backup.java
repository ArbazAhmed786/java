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
        System.out.println(accno + " " + cust_name + " " + balance );

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











class Bank 
{
    public static void main(String args[]) {
        Account a = new Account();
        a.openAccount();
        a.deposit();
        a.ShowAccount();
        Saving s = new Saving();
        s.withdrawal();
        s.ShowAccount();


    }
}
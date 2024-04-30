import java.util.*;
public class Atm1{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int balance=10000,deposit,withdraw;
 int ch;
 do
 { System.out.println("ATM Machine");
  System.out.println("choose 1 for deposit:");
  System.out.println("choose 2 for withdraw:");
  System.out.println("choose 3 for check balance:");
  System.out.println("choose 4 for exit:");
  System.out.println("choose the operation :");
   ch=sc.nextInt();
  switch(ch)
  {
    case 1:
        System.out.println("Enter Money to be deposited:");
        deposit=sc.nextInt();
        balance=balance+deposit;
        System.out.println("your Money has been successfully deposited :"+balance);
        System.out.println();
        break;
    case 2:
        System.out.println("enter ammount to withdarw:");
        withdraw=sc.nextInt();
        if(balance>=withdraw)
         {
           balance=balance-withdraw;
           System.out.println("your upadated balance is "+balance);

          }
         else
         {
          System.out.println("insufficint funds....!");
          }
            System.out.println();
           break;
    case 3:
        System.out.println("balance is:"+balance);
        System.out.println();
        break;
    case 4:
        System.out.println("status:0");
    default:
        System.out.println("Enter valid options(1/2/3/4)");
  }    
 }while(ch<5);
}
}
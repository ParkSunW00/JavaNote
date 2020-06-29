public class BankAccount {
    int balance; // 잔액
    Person owner;
    boolean deposit (int amount) { //입금할 액수
        if(amount<0 || owner.cashAmount<amount) {
            System.out.println("입금 실패입니다. 잔고: "+balance+"원, 현금: "+owner.cashAmount+"원");
            return false;
        }
        balance+=amount;
        owner.cashAmount-=amount;
        System.out.println(amount+"원 입금하였습니다. 잔고: "+balance+"원, 현금: "+owner.cashAmount+"원");
        return true;
    }
    boolean withdraw (int amount) { //출금할 액수
        if(amount>balance || balance<amount) {
            System.out.println("출금 실패입니다. 잔고: "+balance+"원, 현금: "+owner.cashAmount+"원");
            return false;
        }
        balance-=amount;
        owner.cashAmount+=amount;
        System.out.println(amount+"원 출금하였습니다. 잔고: "+balance+"원, 현금: "+owner.cashAmount);
        return true;
    }
}

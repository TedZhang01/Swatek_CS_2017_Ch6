package PP_6_6;

public class Bank{
    private Account[] bank = new Account[30];
    private boolean[] aaa= new boolean[30];
    public Bank(){
        
    }
    public boolean NewAccount(String owner, int account, double initial){
        boolean s = false;
        if(bank[account-1]==null){
            s = true;
            bank[account-1] = new Account(owner, account, initial);
        }else if (account>30||account<1){
            System.out.println("fail");
            return false;
        }else{
            System.out.println("fail");
            return false;
        }
        //bank[account-1] = new Account(owner, account, initial);
        return s;
    }
    public double deposit(int ac,double a){
        if(check(ac)){
            return bank[ac-1].deposit(a);}
        else{
            return 0;
        }
    }
    public double withdraw(int ac,double a,double fee){
        if(check(ac)){
            return bank[ac-1].withdraw(a,fee);}
        else{
            return 0;
        }
        //return bank[ac-1].withdraw(a,fee);
    }
    public void interest(int ac){
        if(check(ac)){
            bank[ac-1].addInterest();
        }
        //else{
        //    return 0;
        //}
        //bank[ac-1].addInterest();
    }
    public String toString(int ac){
        if(check(ac)){
            return bank[ac-1].toString();
        }else{
            return "";}
    }
    private boolean check(int ac){
        if (bank[ac-1]==null){
            System.out.println("fail");
            return false;
            
        }else{
            return true;
        }
    }
}
public class Account {
    
    public static void main(String[] args) {
        
        InnerAccount a1 = new InnerAccount();
        a1.set(1000.145, "Rahul");
        System.out.println("Balance of account is "+a1.get1());
        System.out.println("Name of account is "+a1.get2());

        System.out.println("Protected methods can be accessed in the same package");
        a1.set(1000.123, "Aditya");
        System.out.println("Balance of account is "+a1.get3());
        System.out.println("Name of account is "+a1.get4());

        System.out.println("Private methods can not be accessed in this way");
        // a1.set(1000.456, "Rohit");
        // System.out.println("Balance of account is "+a1.get5());
        // System.out.println("Name of account is "+a1.get6());
    }
}

class InnerAccount {
    
    private Double balance;
    private String name;

    void set(Double balance, String name){
        this.balance = balance;
        this.name = name;
    }

    public Double get1(){
        System.out.println("Balance method using Public modifier");
        return balance;
    }

    public String get2(){
        System.out.println("Name method using Public modifier");
        return name;
    }

    protected Double get3(){
        System.out.println("Balance method using Default modifier");
        return balance;
    }

    protected String get4(){
        System.out.println("Name method using Default modifier");
        return name;
    }

    // private Double get5(){
    //     System.out.println("Balance method using Private modifier");
    //     return balance;
    // }

    // private String get6(){
    //     System.out.println("Name method using Private modifier");
    //     return name;
    // }

}

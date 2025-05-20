//OVERLOADED - Same Class Same method Name, different parameters.
class Person{
    private String first;
    private String last;
    private String middle;
    private int SSN;

    void setName(String first){
        this.first = first;
    }

    void setName(String first, String last){
        this.first = first;
        this.last = last;
    }

    void setName(String first, String last, String middle){
        this.first = first;
        this.last = last;
        this.middle = middle;
    }

    void setName(int SSN){
        this.SSN = SSN;
    }
}
class BankAccount{
    //Gets Overriden in child class later
    double getInterestRate(){
        return 0.04;
    }
}
class SavingsAccount extends BankAccount{
    @Override
    double getInterestRate(){
        return 0.08;
    }
}
public class OverWhat {
    public static void main(String[] args) {

        //OVERLOADING - DIFFERENT PARAMETERS
        Person p = new Person();
        p.setName(123);
        p.setName("Kevin");
        p.setName("Kevin", "Long");
        p.setName("Kevin", "Long", "Ernest");

        //OVERRRIDE TWO CLASSES TWO VERSIONS OF THE SAME METHOD WITH SAME NAME AND SAME PARAMETERS
        BankAccount b = new BankAccount();
        System.out.println(b.getInterestRate());

        SavingsAccount s = new SavingsAccount();
        System.out.println(s.getInterestRate());
    }
}

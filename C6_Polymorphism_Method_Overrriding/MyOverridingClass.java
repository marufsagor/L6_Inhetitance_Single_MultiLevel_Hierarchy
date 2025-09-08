package C6_Polymorphism_Method_Overrriding;

public class MyOverridingClass {
    public static void main(String[] args) {

        BangladeshBank bb = new BangladeshBank();
        double InterestRate = bb.getInterestRate();
        System.out.println("Bangladesh Interest Rate:"+InterestRate+"%");
        System.out.println("-------------------------------");

        BracBank bbl=new BracBank();
        double InterestRate1= bbl.getInterestRate();
        System.out.println("BranBank Interest Rate:"+InterestRate1+"%");
        System.out.println("-------------------------------");

        CityBank cbl=new CityBank();
        double InterestRate2= cbl.getInterestRate();
        System.out.println("CityBank Interest Rate:"+InterestRate2+"%");
        System.out.println("-------------------------------");


        DutchBanglaBank dbbl=new DutchBanglaBank();
        double InterestRate3= dbbl.getInterestRate();
        System.out.println("CityBank Interest Rate:"+InterestRate3+"%");
        System.out.println("-------------------------------");
    }

}

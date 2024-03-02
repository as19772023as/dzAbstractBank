public class Main {
    public static void main(String[] args) {


        CreditAccount creditAccount = new CreditAccount(-3000);
        SimpleAccount simpleAccount = new SimpleAccount();

        System.out.println(simpleAccount.add(5600));
        System.out.println(simpleAccount.pay(600));
        System.out.println(simpleAccount.pay(5900));

        System.out.println(creditAccount.pay(2500));
        System.out.println(creditAccount.pay(5500));
        System.out.println(creditAccount.add(500));

        System.out.println(creditAccount.getBalans());
        System.out.println(simpleAccount.getBalans());


        System.out.println(creditAccount.transfer(simpleAccount, 800));
        System.out.println(simpleAccount.transfer(creditAccount, 900));

        System.out.println(creditAccount.getBalans());
        System.out.println(simpleAccount.getBalans());


        System.out.println(creditAccount.transfer(simpleAccount, 10000));
        System.out.println(simpleAccount.transfer(creditAccount, 10000));

        System.out.println(creditAccount.getBalans());
        System.out.println(simpleAccount.getBalans());
    }
}
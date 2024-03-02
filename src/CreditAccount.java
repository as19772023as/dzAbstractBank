public class CreditAccount extends Account {
    private long limitBalans;

    public CreditAccount(long limitBalans) {
        super(0);

        this.limitBalans = limitBalans;
    }

    @Override
    public boolean add(long amount) {
        if (balans + amount <= 0) {
            balans += amount;
            return true;
        } else {
            return false;
        }
    }


    @Override
    public boolean pay(long amount) {
        if (balans - amount >= limitBalans) {
            balans -= amount;
            return true;
        } else {
            return false;
        }
    }

    // @Override
    // boolean transfer(Account account, long amount) {
    // if ((balans - amount) >= limitBalans && (balans + amount) < 0) {
    //  balans += amount;
    //  account.balans += amount;
    // return true;
    // } else {
    //  return false;
    // }
    // }
}

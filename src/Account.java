public abstract class Account {
    protected long balans;


    public Account(long balans) {
        this.balans = balans;
    }
    public long getBalans() {
        return this.balans;
    }

    public boolean add(long amount) {
        balans += amount;
        return true;
    }

    abstract boolean pay(long amount);


    public boolean transfer(Account account, long amount) {
        if (pay(amount)) {
            if (account.add(amount)) {
                return true;
            } else {
                add(amount);
            }
        }
        return false;
    }
}

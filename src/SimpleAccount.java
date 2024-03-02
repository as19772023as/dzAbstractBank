public class SimpleAccount extends Account {
    public SimpleAccount() {
        super(0);
    }

    public boolean add(long amount) {
        return super.add(amount);
    }

    @Override
    public boolean pay(long amount) {
        if ((balans - amount) >= 0) {
            balans -= amount;
            return true;
        } else {
            return false;
        }
    }
}
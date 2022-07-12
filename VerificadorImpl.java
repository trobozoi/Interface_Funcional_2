import java.util.function.Predicate;

public class VerificadorImpl implements Verificador {

    private Predicate<Cliente> clientePredicate;

    @Override
    public boolean test(Cliente cliente) {
        return false;
    }

    @Override
    public Predicate<Cliente> and(Predicate<? super Cliente> other) {
        return Predicate.super.and(other);
    }

    @Override
    public Predicate<Cliente> negate() {
        return Predicate.super.negate();
    }

    @Override
    public Predicate<Cliente> or(Predicate<? super Cliente> other) {
        return Predicate.super.or(other);
    }

    @Override
    public Predicate<Cliente> getClientePredicate() {
        return clientePredicate;
    }

    @Override
    public void setClientePredicate(Predicate<Cliente> clientePredicate) {
        this.clientePredicate = clientePredicate;
    }
}

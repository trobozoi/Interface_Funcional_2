import java.util.function.Predicate;

public interface Verificador extends Predicate<Cliente> {
    @Override
    boolean test(Cliente cliente);

    @Override
    Predicate<Cliente> and(Predicate<? super Cliente> other);

    @Override
    Predicate<Cliente> negate();

    @Override
    Predicate<Cliente> or(Predicate<? super Cliente> other);

    Predicate<Cliente> getClientePredicate();

    void setClientePredicate(Predicate<Cliente> clientePredicate);
}

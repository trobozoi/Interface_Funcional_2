import java.time.LocalDate;

public interface Cliente {
    String getNome();

    void setNome(String nome);

    LocalDate getDataNascimento();

    void setDataNascimento(LocalDate dataNascimento);

    Sexo getSexo();

    void setSexo(Sexo sexo);

    @Override
    String toString();

    int getIdade();
}

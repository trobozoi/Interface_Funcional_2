import java.time.LocalDate;
import java.time.Period;

public class ClienteImpl implements Cliente {
    private String nome;
    private LocalDate dataNascimento;
    private Sexo sexo;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public Sexo getSexo() {
        return sexo;
    }

    @Override
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public ClienteImpl(String nome, LocalDate dataNascimento, Sexo sexo){
        this.nome= nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
    }

    @Override
    public String toString(){
        return this.nome;
    }

    @Override
    public int getIdade(){
        Period period = Period.between(this.dataNascimento, LocalDate.now());
        return period.getYears();
    }
}

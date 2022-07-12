import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio05 {
    public static void main(String[] args) {
        List<Cliente> clientes = List.of(new ClienteImpl("Geraldo Calebe Nathan Rezende",LocalDate.parse("07/07/1944", DateTimeFormatter.ofPattern("dd/MM/yyyy")),SexoImpl.MASCULINO),
                new ClienteImpl("Renan Erick Porto",LocalDate.parse("05/01/1985", DateTimeFormatter.ofPattern("dd/MM/yyyy")),SexoImpl.MASCULINO),
                new ClienteImpl("Murilo Gabriel Gomes",LocalDate.parse("09/03/1949", DateTimeFormatter.ofPattern("dd/MM/yyyy")),SexoImpl.MASCULINO),
                new ClienteImpl("Carlos César Drumond",LocalDate.parse("24/01/1977", DateTimeFormatter.ofPattern("dd/MM/yyyy")),SexoImpl.MASCULINO),
                new ClienteImpl("Tomás Manuel Ribeiro",LocalDate.parse("19/06/1987", DateTimeFormatter.ofPattern("dd/MM/yyyy")),SexoImpl.MASCULINO),
                new ClienteImpl("Marlene Isabella Alícia Lima",LocalDate.parse("03/02/1987", DateTimeFormatter.ofPattern("dd/MM/yyyy")),SexoImpl.FEMININO),
                new ClienteImpl("Jorge Benedito Barbosa",LocalDate.parse("15/05/1966", DateTimeFormatter.ofPattern("dd/MM/yyyy")),SexoImpl.MASCULINO),
                new ClienteImpl("Igor Yuri Francisco Souza",LocalDate.parse("18/03/1975", DateTimeFormatter.ofPattern("dd/MM/yyyy")),SexoImpl.MASCULINO),
                new ClienteImpl("Iago Yuri Moraes",LocalDate.parse("01/01/1978", DateTimeFormatter.ofPattern("dd/MM/yyyy")),SexoImpl.MASCULINO),
                new ClienteImpl("Eduardo Rafael Diogo Corte Real",LocalDate.parse("08/03/1956", DateTimeFormatter.ofPattern("dd/MM/yyyy")),SexoImpl.MASCULINO),
                new ClienteImpl("Ester Renata Antonella Castro",LocalDate.parse("20/04/1948", DateTimeFormatter.ofPattern("dd/MM/yyyy")),SexoImpl.FEMININO),
                new ClienteImpl("Theo Matheus Julio Mendes",LocalDate.parse("13/05/1997", DateTimeFormatter.ofPattern("dd/MM/yyyy")),SexoImpl.MASCULINO),
                new ClienteImpl("Fábio Benedito Martins",LocalDate.parse("13/03/1988", DateTimeFormatter.ofPattern("dd/MM/yyyy")),SexoImpl.MASCULINO),
                new ClienteImpl("Clarice Carolina Lívia da Rocha",LocalDate.parse("15/05/1999", DateTimeFormatter.ofPattern("dd/MM/yyyy")),SexoImpl.FEMININO),
                new ClienteImpl("Sebastiana Liz Dias",LocalDate.parse("01/06/2001", DateTimeFormatter.ofPattern("dd/MM/yyyy")),SexoImpl.FEMININO),
                new ClienteImpl("Fabiana Mariana Brenda Monteiro",LocalDate.parse("19/02/1975", DateTimeFormatter.ofPattern("dd/MM/yyyy")),SexoImpl.FEMININO),
                new ClienteImpl("Elisa Maitê Laís da Mota",LocalDate.parse("07/01/1949", DateTimeFormatter.ofPattern("dd/MM/yyyy")),SexoImpl.FEMININO),
                new ClienteImpl("Isabela Renata Aparecida Pereira",LocalDate.parse("12/05/1984", DateTimeFormatter.ofPattern("dd/MM/yyyy")),SexoImpl.FEMININO),
                new ClienteImpl("Enzo Igor Manuel Peixoto",LocalDate.parse("08/07/1997", DateTimeFormatter.ofPattern("dd/MM/yyyy")),SexoImpl.MASCULINO),
                new ClienteImpl("Bryan Renan Novaes",LocalDate.parse("10/05/1951", DateTimeFormatter.ofPattern("dd/MM/yyyy")),SexoImpl.MASCULINO));
        Verificador verificador = new VerificadorImpl();
        verificador.setClientePredicate(cliente -> cliente.getSexo() == SexoImpl.FEMININO);
        new Exercicio05().filtrar(clientes, verificador).forEach(System.out::println);
        verificador.setClientePredicate(cliente -> cliente.getSexo() == SexoImpl.MASCULINO);
        new Exercicio05().filtrar(clientes, verificador).forEach(System.out::println);
        verificador.setClientePredicate(cliente -> cliente.getIdade() >= 18);
        new Exercicio05().filtrar(clientes, verificador).forEach(cliente -> System.out.println(cliente.getNome()));
        verificador.setClientePredicate(cliente -> cliente.getIdade() < 18);
        new Exercicio05().filtrar(clientes, verificador).forEach(cliente -> System.out.println(cliente.getNome()));
        verificador.setClientePredicate(cliente -> cliente.getSexo() == SexoImpl.MASCULINO && cliente.getIdade() >= 18);
        new Exercicio05().filtrar(clientes, verificador).forEach(System.out::println);
        verificador.setClientePredicate(cliente -> cliente.getSexo() == SexoImpl.MASCULINO && cliente.getIdade() < 18);
        new Exercicio05().filtrar(clientes, verificador).forEach(System.out::println);
        verificador.setClientePredicate(cliente -> cliente.getSexo() == SexoImpl.FEMININO && cliente.getIdade() >= 18);
        new Exercicio05().filtrar(clientes, verificador).forEach(cliente -> System.out.println(cliente.getNome()));
        verificador.setClientePredicate(cliente -> cliente.getSexo() == SexoImpl.FEMININO && cliente.getIdade() < 18);
        new Exercicio05().filtrar(clientes, verificador).forEach(cliente -> System.out.println(cliente.getNome()));
    }
    List<Cliente> filtrar(List<Cliente> clientes, Verificador verificador) {
        List<Cliente> list = clientes.stream().filter(verificador.getClientePredicate()).collect(Collectors.toList());
        //retorna lista filtrada
        return list;
    }
}

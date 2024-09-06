//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Main {
    public static void main(String[] args) {
        LocalDate dtaNascimento =
                LocalDate.parse("1982-12-02", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate dtaAdmissao =
                LocalDate.parse("2024-09-15", DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        //Pessoa p = new Pessoa("Rafael", "123456789", "02/12/1982");
        Aluno a = new Aluno("Alana", "67154589", dtaNascimento, "00001");
        System.out.println(a);

        Professor p = new Professor("Rafael", "123456789", dtaNascimento, "POO", 400.57);
        System.out.println(p);

        Funcionario f = new Funcionario("Jussara", "741258",dtaNascimento, 7895.66, dtaAdmissao, "RH");
        System.out.println(f);
    }
}
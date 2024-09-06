//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        String dtaNascimento = "02/12/1982";
        String dtaAdmissao = "20/10/2023";

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = formato.parse(dtaNascimento);
        Date dataAdmissao = formato.parse(dtaAdmissao);

        Aluno alunoAlana = new Aluno("Alana", "67154589", dataNascimento, "00001");
        Professor professorRafael = new Professor("Rafael", "123456789", dataNascimento, "POO", 0.0);
        Funcionario funcionarioJussara = new Funcionario("Jussara", "741258",dataNascimento, 7895.66, dataAdmissao, "RH");

        System.out.println(alunoAlana);
        System.out.println(professorRafael);
        System.out.println(funcionarioJussara);
    }
}
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formate = new SimpleDateFormat("dd/MM/yyyy");

        Date dataInicio = formate.parse("10/08/2024");
        Date dataTermino = formate.parse("11/08/2024");

        Profissional rafael = new Profissional("Rafael Florindo", "rafaelflorindo@hotmail.com", "4498401-4320");
        Profissional ricardo = new Profissional("Ricardo Florindo", "ricardoflorindo@hotmail.com", "1198701-9325");

        Projeto sala = new Projeto("Forro Sala", dataInicio, dataTermino);

        Execucao rafaelSala = new Execucao(rafael,sala,"Eletrecista", 5, "casa",30);
        Execucao rafaelCozinha = new Execucao(rafael,sala,"Eletrecista", 5, "casa",30);
        System.out.println(rafaelSala);

    }
}
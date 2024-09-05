//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Pessoa p = new Pessoa("Rafael", "123456789", "02/12/1982");
        Aluno a = new Aluno("Alana", "67154589", "12/05/1902", "00001");
        System.out.println(a);

        Professor p = new Professor("Rafael", "123456789", "02/12/1982", "POO", 400.57);
        System.out.println(p);

        Funcionario f = new Funcionario("Jussara", "741258","11/11/2011", 7895.66, "10/08/2024", "RH");
        System.out.println(f);
    }
}
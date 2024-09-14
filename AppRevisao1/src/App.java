import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro objCarro = new Carro();
        ArrayList<Carro> carros = new ArrayList<Carro>();

        int opcao;
        do{
            System.out.println("1 - Cadastrar carro");
            System.out.println("2 - Listar todos os carro");
            System.out.println("3 - Buscar carro por chassi");
            System.out.println("4 - Validar IPVA");
            System.out.println("5 - Sair");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    sc.nextLine();
                    System.out.println("Cadastrar carro.");
                    System.out.println("Informe a Marca do Carro");
                    String marca = sc.nextLine();
                    System.out.println("Informe o Modelo do Carro");
                    String modelo = sc.nextLine();
                    System.out.println("Informe o Chassi do Carro");
                    String chassi = sc.nextLine();
                    System.out.println("Informe a placa do Carro");
                    String placa = sc.nextLine();
                    System.out.println("Informe o Ano do Carro");
                    int ano = sc.nextInt();
                    System.out.println("Informe o valor do Carro");
                    double valor = sc.nextDouble();
                    carros.add(new Carro(marca, modelo, ano, valor, chassi, placa));
                    break;
                case 2:
                    System.out.println("Listar todos os carro.");
                    objCarro.listarCarro(carros);
                    break;
                case 3:
                    System.out.println("Buscar carro por chassi.");
                    sc.nextLine();
                    System.out.println("Informe o Chassi do veiculo");
                    String bChassi = sc.nextLine();
                    objCarro.buscaChassi(carros, bChassi);
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Validar IPVA.");
                    System.out.println("Informe a placa do veiculo");
                    String buscarPlaca = sc.nextLine();
                    if(objCarro.isIPVA(carros, buscarPlaca)){
                        System.out.println("IPVA Isento");
                    }else{
                        System.out.println("IPVA não Isento");
                    }
                    break;
                case 5:
                    System.out.println("Saindo.");
                    break;
            }
        }while(opcao != 5);
    }
}

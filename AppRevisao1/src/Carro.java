import java.util.ArrayList;
import java.util.Calendar;
import java.util.Objects;

public class Carro {
    public String marca;
    public String modelo;
    public int ano;
    public double valor;
    private String chassi;
    private String placa;

    Carro(){

    }
    public Carro(String marca, String modelo, int ano, double valor, String chassi, String placa){
        try{
            this.setMarca(marca);
            this.setAno(ano);
            this.setModelo(modelo);
            this.setValor(valor);
            this.setChassi(chassi);
            this.setPlaca(placa);

        }catch (Exception e ){

        }
    }

    public String listCarro() {
        return "Marca='" + this.getMarca() + '\'' +
                "\nModelo='" + this.getModelo() + '\'' +
                "\nAno=" + this.getAno() +
                "\nValor=" + this.getValor() +
                "\nChassi='" + this.getChassi() + '\'' +
                "\nPlaca='" + this.getPlaca() + '\'';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getChassi() {
        return chassi;
    }

    private void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void listarCarro(ArrayList<Carro> carros){
       for (int i = 0; i < carros.size(); i++) {
           System.out.println("\n");
           System.out.println(carros.get(i).listCarro());
        }
    }
    boolean isIPVA(ArrayList<Carro> carros, String placa) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);

        for (int i = 0; i < carros.size(); i++) {
            if (Objects.equals(carros.get(i).getPlaca(), placa)) {
                if ((year - carros.get(i).getAno()) >= 20) {
                    return true;
                } else {
                    return false;
                }
            }else{
                return false;
            }
        }
        return false;
    }

    public void buscaChassi(ArrayList<Carro> carros, String chassi){
        for (int i = 0; i < carros.size(); i++) {
            if (Objects.equals(carros.get(i).getChassi(), chassi)) {
                System.out.println(carros.get(i).listCarro());
                break;
            }else {
                System.out.println("Não encontrou.");
            }
        }
    }
}


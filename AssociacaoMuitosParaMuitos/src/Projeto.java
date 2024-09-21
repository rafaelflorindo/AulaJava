import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Projeto {
    public String titulo;
    public Date dataInicio;
    public Date dataTermino;

    public ArrayList<Profissional> profissionais;

    public Projeto(String titulo, Date dataInicio, Date dataTermino) {
        this.setTitulo(titulo);
        this.setDataInicio(dataInicio);
        this.setDataTermino(dataTermino);
        this.profissionais = new ArrayList<Profissional>();
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    public ArrayList<Profissional> getProfissionais() {
        return profissionais;
    }

    public void setProfissionais(Profissional profissionais) {
        this.profissionais.add(profissionais);
    }

    @Override
    public String toString() {

        return "Projeto{" +
                "titulo='" + titulo + '\'' +
                ", dataInicio=" + dataInicio +
                ", dataTermino=" + dataTermino +
                ", profissionais=" + profissionais.toString() +
                '}';
    }
}

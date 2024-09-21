public class Execucao {
    Profissional profissional;
    Projeto projeto;
    public String funcao;
    public int carfaHorariaSemanal;
    public String localTrabalho;
    private double valorHora;

    public Execucao(Profissional profissional, Projeto projeto, String funcao, int carfaHorariaSemanal, String localTrabalho, double valorHora) {
        this.setProfissional(profissional);
        this.setProjeto(projeto);

        projeto.profissionais.add(profissional);//associação indereta
        profissional.projetos.add(projeto);//associação indereta

        this.setFuncao(funcao);
        this.setCarfaHorariaSemanal(carfaHorariaSemanal);
        this.setLocalTrabalho(localTrabalho);
        this.setValorHora(valorHora);
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getCarfaHorariaSemanal() {
        return carfaHorariaSemanal;
    }

    public void setCarfaHorariaSemanal(int carfaHorariaSemanal) {
        this.carfaHorariaSemanal = carfaHorariaSemanal;
    }

    public String getLocalTrabalho() {
        return localTrabalho;
    }

    public void setLocalTrabalho(String localTrabalho) {
        this.localTrabalho = localTrabalho;
    }

    @Override
    public String toString() {
        return "Execucao{" +
                "Profissional = " + profissional.getNome() +
                "\nProjeto = " + projeto.getTitulo() +
                "\nFuncao = '" + funcao + '\'' +
                "\nCarga Horaria Semanal = " + carfaHorariaSemanal + " horas" +
                "\nLocal do Trabalho = '" + localTrabalho + '\'' +
                "\nValorHora = R$ " + valorHora +
                "\nValor a pagar = R$ " + this.carfaHorariaSemanal*valorHora +

                '}';
    }
}

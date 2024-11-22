public class Artigo {
    private String tituloArtigo;
    private int paginaInicialArtigo;

    public Artigo(String tituloArtigo, int paginaInicialArtigo) {
        this.setTituloArtigo(tituloArtigo);
        this.setPaginaInicialArtigo(paginaInicialArtigo);
    }

    public String getTituloArtigo() {
        return tituloArtigo;
    }

    private void setTituloArtigo(String tituloArtigo) {
        this.tituloArtigo = tituloArtigo;
    }

    public int getPaginaInicialArtigo() {
        return paginaInicialArtigo;
    }

    private void setPaginaInicialArtigo(int paginaInicialArtigo) {
        this.paginaInicialArtigo = paginaInicialArtigo;
    }

    public String Consultar(){
        return "Título: " + this.getTituloArtigo() + "Pagina Inicial: " + this.getPaginaInicialArtigo();
    }
}

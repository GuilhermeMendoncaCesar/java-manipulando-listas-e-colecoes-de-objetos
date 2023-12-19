package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {

    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;
    private boolean ativa;

    public Serie(String nome, int anoDeLancamento){
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public boolean getAtiva() {
        return ativa;
    }


    @Override
    public int getDuracaoEmMinutos(){
        return this.temporadas * this.episodiosPorTemporada * this.minutosPorEpisodio;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

}

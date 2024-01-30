package br.com.project.locacao.modelos;

import br.com.project.locacao.calculo.Classificacao;

public class Filmes extends Titulos implements Classificacao {
    private String nmDiretor;

    public Filmes(String nmTitulo, String genero, int duracao, int anoLancamento, boolean incluidoPlano, String nmDiretor) {
        super(nmTitulo, genero, duracao, anoLancamento, incluidoPlano);
        this.nmDiretor = nmDiretor;
    }

    public String getNmDiretor() {
        return nmDiretor;
    }

    public void setNmDiretor(String nmDiretor) {
        this.nmDiretor = nmDiretor;
    }

    public void exibirFichaTecnica() {
        System.out.println("Título: " + getNmTitulo());
        System.out.println("Genero: " + getGenero());
        System.out.println("Duração: " + getDuracao() + " minutos");
        System.out.println("Ano de lancamento: " + getAnoLancamento());
        System.out.println("Diretor: " + getNmDiretor());
    }

    @Override
    public int getClassificacao() {
        return super.getTotalAvaliacoes()/2;
    }

    @Override
    public String toString() {
        return "Filme: " + getNmTitulo() + " (" + getAnoLancamento() + ")";
    }
}

package br.com.project.locacao.calculo;

public class FiltroRemomendacao {
    private String recomendacao;

    public void filtra(Classificacao classificacao) {
        if (classificacao.getClassificacao() >= 4) {
            System.out.println("Filme recomendado!");
        } else {
            System.out.println("Filme não recomendado!");
        }
    }
}

import br.com.project.locacao.calculo.CalculadoraTempo;
import br.com.project.locacao.calculo.FiltroRemomendacao;
import br.com.project.locacao.modelos.Filmes;
import br.com.project.locacao.modelos.Series;

import java.util.ArrayList;
import java.util.List;

public class LocacaoFilmes {
    public static void main(String[] args) {
        List<Filmes> lsFilmes = new ArrayList<>();

        lsFilmes.add(new Filmes("Sonic 2",
                "Ação",
                120,
                2021,
                true,
                "Teste"));
        lsFilmes.add(new Filmes("Homem-Aranha: Sem volta para casa",
                "Ação",
                120,
                2021,
                true,
                "Teste"));
        lsFilmes.add(new Filmes("Poderoso Chefão",
                "Ação",
                240,
                1999,
                true,
                "Teste"));

        lsFilmes.get(0).avaliarFilmes(5.0);
        lsFilmes.get(0).avaliarFilmes(7.0);
        lsFilmes.get(0).avaliarFilmes(6.0);
        lsFilmes.get(1).avaliarFilmes(4.0);
        lsFilmes.get(1).avaliarFilmes(5.0);
        lsFilmes.get(1).avaliarFilmes(6.0);
        lsFilmes.get(2).avaliarFilmes(3.0);
        lsFilmes.get(2).avaliarFilmes(7.0);
        lsFilmes.get(2).avaliarFilmes(4.0);

        for (Filmes lsFilme : lsFilmes) {
            lsFilme.exibirFichaTecnica();
            lsFilme.exibirMedia();
            System.out.println("=============================================");
        }

        List<Series> lsSeries = new ArrayList<>();

        lsSeries.add(new Series("Poderoso Chefão",
                "Ação",
                240,
                1999,
                true,
                10,
                8,
                35));
        lsSeries.add(new Series("Homem-Aranha: Sem volta para casa",
                "Ação",
                120,
                2021,
                true,
                10,
                8,
                35));
        lsSeries.add(new Series("Sonic 2",
                "Ação",
                120,
                2021,
                true,
                10,
                8,
                35));

        lsSeries.get(0).avaliarFilmes(5.0);
        lsSeries.get(0).avaliarFilmes(7.0);
        lsSeries.get(0).avaliarFilmes(6.0);
        lsSeries.get(1).avaliarFilmes(4.0);
        lsSeries.get(1).avaliarFilmes(5.0);
        lsSeries.get(1).avaliarFilmes(6.0);
        lsSeries.get(2).avaliarFilmes(3.0);
        lsSeries.get(2).avaliarFilmes(7.0);
        lsSeries.get(2).avaliarFilmes(4.0);

        for (Series lsSerie : lsSeries) {
            lsSerie.exibirFichaTecnica();
            lsSerie.exibirMedia();
            System.out.println("=============================================");
        }

        CalculadoraTempo calculadoraTempo = new CalculadoraTempo();
        calculadoraTempo.incluirTempo(lsFilmes.get(0));
        calculadoraTempo.incluirTempo(lsSeries.get(0));

        System.out.println(calculadoraTempo.getTempoTotal());

        System.out.println(lsFilmes);
    }
}
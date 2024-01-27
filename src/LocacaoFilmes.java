import java.util.ArrayList;
import java.util.List;

public class LocacaoFilmes {
    public static void main(String[] args) {
        List<Filmes> lsFilmes = new ArrayList<>();

        lsFilmes.add(new Filmes("Sonic 2",
                "Ação",
                120,
                2021,
                true));
        lsFilmes.add(new Filmes("Homem-Aranha: Sem volta para casa",
                "Ação",
                120,
                2021,
                true));
        lsFilmes.add(new Filmes("Poderoso Chefão",
                "Ação",
                240,
                1999,
                true));

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

    }
}
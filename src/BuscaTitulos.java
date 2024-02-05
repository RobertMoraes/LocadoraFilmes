import br.com.project.locacao.modelos.TituloOmdb;
import br.com.project.locacao.modelos.Titulos;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.SneakyThrows;

import java.io.FileWriter;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuscaTitulos {
    @SneakyThrows
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String buscarTitulo = "";
        List<Titulos> lsTitulos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (!buscarTitulo.equalsIgnoreCase("sair")) {
            System.out.println("Digite o nome do titulo da serie ou filme: ");
            buscarTitulo = scan.nextLine();
            if (buscarTitulo.equalsIgnoreCase("sair")) {
                break;
            }
            String tituloFormatado = buscarTitulo.replaceAll(" ", "+");
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("http://www.omdbapi.com/?apikey=92860590&t={tituloFormatado}".replace("{tituloFormatado}", tituloFormatado)))
                        .build();
                client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                        .thenApply(HttpResponse::body)
                        .thenAccept(System.out::println)
                        .join();

                TituloOmdb tituloOmdb = gson.fromJson(client.sendAsync(request, HttpResponse.BodyHandlers.ofString()).join().body(), TituloOmdb.class);
                System.out.println(tituloOmdb.toString());

                Titulos titulos = new Titulos(tituloOmdb);

                lsTitulos.add(titulos);

            }catch (Exception e){
                System.out.println("Erro: ");
                System.out.println(e.getMessage());
            }
        }

        System.out.println(lsTitulos);

        FileWriter escrita = new FileWriter("titulos.json");
        escrita.write(gson.toJson(lsTitulos));
        escrita.close();

      /*  try {
            Titulos titulos = new Titulos(tituloOmdb);
            System.out.println(titulos);
            FileWriter escrita = new FileWriter("titulos.txt");
            escrita.write(titulos.toString());
            escrita.close();
        }catch (Exception e){
            System.out.println("Erro: ");
            System.out.println(e.getMessage());
        }

        try {
            FileWriter escrita = new FileWriter("titulos.json");
            escrita.write(String.valueOf(tituloOmdb));
            escrita.close();
        }catch (Exception e){
            System.out.println("Erro: ");
            System.out.println(e.getMessage());
        }*/
    }
}

import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o screen match");
        System.out.println("Filme: top gun maverick");

        int AnoDeLancamento = 2022;
        System.out.println("ano de lançamento: " + AnoDeLancamento);
        Boolean IncluidoNoPlano = true;
         Double notaDoFilme = 8.1;
//Média calculada por opnioes de coçegas;
        Double media = (9.8 + 6.3 + 8.0)/3;
        System.out.println(media);
        String Sinopse;
        Sinopse = """
        Filme Top Gun
        Filme de aventura com galã dos anos 80
        Muito bom!
        Ano de lançamento
        """ + AnoDeLancamento;
        System.out.println(Sinopse);

        int classificacao = (int) (media/2);
        System.out.println(classificacao);
    }

}
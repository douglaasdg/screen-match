public class Main {
    static void main(String[] args) {
        System.out.println("Olá, Bem vindo ao Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);

        String sinopse;

        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento:"""+ " " + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media/2);
        System.out.println(classificacao);

        double temperatura;

        temperatura = 24.00;

        double fahrenheit = (temperatura * 1.8) + 32;
        System.out.println(temperatura + "ºC em Fahrenheit é: " + fahrenheit);

        double temp;

        temp = 75.2;

        double celsius = (temp - 32) / 1.8;
        System.out.println(temp + "ºF em Celsius é: " + celsius);

        double kmh;

        kmh = 110;

        double milha = kmh / 1.609344;
        System.out.println(String.format("A velocidade é de %.2f milhas por hora!", milha));
    }
}

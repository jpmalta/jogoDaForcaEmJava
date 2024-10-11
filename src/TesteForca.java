public class TesteForca {
    public static void main(String[] args) {
        try {
            // Testando a classe BancoDePalavras
            Palavra palavraSorteada = BancoDePalavras.getPalavraSorteada();
            System.out.println("Palavra sorteada: " + palavraSorteada);

            // Testando a classe Tracinhos
            Tracinhos tracinhos = new Tracinhos(palavraSorteada.getTamanho());
            System.out.println("Tracinhos: " + tracinhos);

            // Testando a classe ControladorDeErros
            ControladorDeErros controladorErros = new ControladorDeErros(5);
            controladorErros.registreUmErro();
            System.out.println("Controlador de Erros: " + controladorErros);

            // Testando a classe ControladorDeLetrasJaDigitadas
            ControladorDeLetrasJaDigitadas controladorLetras = new ControladorDeLetrasJaDigitadas();
            controladorLetras.registre('A');
            controladorLetras.registre('B');
            System.out.println("Letras já digitadas: " + controladorLetras);

            // Testando a classe Palavra
            System.out.println("Quantidade de letra A: " + palavraSorteada.getQuantidade('A'));
            System.out.println("Posição da primeira ocorrência da letra A: " + palavraSorteada.getPosicaoDaIezimaOcorrencia(0, 'A'));

        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}

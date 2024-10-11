public class TestePalavra {
    public static void main(String[] args) {
        try {
            Palavra palavra = new Palavra("DANGLARES");
            System.out.println("Palavra: " + palavra);

            System.out.println("Tamanho da palavra: " + palavra.getTamanho()); // Deve mostrar 9
            
            System.out.println("Quantidade da letra 'A': " + palavra.getQuantidade('A')); // Deve mostrar 2
            System.out.println("Posição da 1ª ocorrência de 'A': " + palavra.getPosicaoDaIezimaOcorrencia(0, 'A')); // 1
            System.out.println("Posição da 2ª ocorrência de 'A': " + palavra.getPosicaoDaIezimaOcorrencia(1, 'A')); // 5
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}

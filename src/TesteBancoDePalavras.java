public class TesteBancoDePalavras {
    public static void main(String[] args) {
        try {
            System.out.println("Teste: Sortear 8 palavras");
            for (int i = 0; i < 8; i++) {
                Palavra palavra = BancoDePalavras.getPalavraSorteada();
                System.out.println("Palavra sorteada: " + palavra);
            }
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}

public class TesteTracinhos {
    public static void main(String[] args) {
        try {
            Tracinhos tracinhos = new Tracinhos(4); // palavra com 4 letras
            System.out.println(tracinhos); // Deve mostrar: _ _ _ _

            tracinhos.revele(1, 'A');
            System.out.println(tracinhos); // Deve mostrar: _ A _ _

            tracinhos.revele(3, 'A');
            System.out.println(tracinhos); // Deve mostrar: _ A _ A

            System.out.println("Ainda com tracinhos: " + tracinhos.isAindaComTracinhos()); // true
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}

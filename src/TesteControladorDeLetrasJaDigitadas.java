public class TesteControladorDeLetrasJaDigitadas {
    public static void main(String[] args) {
        try {
            ControladorDeLetrasJaDigitadas controlador = new ControladorDeLetrasJaDigitadas();

            controlador.registre('A');
            System.out.println(controlador); // Deve mostrar A

            controlador.registre('B');
            System.out.println(controlador); // Deve mostrar A,B

            // Verificar se uma letra já foi digitada
            System.out.println(controlador.isJaDigitada('A')); // true
            System.out.println(controlador.isJaDigitada('C')); // false

            // Tentar registrar uma letra repetida (vai lançar exceção)
            controlador.registre('A'); // Deve lançar exceção
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}

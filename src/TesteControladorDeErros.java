public class TesteControladorDeErros {
    public static void main(String[] args) {
        try {
            ControladorDeErros controlador = new ControladorDeErros(3);

            controlador.registreUmErro();
            System.out.println(controlador); // Deve mostrar 1/3

            controlador.registreUmErro();
            System.out.println(controlador); // Deve mostrar 2/3

            controlador.registreUmErro();
            System.out.println(controlador); // Deve mostrar 3/3

            // Tentar registrar mais um erro (vai lançar exceção)
            controlador.registreUmErro(); // Deve lançar exceção

            // Testar clone
            System.out.println("\nTeste 2: Clonando o controlador");
            ControladorDeErros clone = (ControladorDeErros) controlador.clone();
            System.out.println("Clone: " + clone);
            
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}

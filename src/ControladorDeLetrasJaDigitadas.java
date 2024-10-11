public class ControladorDeLetrasJaDigitadas implements Cloneable
{
    private String letrasJaDigitadas;

    public ControladorDeLetrasJaDigitadas ()
    {
        this.letrasJaDigitadas = "";
        
    }

    public boolean isJaDigitada(char letra) {
        for (int i = 0; i < this.letrasJaDigitadas.length(); i++) {
            if (this.letrasJaDigitadas.charAt(i) == letra) {
                return true;
            }
        }
        return false;
    }

    public void registre(char letra) throws Exception {
        if (isJaDigitada(letra))
            throw new Exception("Letra já foi digitada!");
        this.letrasJaDigitadas += letra;
    }

    @Override
    public String toString() {
        return String.join(",", this.letrasJaDigitadas.split(""));
    }
    
    @Override
    public boolean equals (Object obj)
    {
        if (this==obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        ControladorDeLetrasJaDigitadas con = (ControladorDeLetrasJaDigitadas)obj;
        return (this.letrasJaDigitadas.equals(con.letrasJaDigitadas));
    }

    @Override
    public int hashCode ()
    {
        int ret = 444;
        ret = 11*ret + (this.letrasJaDigitadas).hashCode();
        if (ret<0) ret=-ret;
        return ret;
    }

    public ControladorDeLetrasJaDigitadas(
    ControladorDeLetrasJaDigitadas c)
    throws Exception // construtor de c�pia
    {
        if (c == null)
            throw new Exception("Objeto nulo");
        this.letrasJaDigitadas = c.letrasJaDigitadas;
        // copiar c.letrasJaDigitadas em this.letrasJaDigitadas
    }

    public Object clone ()
    {
        ControladorDeLetrasJaDigitadas ret = null;
        try{
            ret = new ControladorDeLetrasJaDigitadas(this);
        }
        catch (Exception erro)
        {}
        return ret;
        // criar uma c�pia do this com o construtor de c�pia e retornar
    }
}

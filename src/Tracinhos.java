public class Tracinhos implements Cloneable
{
    private char texto [];

    public Tracinhos (int qtd) throws Exception
    {
        if (qtd <= 0) throw new Exception("Valor não positivo");
        this.texto = new char [qtd];
        for (int i = 0; i < qtd; i++)
            this.texto[i] = '_';
    }

    public void revele (int posicao, char letra) throws Exception
    {
        if (posicao < 0 || posicao >= (this.texto.length))
            throw new Exception("Posição inválida");
        this.texto[posicao] = letra;
    }

    public boolean isAindaComTracinhos() {
        for (char c : this.texto)
            if (c == '_') return true;
        return false;
    }

    @Override
    public String toString() {
        return String.join(" ", new String(this.texto));
    }
    

    @Override
    public boolean equals (Object obj)
    {
        if (this==obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Tracinhos tra = (Tracinhos)obj;
        return java.util.Arrays.equals(this.texto, tra.texto);
    }

    @Override
    public int hashCode ()
    {
        int ret = 888;
        ret = 31*ret + java.util.Arrays.hashCode(this.texto);
        if (ret<0) ret=-ret;
        return ret;
    }

    public Tracinhos (Tracinhos t) throws Exception // construtor de c�pia
    {
        if (t == null)
            throw new Exception("Objeto nulo");
        
        
        this.texto = new char[t.texto.length];
        
        
        for (int i = 0; i < t.texto.length; i++) {
            this.texto[i] = t.texto[i];
        }
    }

    
    public Object clone ()
    {
        Tracinhos ret = null;
        try{
            ret = new Tracinhos(this); 
        }
        catch (Exception erro)
        {
            throw new RuntimeException("Erro ao clonar o objeto", erro);
        }
        return ret;
        // retornar uma copia de this
    }
}

public class ControladorDeErros implements Cloneable
{
    private int qtdMax, qtdErr=0;

    public ControladorDeErros (int qtdMax) throws Exception
    {
        if (qtdMax <= 0)
        throw new Exception("Quantidade máxima inserida foi não positiva");
        this.qtdMax = qtdMax;
    }

    public void registreUmErro () throws Exception
    {
        if (this.qtdErr == this.qtdMax)
        throw new Exception("Quantidade máxima de erros atingido");
        this.qtdErr++;
    }

    public boolean isAtingidoMaximoDeErros  ()
    {
        if (this.qtdErr==this.qtdMax) return true;
        else return false;
    }

    @Override
    public String toString ()
    {
        return this.qtdErr + "/" + this.qtdMax;
    }

    @Override
    public boolean equals (Object obj)
    {
        if (this==obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        ControladorDeErros cont = (ControladorDeErros)obj;
        if(this.qtdErr!=cont.qtdErr) return false;
        if(this.qtdMax!=cont.qtdMax) return false;
        return true;
    
    }

    @Override
    public int hashCode ()
    {
        int ret = 333;
        ret = 7*ret + (Integer.hashCode(this.qtdErr));
        ret = 7*ret + (Integer.hashCode(this.qtdMax));

        if (ret<0) ret=-ret;
        return ret;
        
    }

    public ControladorDeErros (ControladorDeErros c) throws Exception 
    {
        if (c == null)
            throw new Exception("Modelo ausente");

        this.qtdErr = c.qtdErr;
        this.qtdMax = c.qtdMax;
        
    }

    public Object clone ()
    {
        ControladorDeErros ret = null;
        try{
            ret = new ControladorDeErros(this);
        }
        catch (Exception erro)
        {}
        return ret;
    }
}

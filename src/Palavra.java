public class Palavra implements Comparable<Palavra>
{
    private String texto;

    public Palavra (String texto) throws Exception
    {
        if (texto == null || texto.trim().isEmpty()) throw new Exception("Texto vazio");
        this.texto=texto;
    }

    public int getQuantidade(char letra) {
        int cont = 0;
        for (int i = 0; i < this.texto.length(); i++) {
            if (this.texto.charAt(i) == letra) {
                cont++;
            }
        }
        return cont;
    }

    public int getPosicaoDaIezimaOcorrencia(int i, char letra) throws Exception {
        int apareceu = 0;
        for (int pos = 0; pos < this.texto.length(); pos++) {
            if (this.texto.charAt(pos) == letra) {
                if (apareceu == i) {
                    return pos;
                }
                apareceu++;
            }
        }
        throw new Exception("A " + (i + 1) + " aparição da letra " + letra + " não foi encontrada.");
    }

    public int getTamanho ()
    {
        return this.texto.length();
    }

    @Override
    public String toString ()
    {
        return this.texto;
    }

    @Override
    public boolean equals (Object obj)
    {
        if (this==obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Palavra pal = (Palavra)obj;
        return this.texto.equals(pal.texto);
    }

    @Override
    public int hashCode ()
    {
        int ret = 999;
        ret = 11*ret + this.texto.hashCode();
        if (ret<0) ret=-ret;
        return ret;
    }

    @Override
    public int compareTo (Palavra palavra)
    {
        return this.texto.compareTo(palavra.texto);
    }
}

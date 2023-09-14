package ReprodutorMusical;

public class ReprodutorMusical
{
    public boolean tocando;

    public ReprodutorMusical()
    {
        this.tocando = false;
    }

    public void tocar()
    {
        System.out.println("Tocando...");
        this.tocando = true;
    }

    public void pausar()
    {
        if(tocando)
        {
            System.out.println("Pausado");
        }
    }

    public void selecionarMusica(String musica)
    {
        System.out.println(musica + " selecionada");
    }
}
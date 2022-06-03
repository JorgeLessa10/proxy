import java.util.List;

/*
 ** created by: jorge.lessa
 */
public class JogoProxy {

    private Jogo jogo;
    private Integer id;

    public JogoProxy(Integer id) {
        this.id = id;
    }

    public List<String> obterNomeValorJogo()
    {
        if(this.jogo == null)
        {
            this.jogo = new Jogo(id);
        }
        return jogo.obterNomeValorJogo();
    }

    public List<String> obterNomeCategoriaJogo()
    {
        if(this.jogo == null)
        {
            this.jogo = new Jogo(id);
        }
        return jogo.obterNomeCategoria();
    }

}

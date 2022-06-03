import java.util.Arrays;
import java.util.Date;
import java.util.List;

/*
 ** created by: jorge.lessa
 */
public class Jogo {

    private Integer id;
    private String nome;
    private Date dataLancamento;
    private String categoria;
    private Double valor;

    public Jogo(Integer id) {
        this.id = id;
        Jogo jogo = BD.getJogo(id);
        this.nome = jogo.getNome();
        this.dataLancamento = jogo.getDataLancamento();
        this.categoria = jogo.getCategoria();
        this.valor = jogo.getValor();

    }

    public Jogo(Integer id, String nome, Date dataLancamento, String categoria, Double valor) {
        this.id = id;
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.categoria = categoria;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public List<String> obterNomeValorJogo()
    {
        return Arrays.asList(this.getNome(), this.getValor().toString());
    }

    public List<String> obterNomeCategoria()
    {
        return Arrays.asList(this.getNome(), this.getCategoria());
    }

}

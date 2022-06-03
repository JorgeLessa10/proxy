import java.util.HashMap;
import java.util.Map;

/*
 ** created by: jorge.lessa
 */
public class BD {

    private static Map<Integer, Jogo> jogos = new HashMap<>();

    public static Jogo getJogo(Integer id)
    {
        return jogos.get(id);
    }

    public static void addJogo(Jogo jogo)
    {
        jogos.put(jogo.getId(), jogo);
    }

}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
/*
 ** created by: jorge.lessa
 */
class JogoProxyTest {

    @BeforeEach
    void setUp()
    {
        Jogo j1 = new Jogo(1, "FIFA 22", new Date(2022, 01, 01), "Esporte", 199.99);
        Jogo j2 = new Jogo(2, "FIFA 21", new Date(2021, 01, 01), "Esporte", 59.99);
        Jogo j3 = new Jogo(3, "The Last Of Us Part II", new Date(2020, 06, 04), "Ação e Aventura", 299.99);
        Jogo j4 = new Jogo(4, "NBA2K22", new Date(2022, 01, 01), "Esporte", 239.99);
        BD.addJogo(j1);
        BD.addJogo(j2);
        BD.addJogo(j3);
        BD.addJogo(j4);
    }

    @Test
    void deveRetornarNomeValorDoJogo()
    {
        JogoProxy jogo = new JogoProxy(1);
        assertEquals(Arrays.asList("FIFA 22", "199.99"), jogo.obterNomeValorJogo());
    }

    @Test
    void deveRetornarNomeCategoriaDoJogo()
    {
        JogoProxy jogo = new JogoProxy(3);
        assertEquals(Arrays.asList("The Last Of Us Part II", "Ação e Aventura"), jogo.obterNomeCategoriaJogo());
    }
}
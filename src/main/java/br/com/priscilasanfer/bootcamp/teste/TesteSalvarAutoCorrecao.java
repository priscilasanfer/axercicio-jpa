package br.com.priscilasanfer.bootcamp.teste;

import br.com.priscilasanfer.bootcamp.modelo.AutoCorrecao;
import br.com.priscilasanfer.bootcamp.modelo.Resposta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteSalvarAutoCorrecao {
    public static void main(String[] args) {

        Resposta resposta = new Resposta();
        resposta.setId(3L);

        AutoCorrecao autoCorrecao = new AutoCorrecao();
        autoCorrecao.setNota(10);
        autoCorrecao.setResposta(resposta);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bootcamp");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(autoCorrecao);
        em.getTransaction().commit();

        emf.close();
    }
}

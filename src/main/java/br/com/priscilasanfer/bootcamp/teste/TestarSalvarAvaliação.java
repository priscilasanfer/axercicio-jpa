package br.com.priscilasanfer.bootcamp.teste;

import br.com.priscilasanfer.bootcamp.modelo.Avaliacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestarSalvarAvaliação {
    public static void main(String[] args) {

        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setDescricao("meg meg meg meg meg");
        avaliacao.setTitulo("HTTP");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bootcamp");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(avaliacao);
        em.getTransaction().commit();

        emf.close();
    }
}

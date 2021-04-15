package br.com.priscilasanfer.bootcamp.teste;

import br.com.priscilasanfer.bootcamp.modelo.Aluno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteSalvarAluno {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Meg");
        aluno.setEmail("meg@teste.com");
        aluno.setIdade(8);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bootcamp");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(aluno);
        em.getTransaction().commit();

        emf.close();
    }
}

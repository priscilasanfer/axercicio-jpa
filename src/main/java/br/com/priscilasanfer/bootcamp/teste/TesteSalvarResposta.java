package br.com.priscilasanfer.bootcamp.teste;

import br.com.priscilasanfer.bootcamp.modelo.Aluno;
import br.com.priscilasanfer.bootcamp.modelo.Avaliacao;
import br.com.priscilasanfer.bootcamp.modelo.Resposta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteSalvarResposta {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setId(3L);

        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setId(3L);

        Resposta resposta = new Resposta();
        resposta.setAvaliacao(avaliacao);
        resposta.setAluno(aluno);
        resposta.setResposta("jdkhskdkcnals kjfhkf khffhdskj afdsfjhdskj kjfhsdkfh");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bootcamp");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(resposta);
        em.getTransaction().commit();

        emf.close();
    }
}

package br.com.priscilasanfer.bootcamp.teste;

import br.com.priscilasanfer.bootcamp.modelo.Aluno;
import br.com.priscilasanfer.bootcamp.modelo.Resposta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class BuscarAluno {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bootcamp");
        EntityManager em = emf.createEntityManager();

        Aluno aluno = new Aluno();
        aluno.setId(3L);

        //SQL
        //select * from resposta r where r.aluno_id = 2;

        String jpql = "select r from Resposta r where r.aluno = :pAluno";

        TypedQuery<Resposta> query = em.createQuery(jpql, Resposta.class);
        query.setParameter("pAluno", aluno);

        List<Resposta> resultList = query.getResultList();

        for (Resposta lista : resultList) {
            System.out.println(lista.getResposta());
        }
        emf.close();
    }
}


package br.com.priscilasanfer.bootcamp.teste;

import br.com.priscilasanfer.bootcamp.modelo.AutoCorrecao;

import javax.persistence.*;
import java.util.List;

public class TestaCarregarAutoCorrecao {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bootcamp");
        EntityManager em = emf.createEntityManager();

        AutoCorrecao autoCorrecao = new AutoCorrecao();
        autoCorrecao.setId(3L);

        //select al.nome from autocorrecao atc
        //inner join resposta r
        //on atc.resposta_id = r.id
        //inner join aluno al
        //on r.aluno_id = al.id
        //where atc.id = 3;

        String jpql = "select al.nome from AutoCorrecao atc join atc.resposta r join r.aluno al where atc = :pAutoCorrecao";

        Query query = em.createQuery(jpql);
        query.setParameter("pAutoCorrecao", autoCorrecao);

        List<String> resultList = query.getResultList();

        for (String lista : resultList) {
            System.out.println(lista);
    }
        emf.close();
}

}


package br.com.priscilasanfer.bootcamp.modelo;

import javax.persistence.*;

@Entity
public class AutoCorrecao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer nota;

    @OneToOne
    @JoinColumn(unique = true)
    private Resposta resposta;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public Resposta getResposta() {
        return resposta;
    }

    public void setResposta(Resposta resposta) {
        this.resposta = resposta;
    }

    public Aluno retornaAluno(){
        return resposta.getAluno();
    }

}

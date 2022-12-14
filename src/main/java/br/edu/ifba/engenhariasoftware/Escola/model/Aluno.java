package br.edu.engenhariasoftware.escola.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Aluno{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    private String nome;

    private String cpf;

    private boolean deficiencia;

    private String laudo;

    private String  sexo;
    
    private String nacionalidade;
    
    private String numeroCartaoSus;

}
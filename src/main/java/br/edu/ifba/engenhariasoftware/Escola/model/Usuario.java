package br.edu.engenhariasoftware.escola.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Usuario{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @NotBlank(message = "Descrição é obrigatório")
    private String cpf;

    @NotBlank(message ="O senha é obrigatório")
    private String senha;

    private String email;

    private String dataNascimento;
    
    private String telefone;
    @OneToMany
    @JoinColumn(name = "categoria_id")
    private List<Aluno> alunos;
}
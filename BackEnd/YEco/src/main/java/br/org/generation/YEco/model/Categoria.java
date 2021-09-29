package br.org.generation.YEco.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity 
@Table(name = "tb_categoria") 
public class Categoria {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private long id;
    
    @NotNull(message = "O atributo é obrigatorio!")
    @Size(min = 5, max = 100, message ="O atibuto deve ter no minimo")
    private String nome;
    
    @NotNull(message = "O atributo é obrigatorio!")
    @Size(min = 5, max = 100, message ="O atibuto deve ter no minimo")
    private String tipo;
    
    @NotNull(message = "O atributo é obrigatorio!")
    @Size(min = 5, max = 100, message ="O atibuto deve ter no minimo")
    private String setor;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    

}

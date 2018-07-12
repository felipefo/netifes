package model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Felipe Frechiani
 */
@Entity
@Table(name = "filme")
public class Filme {
    
    private  String nome;
    private  String categoria;
    private  float duracao;
    private  float valor;
    private  String classificacao;
    private  boolean ehLancamento;
    
}

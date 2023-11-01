/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bo;

/**
 *
 * @author aluno
 */
public class Produto {
    private int id;
    private String descricao;
    private String codigoBarra;
    private String quantidade;
    private String status;

    public Produto() {
    }

    public Produto(int id, String descricao, String codigoBarra,String quantidade, String status) {
        this.id = id;
        this.descricao = descricao;
        this.codigoBarra = codigoBarra;
        this.quantidade = quantidade;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    
    
    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    @Override
    public String toString() {
        return this.getId() + " "+
                this.getDescricao() + " "+
                this.getCodigoBarra()+ " "+
                this.getQuantidade()+ " "+
                this.getStatus() + " ";
                
    }
    
    
}

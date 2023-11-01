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
public class ItemCompra {
    private int id;
    private float qtdProduto;
    private float valorUnitario;
    private char status;
    
    private Compra compra;
    private Produto produto;

    public ItemCompra() {
    }

    public ItemCompra(int id, float qtdProduto, float valorUnitario, char status) {
        this.id = id;
        this.qtdProduto = qtdProduto;
        this.valorUnitario = valorUnitario;
        this.status = status;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(float qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString() {
        return this.getId()+ " "+
                this.getQtdProduto() + " "+
                this.getValorUnitario() + " "+
                this.getStatus() + " " +
                this.compra.getNumeronf()+ " "+
                this.compra.getDataHoraCompra()+ " "+
                this.compra.getValorDesconto() + " "+
                this.compra.getFlagTipoDesconto() + " "+
                this.compra.getStatus()+" "+
                this.compra.getObservacao() + " " +
                this.produto.getId() + " "+
                this.produto.getDescricao() + " "+
                this.produto.getCodigoBarra()+ " "+
                this.produto.getStatus() + " ";
        
    }
    
    
}

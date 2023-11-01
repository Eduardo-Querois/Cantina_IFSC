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
public class ItemVenda {
    private int id;
    private float qtdProduto;
    private float valorUnitario;
    private char status;

    private Venda venda;
    private Compra compra;
    public ItemVenda() {
    }

    public ItemVenda(int id, float qtdProduto, float valorUnitario, char status) {
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

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }
    
    

    @Override
    public String toString() {
        return this.getId() + " " +
                this.getQtdProduto() + " " +
                this.getValorUnitario() + " "+
                this.getStatus() + " " +
                this.venda.getId() + " " +
                this.venda.getDataHoraVenda() + " " +
                this.venda.getValorDesconto() + " " +
                this.venda.getFlagTipoDesconto()+ " "+
                this.venda.getObservacao() + " " +
                this.venda.getStatus() + " " +
                this.compra.getId()+ " "+ 
                this.compra.getNumeronf()+ " "+
                this.compra.getDataHoraCompra()+ " "+
                this.compra.getValorDesconto() + " "+
                this.compra.getFlagTipoDesconto() + " "+
                this.compra.getStatus()+" "+
                this.compra.getObservacao() + " ";
    
    
    
}
}
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
public class Venda {
    private int id;
    private String dataHoraVenda;
    private float valorDesconto;
    private char flagTipoDesconto;
    private String observacao;
    private char status;

    private Cliente cliente;
    private Funcionario funcionario;
    
    public Venda() {
    }

    public Venda(Funcionario funcionario,Cliente cliente,int id,String dataHoraVenda, float valorDesconto, char flagTipoDesconto, String observacao, char status) {
        this.id = id;
        this.dataHoraVenda = dataHoraVenda;
        this.valorDesconto = valorDesconto;
        this.flagTipoDesconto = flagTipoDesconto;
        this.observacao = observacao;
        this.status = status;
        this.funcionario = funcionario;
        this.cliente = cliente;
    }

    public char getStatus() {
        return status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
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

    public String getDataHoraVenda() {
        return dataHoraVenda;
    }

    public void setDataHoraVenda(String dataHoraVenda) {
        this.dataHoraVenda = dataHoraVenda;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public char getFlagTipoDesconto() {
        return flagTipoDesconto;
    }

    public void setFlagTipoDesconto(char flagTipoDesconto) {
        this.flagTipoDesconto = flagTipoDesconto;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return  this.getId() + " " +
                this.getDataHoraVenda() + " " +
                this.getValorDesconto() + " " +
                this.getFlagTipoDesconto()+ " "+
                this.getObservacao() + " " +
                this.getStatus() + " "+ 
                this.funcionario.getCpf()+" "+
                this.funcionario.getRg()+" "+
                this.funcionario.getUsuario()+" "+
                this.funcionario.getSenha()+" ";        
    }
                
    }
    
    
    

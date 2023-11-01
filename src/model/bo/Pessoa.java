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
public abstract class Pessoa {

    private int id;
    private String nome;
    private String fone1;
    private String fone2;
    private String email;
    private String status;
    private String complementoEndereco;
    private Endereco endereco;

    public Pessoa() {
    }

    public Pessoa(int id, String nome, String fone1, String fone2, String email, String status, String complementoEndereco) {
        this.id = id;
        this.nome = nome;
        this.fone1 = fone1;
        this.fone2 = fone2;
        this.email = email;
        this.status = status;
        this.complementoEndereco = complementoEndereco;
    }

    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    public void setComplementoEndereco(String complementoEndereco) {
        this.complementoEndereco = complementoEndereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone1() {
        return fone1;
    }

    public void setFone1(String fone1) {
        this.fone1 = fone1;
    }

    public String getFone2() {
        return fone2;
    }

    public void setFone2(String fone2) {
        this.fone2 = fone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return this.getId() + ' '
                + this.getNome() + ' '
                + this.getFone1() + ' '
                + this.getFone2() + ' '
                + this.getEmail() + ' '
                + this.getComplementoEndereco() + ' '
                + this.endereco.getCep() + ' '
                + this.endereco.getLogradouro() + ' '
                + this.endereco.getStatus() + ' ';
    }

}

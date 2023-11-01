/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gambiarras;
import view.Cadastro.CadastroPessoaView;
/**
 *
 * @author aluno
 */
public class AtivaDesativaClassePessoa {
    
    CadastroPessoaView cadastroPessoaView;
    
    public void ativaDesativaCliente(int numero) {

        if (numero == 0) {
            
            this.cadastroPessoaView.getjFormattedTextFieldCPF1().setEnabled(true);
            this.cadastroPessoaView.getjFormatedFieldRG1().setEnabled(true);
            this.cadastroPessoaView.getjTextFieldRazaoSocial().setEnabled(false);
            this.cadastroPessoaView.getjTextFieldInscricaoEstadual().setEnabled(false);
            this.cadastroPessoaView.getjFormattedTextFieldCNPJ().setEnabled(false);
            this.cadastroPessoaView.getjTextFieldMatricula().setEnabled(true);
            this.cadastroPessoaView.getjFormattedTextFieldDataNasc().setEnabled(true);
            this.cadastroPessoaView.getjTextFieldUsuario().setEnabled(false);
            this.cadastroPessoaView.getjPasswordSenha().setEnabled(false);

        } else if (numero == 1) {
            this.cadastroPessoaView.getjFormattedTextFieldCPF1().setEnabled(true);
            this.cadastroPessoaView.getjFormatedFieldRG1().setEnabled(true);
            this.cadastroPessoaView.getjTextFieldRazaoSocial().setEnabled(false);
            this.cadastroPessoaView.getjTextFieldInscricaoEstadual().setEnabled(false);
            this.cadastroPessoaView.getjFormattedTextFieldCNPJ().setEnabled(false);
            this.cadastroPessoaView.getjTextFieldMatricula().setEnabled(false);
            this.cadastroPessoaView.getjFormattedTextFieldDataNasc().setEnabled(false);
            this.cadastroPessoaView.getjTextFieldUsuario().setEnabled(true);
            this.cadastroPessoaView.getjPasswordSenha().setEnabled(true);

        } else if (numero == 2) {
            this.cadastroPessoaView.getjFormattedTextFieldCPF1().setEnabled(false);
            this.cadastroPessoaView.getjFormatedFieldRG1().setEnabled(false);
            this.cadastroPessoaView.getjTextFieldRazaoSocial().setEnabled(true);
            this.cadastroPessoaView.getjTextFieldInscricaoEstadual().setEnabled(true);
            this.cadastroPessoaView.getjFormattedTextFieldCNPJ().setEnabled(true);
            this.cadastroPessoaView.getjTextFieldMatricula().setEnabled(false);
            this.cadastroPessoaView.getjFormattedTextFieldDataNasc().setEnabled(false);
            this.cadastroPessoaView.getjTextFieldUsuario().setEnabled(false);
            this.cadastroPessoaView.getjPasswordSenha().setEnabled(false);

        }

    }
    
    
}

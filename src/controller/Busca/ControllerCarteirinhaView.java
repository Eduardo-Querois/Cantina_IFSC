/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Busca;

import static DAO.Persiste.carteirinhaList;
import static DAO.Persiste.clienteList;
import Service.CarteirinhaService;
import controller.cadastro.ControllerCadastroCarteirinha;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Carteirinha;
import model.bo.Cliente;
import view.Busca.CarteirinhaView;

/**
 *
 * @author joao-
 */
public class ControllerCarteirinhaView implements ActionListener {

    int contador;
    CarteirinhaView carteirinhaView;

    public ControllerCarteirinhaView(CarteirinhaView carteirinhaView) {
        this.carteirinhaView = carteirinhaView;

        this.carteirinhaView.getjButtonCarregar().addActionListener(this);
        this.carteirinhaView.getjButtonSair().addActionListener(this);
        this.carteirinhaView.getjButton1().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.carteirinhaView.getjButtonCarregar()) {
            ControllerCadastroCarteirinha.codigo = (int) this.carteirinhaView.getjTable1().getValueAt(this.carteirinhaView.getjTable1().getSelectedRow(), 0);
            this.carteirinhaView.dispose();

        } else if (e.getSource() == this.carteirinhaView.getjButtonSair()) {
            this.carteirinhaView.dispose();

        } else if (e.getSource() == this.carteirinhaView.getjButton1()) {
            DAO.Persiste.getInstance();
            
            contador++;
            
            if (contador == 1) {
                DefaultTableModel tabela = (DefaultTableModel) this.carteirinhaView.getjTable1().getModel();
                for (Carteirinha carteirinhaAtual : CarteirinhaService.carregar()) {
                    tabela.addRow(new Object[]{carteirinhaAtual.getId(),
                        carteirinhaAtual.getCodigoBarra(),
                        carteirinhaAtual.getDataGeracao(),
                        carteirinhaAtual.getDataCancelamento(),
                        carteirinhaAtual.getCliente().getMatricula(),
                        carteirinhaAtual.getCliente().getCpf(),
                        carteirinhaAtual.getCliente().getRg(),
                        carteirinhaAtual.getCliente().getDataNascimento()

                    });

                }
            }
        }

    }

}

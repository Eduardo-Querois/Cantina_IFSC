/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Busca;

import static DAO.Persiste.enderecoList;
import Service.EnderecoService;
import controller.cadastro.ControllerCadastroEndereco;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import view.Busca.EnderecoView;
import model.bo.Endereco;
import view.Busca.CidadeView;

/**
 *
 * @author joao-
 */
public class ControllerEnderecoView implements ActionListener {

    EnderecoView enderecoView;
    public static String logradouroEndereco;

    public ControllerEnderecoView(EnderecoView enderecoView) {
        this.enderecoView = enderecoView;

        this.enderecoView.getjButtonCarregar().addActionListener(this);
        this.enderecoView.getjButtonSair().addActionListener(this);
        this.enderecoView.getjButtonBuscar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.enderecoView.getjButtonCarregar()) {
            ControllerCadastroEndereco.codigo = (int) this.enderecoView.getjTable1().getValueAt(this.enderecoView.getjTable1().getSelectedRow(), 0);
            String logradouro = (String) this.enderecoView.getjTable1().getValueAt(this.enderecoView.getjTable1().getSelectedRow(), 2);
            // String cidade = (String) this.enderecoView.getjTable1().getValueAt(this.enderecoView.getjTable1().getSelectedRow(),4);
            // String bairro = (String) this.enderecoView.getjTable1().getValueAt(this.enderecoView.getjTable1().getSelectedRow(),3);

            logradouroEndereco = logradouro;

            EnderecoService.carregar();

            this.enderecoView.dispose();

        } else if (e.getSource() == this.enderecoView.getjButtonSair()) {
            this.enderecoView.dispose();

        } else if (e.getSource() == this.enderecoView.getjButtonBuscar()) {

            if (this.enderecoView.getjTextBuscar().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Atenção! \nOpcão de Filtro Vazia...");

            } else {
                List<Endereco> enderecoList = new ArrayList<>();
                if (this.enderecoView.getComboBoxFiltrar().getSelectedIndex() == 0) {
                    
                    enderecoList.add(EnderecoService.carregar(Integer.parseInt(this.enderecoView.getjTextBuscar().getText())));
                } else if (this.enderecoView.getComboBoxFiltrar().getSelectedIndex() == 1) {
                    
                    enderecoList = EnderecoService.carregar(this.enderecoView.getjTextBuscar().getText().trim());

                }

                DefaultTableModel tabela = (DefaultTableModel) this.enderecoView.getjTable1().getModel();
                tabela.setRowCount(0);
                for (Endereco enderecoAtual : enderecoList) {
                    tabela.addRow(new Object[]{enderecoAtual.getId(),
                        enderecoAtual.getCep(),
                        enderecoAtual.getLogradouro(),
                        enderecoAtual.getBairro().getDescricao(),
                        enderecoAtual.getCidade().getDescricao(),
                        enderecoAtual.getStatus()

                    });

                }

            }

        }

    }

}
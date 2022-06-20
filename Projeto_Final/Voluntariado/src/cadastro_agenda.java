import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class cadastro_agenda extends JFrame {

	private JPanel contentPane;
	private JTextField desc_agenda;
	private JTextField acao_agenda;
	private JTextField data_agenda;
	private JTextField hora_agenda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cadastro_agenda frame = new cadastro_agenda();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public cadastro_agenda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 311);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(null);
		panel.setBounds(-13, 11, 461, 43);
		contentPane.add(panel);
		
		JTextArea txtrCadastroDeAgenda = new JTextArea();
		txtrCadastroDeAgenda.setEditable(false);
		txtrCadastroDeAgenda.setText("Cadastro de Agenda do Projeto");
		txtrCadastroDeAgenda.setFont(new Font("Nirmala UI", Font.BOLD, 16));
		txtrCadastroDeAgenda.setBackground(SystemColor.menu);
		txtrCadastroDeAgenda.setBounds(113, 11, 242, 26);
		panel.add(txtrCadastroDeAgenda);
		
		desc_agenda = new JTextField();
		desc_agenda.setColumns(10);
		desc_agenda.setBounds(145, 67, 216, 20);
		contentPane.add(desc_agenda);
		
		JTextArea txtrData = new JTextArea();
		txtrData.setEditable(false);
		txtrData.setText("Descri\u00E7\u00E3o:");
		txtrData.setFont(new Font("Nirmala UI", Font.PLAIN, 13));
		txtrData.setBounds(70, 65, 65, 22);
		contentPane.add(txtrData);
		
		JTextArea txtrHora = new JTextArea();
		txtrHora.setEditable(false);
		txtrHora.setText("A\u00E7\u00E3o:");
		txtrHora.setFont(new Font("Nirmala UI", Font.PLAIN, 13));
		txtrHora.setBounds(98, 99, 37, 22);
		contentPane.add(txtrHora);
		
		acao_agenda = new JTextField();
		acao_agenda.setColumns(10);
		acao_agenda.setBounds(145, 101, 216, 20);
		contentPane.add(acao_agenda);
		
		data_agenda = new JTextField();
		data_agenda.setColumns(10);
		data_agenda.setBounds(145, 134, 216, 20);
		contentPane.add(data_agenda);
		
		JTextArea txtrData_1 = new JTextArea();
		txtrData_1.setEditable(false);
		txtrData_1.setText("Data:");
		txtrData_1.setFont(new Font("Nirmala UI", Font.PLAIN, 13));
		txtrData_1.setBounds(98, 132, 37, 22);
		contentPane.add(txtrData_1);
		
		JTextArea txtrHora_1 = new JTextArea();
		txtrHora_1.setEditable(false);
		txtrHora_1.setText("Hora:");
		txtrHora_1.setFont(new Font("Nirmala UI", Font.PLAIN, 13));
		txtrHora_1.setBounds(98, 163, 37, 22);
		contentPane.add(txtrHora_1);
		
		hora_agenda = new JTextField();
		hora_agenda.setColumns(10);
		hora_agenda.setBounds(145, 165, 216, 20);
		contentPane.add(hora_agenda);
		
		JButton salvar_agenda = new JButton("Salvar ");
		salvar_agenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String descAgenda = desc_agenda.getText();
				String acaoAgenda = acao_agenda.getText();
				String dataAgenda = data_agenda.getText();
				String statusAgenda = hora_agenda.getText();
				
				try {
					ManipuladorArquivo.cadastrarAgendaProjetoSocial(statusAgenda, descAgenda, acaoAgenda, dataAgenda, statusAgenda);
				} catch (IOException e1) {
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Ocorreu um erro!");
				}
				

				
			}
		});
		salvar_agenda.setBounds(203, 206, 115, 23);
		contentPane.add(salvar_agenda);
		
		JButton importar_agenda = new JButton("Importar Arquivo");
		importar_agenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ManipuladorArquivo.lerArquivoTxt(null);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		importar_agenda.setBounds(203, 238, 115, 23);
		contentPane.add(importar_agenda);
	}

}

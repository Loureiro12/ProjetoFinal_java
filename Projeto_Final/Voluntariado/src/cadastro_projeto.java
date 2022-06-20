import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class cadastro_projeto extends JFrame {

	private JPanel contentPane;
	private JTextField titulo_projeto;
	private JTextField obj_projeto;
	private JTextField end_projeto;
	private JTextField data_projeto;
	private JTextField status_projeto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cadastro_projeto frame = new cadastro_projeto();
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
	public cadastro_projeto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 397, 334);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlightText);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrTtulo = new JTextArea();
		txtrTtulo.setEditable(false);
		txtrTtulo.setText("T\u00EDtulo:");
		txtrTtulo.setFont(new Font("Nirmala UI", Font.PLAIN, 13));
		txtrTtulo.setBounds(89, 65, 43, 22);
		contentPane.add(txtrTtulo);
		
		JTextArea txtrObjetivo = new JTextArea();
		txtrObjetivo.setEditable(false);
		txtrObjetivo.setText("Objetivo:");
		txtrObjetivo.setFont(new Font("Nirmala UI", Font.PLAIN, 13));
		txtrObjetivo.setBounds(74, 98, 58, 22);
		contentPane.add(txtrObjetivo);
		
		JTextArea txtrEndereoCompleto = new JTextArea();
		txtrEndereoCompleto.setEditable(false);
		txtrEndereoCompleto.setText("Endere\u00E7o completo:");
		txtrEndereoCompleto.setFont(new Font("Nirmala UI", Font.PLAIN, 13));
		txtrEndereoCompleto.setBounds(10, 131, 122, 22);
		contentPane.add(txtrEndereoCompleto);
		
		JTextArea txtrDataDenicio = new JTextArea();
		txtrDataDenicio.setEditable(false);
		txtrDataDenicio.setText("Data de \u00EDnicio:");
		txtrDataDenicio.setFont(new Font("Nirmala UI", Font.PLAIN, 13));
		txtrDataDenicio.setBounds(44, 164, 88, 22);
		contentPane.add(txtrDataDenicio);
		
		JTextArea txtrStatus = new JTextArea();
		txtrStatus.setEditable(false);
		txtrStatus.setText("Status:");
		txtrStatus.setFont(new Font("Nirmala UI", Font.PLAIN, 13));
		txtrStatus.setBounds(89, 197, 43, 22);
		contentPane.add(txtrStatus);
		
		titulo_projeto = new JTextField();
		titulo_projeto.setBounds(138, 67, 216, 20);
		contentPane.add(titulo_projeto);
		titulo_projeto.setColumns(10);
		
		obj_projeto = new JTextField();
		obj_projeto.setColumns(10);
		obj_projeto.setBounds(138, 100, 216, 20);
		contentPane.add(obj_projeto);
		
		end_projeto = new JTextField();
		end_projeto.setColumns(10);
		end_projeto.setBounds(138, 133, 216, 20);
		contentPane.add(end_projeto);
		
		data_projeto = new JTextField();
		data_projeto.setColumns(10);
		data_projeto.setBounds(138, 164, 216, 20);
		contentPane.add(data_projeto);
		
		status_projeto = new JTextField();
		status_projeto.setColumns(10);
		status_projeto.setBounds(138, 199, 216, 20);
		contentPane.add(status_projeto);
		
		JButton salvar_projeto = new JButton("Salvar ");
		salvar_projeto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tituloProjeto = titulo_projeto.getText();
				String ObjProjeto = obj_projeto.getText();
				String dataProjeto = data_projeto.getText();
				String statusProjeto = status_projeto.getText();
				
				try {
					ManipuladorArquivo.cadastrarProjetoSocial(statusProjeto, tituloProjeto, ObjProjeto, dataProjeto, statusProjeto);
				} catch (IOException e1) {
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Ocorreu um erro!");
				}
			}
		});
		salvar_projeto.setBounds(198, 230, 115, 23);
		contentPane.add(salvar_projeto);
		
		JButton importar_projeto = new JButton("Importar Arquivo");
		importar_projeto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ManipuladorArquivo.lerArquivoTxt(null);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		importar_projeto.setBounds(198, 261, 115, 23);
		contentPane.add(importar_projeto);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBounds(-11, 11, 402, 43);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextArea txtrCadastroDeProjeto = new JTextArea();
		txtrCadastroDeProjeto.setEditable(false);
		txtrCadastroDeProjeto.setBackground(SystemColor.control);
		txtrCadastroDeProjeto.setBounds(99, 11, 205, 26);
		panel.add(txtrCadastroDeProjeto);
		txtrCadastroDeProjeto.setText("Cadastro de Projeto Social");
		txtrCadastroDeProjeto.setFont(new Font("Nirmala UI", Font.BOLD, 16));
	}
}

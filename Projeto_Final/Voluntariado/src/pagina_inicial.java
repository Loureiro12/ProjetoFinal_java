import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pagina_inicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pagina_inicial frame = new pagina_inicial();
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
	public pagina_inicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 282);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton acessar_tela_projeto = new JButton("Cadastrar Projeto Social");
		acessar_tela_projeto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cadastro_projeto cad = new cadastro_projeto();
				cad.setVisible(true);
			}
		});
		acessar_tela_projeto.setBounds(111, 95, 189, 23);
		contentPane.add(acessar_tela_projeto);
		
		JButton acessar_tela_agenda = new JButton("Cadastrar Agenda Projeto Social");
		acessar_tela_agenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		acessar_tela_agenda.setBounds(111, 132, 189, 23);
		contentPane.add(acessar_tela_agenda);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(null);
		panel.setBounds(-11, 11, 425, 43);
		contentPane.add(panel);
		
		JTextArea txtrSistemaVoluntariado = new JTextArea();
		txtrSistemaVoluntariado.setEditable(false);
		txtrSistemaVoluntariado.setText("Sistema Voluntariado");
		txtrSistemaVoluntariado.setFont(new Font("Nirmala UI", Font.BOLD, 16));
		txtrSistemaVoluntariado.setBackground(SystemColor.menu);
		txtrSistemaVoluntariado.setBounds(125, 11, 177, 26);
		panel.add(txtrSistemaVoluntariado);
	}
}

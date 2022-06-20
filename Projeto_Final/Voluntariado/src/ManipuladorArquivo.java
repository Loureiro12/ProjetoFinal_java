
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.Scanner;

public class ManipuladorArquivo {

	public static void leitorTxt(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		while (true) {
			if (linha != null) {
				System.out.println(linha);

			} else
				break;
			linha = buffRead.readLine();
		}
		buffRead.close();
	}

	public static void cadastrarProjetoSocial(String path, String tituloProjeto, String objProjeto, String dataProjeto, String statusProjeto) throws IOException {
		Scanner entrance = new Scanner(System.in);
		
		BufferedWriter escrever = new BufferedWriter(new FileWriter(path));
		
		ArrayList<String> projetoSocial = new ArrayList();
		
		projetoSocial.add(tituloProjeto+";"+objProjeto+";"+dataProjeto+";"+statusProjeto);
		
		escrever.append(projetoSocial + "\n");
		escrever.close();
		JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");

	}
	
	public static void cadastrarAgendaProjetoSocial(String path, String descAgenda, String acaoAgenda, String dataAgenda, String statusAgenda) throws IOException {
		Scanner entrance = new Scanner(System.in);
		
		BufferedWriter escrever = new BufferedWriter(new FileWriter(path));
		
		ArrayList<String> agendaProjetoSocial = new ArrayList();
		
		agendaProjetoSocial.add(descAgenda+";"+acaoAgenda+";"+dataAgenda+";"+statusAgenda);
		
		escrever.append(agendaProjetoSocial + "\n");
		escrever.close();
		JOptionPane.showMessageDialog(null, "Agenda cadastrada com sucesso!");
		
	}
	
	public static void lerArquivoTxt(String path) throws IOException {
		Scanner entrance = new Scanner(System.in);
		
		ArrayList<String> agendaProjetoSocial = new ArrayList();
		int opcao;
	    
	    String nome = JOptionPane.showInputDialog("Informe o nome de arquivo texto:\n");
		
	     opcao = Integer.parseInt(nome);

	    System.out.printf("\nConteúdo do arquivo texto:\n");
	    
	    try {
	      FileReader arq = new FileReader(nome);
	      BufferedReader lerArq = new BufferedReader(arq);

	      String linha = lerArq.readLine(); 
	      
	      while (linha != null) {
			agendaProjetoSocial.add(linha);
	        linha = lerArq.readLine(); 
	      }

	      arq.close();
	      
	      JOptionPane.showMessageDialog(null, "Arquivo salvo com sucesso!");
	    } catch (IOException e) {
	        System.err.printf("Erro na abertura do arquivo: %s.\n",
	          e.getMessage());
	    }

	    System.out.println();
		
	}

}

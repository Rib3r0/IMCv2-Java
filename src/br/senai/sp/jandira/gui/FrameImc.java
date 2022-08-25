package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Cliente;

public class FrameImc {

	public String titulo;
	public int largura;
	public int altura;
	public Color corDeFundo;
	public Font fontesDosLabels;
	public Color corDoButton;
	public Font fonteTextField;

	public void criarTela() {

		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);

		// Obter instanca do container da janela
		Container painel = tela.getContentPane();
		painel.setBackground(corDeFundo);

		// Titulo
		JLabel labelTitulo = new JLabel();
		labelTitulo.setText("IMC");
		labelTitulo.setBounds(30, 30, 200, 80);
		painel.add(labelTitulo);
		labelTitulo.setFont(new Font("Serif", Font.BOLD, 80));
		labelTitulo.setForeground(new Color(255, 165, 0));

		// Nome
		JLabel labelNome = new JLabel();
		labelNome.setText("Nome:");
		labelNome.setBounds(30, 100, 100, 30);
		labelNome.setFont(fontesDosLabels);
		painel.add(labelNome);
		

		JTextField textFieldNome = new JTextField();
		textFieldNome.setBounds(30, 125, 200, 20);
		textFieldNome.setFont(fonteTextField);
		painel.add(textFieldNome);
		
		// Peso
		JLabel labelPeso = new JLabel();
		labelPeso.setText("Peso:");
		labelPeso.setBounds(30, 140, 100, 30);
		labelPeso.setFont(fontesDosLabels);
		painel.add(labelPeso);

		JTextField textFieldPeso = new JTextField();
		textFieldPeso.setBounds(30, 165, 100, 20);
		painel.add(textFieldPeso);

		// Altura
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura:");
		labelAltura.setBounds(30, 180, 100, 30);
		labelAltura.setFont(fontesDosLabels);
		painel.add(labelAltura);

		JTextField textFieldAltura = new JTextField();
		textFieldAltura.setBounds(30, 205, 100, 20);
		painel.add(textFieldAltura);
		
		// Data de Nascimeto
		JLabel labelDataDeNascimento = new JLabel();
		labelDataDeNascimento.setText("Data de Nascimento:");
		labelDataDeNascimento.setBounds(30, 220, 250, 30);
		labelDataDeNascimento.setFont(fontesDosLabels);
		painel.add(labelDataDeNascimento);
		
		JTextField textFieldDataDeNascimento = new JTextField();
		textFieldDataDeNascimento.setBounds(30, 245, 100, 20);
		textFieldDataDeNascimento.setFont(fontesDosLabels);
		painel.add(textFieldDataDeNascimento);

		// Criar um botão
		JButton buttonCalcularImc = new JButton();
		buttonCalcularImc.setText("Calcular");
		buttonCalcularImc.setBounds(350, 400, 100, 30);
		buttonCalcularImc.setBackground(corDoButton);
		
		

		// Adicionar o botão ao painel
		painel.add(buttonCalcularImc);
		
		//resultado
		JLabel resultadoImc = new JLabel();
		resultadoImc.setText("Seu IMC é: xxxx");
		resultadoImc.setBounds(30, 270, 350, 30);
		resultadoImc.setFont(fontesDosLabels);
		painel.add(resultadoImc);
		
		JLabel statusImc = new JLabel();
		statusImc.setText("Você está xxxx");
		statusImc.setBounds(30, 290, 400, 30);
		statusImc.setFont(fontesDosLabels);
		painel.add(statusImc);
		
		//click
		buttonCalcularImc.addActionListener(new ActionListener() {
					
			@Override
			public void actionPerformed(ActionEvent e) {
						
				Cliente cliente = new Cliente();
				cliente.nome = textFieldNome.getText();
				cliente.peso = Double.parseDouble(textFieldPeso.getText());
				cliente.altura = Double.parseDouble(textFieldAltura.getText());
					
				System.out.println(cliente.nome);
				System.out.println(cliente.peso);
				System.out.println(cliente.altura);
						
				resultadoImc.setText(cliente.nome + " seu IMC é " + cliente.getImc());
				statusImc.setText("Você está " + cliente.getStatus());
						
			}
			
		 
		});
		
		textFieldNome.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
			
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
			
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		
		
		textFieldNome.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});

		tela.setVisible(true);

	}

}

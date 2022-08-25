package br.senai.sp.jandira;

import java.awt.Color;
import java.awt.Font;
import java.time.LocalDate;

import br.senai.sp.jandira.gui.FrameImc;
import br.senai.sp.jandira.model.Cliente;

public class AppAcademia {
	
	public static void main(String[] args) {
		
		FrameImc tela = new FrameImc();
		tela.titulo = "Calculadora de IMC";
		tela.largura = 500;
		tela.altura = 500;
		tela.corDeFundo = Color.GRAY;
		tela.fontesDosLabels = new Font("BankGothic Md BT", Font.ITALIC, 20);
		tela.fonteTextField = new Font("BankGothic Md BT", 0, 15);
		tela.corDoButton = new Color(255, 165, 0);
		
		tela.criarTela();
		
		
		Cliente ana = new Cliente();
		Cliente pedro = new Cliente();
		
		System.out.println(ana);
		System.out.println(pedro);
				
		ana.nome = "Ana Maria Brega";
		ana.dataDeNascimento = LocalDate.of(1950, 6, 21);
		ana.peso = 58;
		ana.altura = 1.67;
		
		pedro.nome = "Pedro Dias";
		pedro.dataDeNascimento = LocalDate.of(2002, 2, 28);
		pedro.peso = 80;
		pedro.altura = 1.75;
		
		System.out.println(ana.getImc());
		System.out.println(ana.getStatus());
		System.out.println(pedro.getImc());
		
		
		
		
	}

}

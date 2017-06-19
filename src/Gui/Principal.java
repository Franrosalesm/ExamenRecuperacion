package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Gui.Principal;
import models.Pokemon;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JEditorPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Principal extends JFrame{

	//Le pasamos la clase pokemon, y se pone estática para poder modificarla
	//Jframe se pone público para que ésta clase pueda llamarse desde el arranque
	public JFrame frame;
	static Pokemon c1;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.YELLOW);
		frame.getContentPane().setForeground(Color.YELLOW);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		frame.setBounds(100, 100, 482, 389);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnInsertarPokemon = new JButton("Insertar Pokemon");
		btnInsertarPokemon.setBackground(Color.PINK);
		btnInsertarPokemon.setForeground(Color.BLACK);
		btnInsertarPokemon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {  //Funcion que indica que cuando hagamos click, se deje de mostrar ésta ventana
														//y aparezca la que le indicamos, en este caso la clase insertar
				
				frame.setVisible(false);

				Insertar p = new Insertar();
				p.frame.setVisible(true);
				
				
			}
		});
		btnInsertarPokemon.setBounds(54, 144, 146, 84);
		frame.getContentPane().add(btnInsertarPokemon);
		
		JButton btnBuscarPokemon = new JButton("Buscar Pokemon");
		btnBuscarPokemon.setBackground(Color.WHITE);
		btnBuscarPokemon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { //Funcion que indica que cuando hagamos click, se deje de mostrar ésta ventana
												     //y aparezca la que le indicamos, en este caso la clase Buscar

				frame.setVisible(false);

				Buscar p = new Buscar();
				p.frame.setVisible(true);
			}
		});
		btnBuscarPokemon.setBounds(263, 144, 162, 84);
		frame.getContentPane().add(btnBuscarPokemon);
		
		JLabel lblPokdex = new JLabel("POK\u00C9DEX");
		lblPokdex.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPokdex.setBounds(178, 29, 116, 49);
		frame.getContentPane().add(lblPokdex);
		
		JLabel label = new JLabel("");
		label.setBounds(286, 23, 67, 25);
		label.setVisible(false);
		frame.getContentPane().add(label);
	}

}

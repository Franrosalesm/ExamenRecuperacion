package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

import Gui.Principal;
import contenedor.Lista;
import Gui.Insertar;
import models.Pokemon;

import javax.swing.JEditorPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Buscar extends JFrame {

	protected JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	protected int indice = 0;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buscar window = new Buscar();
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
	public Buscar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().setBackground(Color.YELLOW);
		frame.setBounds(100, 100, 450, 391);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMenBuscar = new JLabel("Men\u00FA Buscar");
		lblMenBuscar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMenBuscar.setBounds(163, 11, 116, 22);
		frame.getContentPane().add(lblMenBuscar);
		
		JButton button = new JButton("<");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				anteriorCliente();
				ImprimirCliente();
				updateContador();
			}
		});
		button.setBounds(38, 52, 80, 41);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton(">");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				siguienteCliente();
				ImprimirCliente();
				updateContador();
			}
		});
		button_1.setBounds(320, 52, 80, 41);
		frame.getContentPane().add(button_1);
		
		JLabel label = new JLabel("");
		label.setBounds(175, 59, 80, 22);
		frame.getContentPane().add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnVolverAtrs = new JButton("Volver Atr\u00E1s");
		btnVolverAtrs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Principal a = new Principal();
				a.frame.setVisible(true);
			}
		});
		btnVolverAtrs.setForeground(Color.WHITE);
		btnVolverAtrs.setBackground(Color.RED);
		btnVolverAtrs.setBounds(287, 311, 113, 30);
		frame.getContentPane().add(btnVolverAtrs);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(52, 134, 46, 14);
		lblNombre.setEnabled(false);
		frame.getContentPane().add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(113, 131, 86, 20);
		textField.setEnabled(false);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setBounds(52, 178, 46, 14);
		lblNumero.setEnabled(false);
		frame.getContentPane().add(lblNumero);
		
		textField_1 = new JTextField();
		textField_1.setBounds(113, 175, 86, 20);
		textField_1.setEnabled(false);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNivelEvolucin = new JLabel("Nivel evoluci\u00F3n");
		lblNivelEvolucin.setBounds(27, 221, 91, 14);
		lblNivelEvolucin.setEnabled(false);
		frame.getContentPane().add(lblNivelEvolucin);
		
		textField_2 = new JTextField();
		textField_2.setBounds(113, 218, 86, 20);
		textField_2.setEnabled(false);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblRegin = new JLabel("Regi\u00F3n");
		lblRegin.setBounds(52, 260, 46, 14);
		lblRegin.setEnabled(false);
		frame.getContentPane().add(lblRegin);
		
		textField_3 = new JTextField();
		textField_3.setBounds(113, 257, 86, 20);
		textField_3.setEnabled(false);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(287, 134, 46, 14);
		lblTipo.setEnabled(false);
		frame.getContentPane().add(lblTipo);
		
		textField_4 = new JTextField();
		textField_4.setBounds(320, 131, 86, 20);
		textField_4.setEnabled(false);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblComentarios = new JLabel("Comentarios");
		lblComentarios.setBounds(246, 178, 80, 14);
		lblComentarios.setEnabled(false);
		frame.getContentPane().add(lblComentarios);
		
		JButton btnVerPokemons = new JButton("Ver Pokemons");
		btnVerPokemons.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				updateContador();
			}
		});
		btnVerPokemons.setBounds(10, 11, 143, 23);
		frame.getContentPane().add(btnVerPokemons);
		
		textField_5 = new JTextField();
		textField_5.setBounds(320, 175, 86, 99);
		textField_5.setEnabled(false);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
	}
	
	//Cuando hagamos click en ver pokemons, en el label aparecera un texto con un indice, 
	//cuyo valor será dependiendo de los pokemons que se hayan almacenado
	
	private void updateContador() {
		JLabel label = new JLabel((indice + 1) + " de " + contenedor.Lista.ListaPokemons.size());
		
	}
	
	//Al hacer click te muestra los datos del siguiente pokemon que has guardado
	private int siguienteCliente(){
		++indice;
		if (indice == contenedor.Lista.ListaPokemons.size()) {
			indice = 0;
		}
		return indice;
		
	}
	//Al hacer click te muestra los datos del anterior pokemon que has guardado
	private int anteriorCliente(){
		--indice;
		if (indice < 0) {
			indice = contenedor.Lista.size()-1;
		}
		return indice;
		
	}
	//Indicamos que aparezca el texto introducido por teclado en la clase insertar
	
	public void ImprimirCliente() {

		Pokemon p = contenedor.Lista.ListaPokemons.get(indice);

		
		textField.setText(p.getNombre().toString());
		textField_1.setText(p.getNumero().toString());
		textField_2.setText("" + p.getNivelevolucion());
		textField_3.setText(p.getRegion().toString());
		textField_4.setText(p.getTipo().toString());
		textField_5.setText(p.getComentarios().toString());
		
		

	}

}

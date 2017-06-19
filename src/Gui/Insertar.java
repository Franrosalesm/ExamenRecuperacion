package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import Gui.Principal;
import models.Pokemon;

import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;

import javax.swing.JTextPane;

public class Insertar extends JFrame{

	public static final String Lista = null;
	protected JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Insertar window = new Insertar();
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
	public Insertar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.YELLOW);
		frame.getContentPane().setForeground(Color.YELLOW);
		frame.setBounds(100, 100, 450, 376);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMenInsertar = new JLabel("Men\u00FA Insertar");
		lblMenInsertar.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMenInsertar.setBounds(155, 11, 133, 20);
		frame.getContentPane().add(lblMenInsertar);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(38, 72, 46, 14);
		frame.getContentPane().add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(84, 69, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNmero = new JLabel("N\u00FAmero");
		lblNmero.setBounds(38, 114, 46, 14);
		frame.getContentPane().add(lblNmero);
		
		textField_1 = new JTextField();
		textField_1.setBounds(84, 111, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNivelEvolucin = new JLabel("Nivel Evoluci\u00F3n");
		lblNivelEvolucin.setBounds(10, 159, 87, 14);
		frame.getContentPane().add(lblNivelEvolucin);
		
		textField_2 = new JTextField();
		textField_2.setBounds(94, 156, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblRegin = new JLabel("Regi\u00F3n");
		lblRegin.setBounds(38, 208, 46, 14);
		frame.getContentPane().add(lblRegin);
		
		textField_3 = new JTextField();
		textField_3.setBounds(84, 205, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(263, 72, 46, 14);
		frame.getContentPane().add(lblTipo);
		
		JLabel lblComentarios = new JLabel("Comentarios");
		lblComentarios.setBounds(219, 114, 90, 14);
		frame.getContentPane().add(lblComentarios);
		
		JButton btnVolverAtrs = new JButton("Volver Atr\u00E1s");
		btnVolverAtrs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//Funcion para borrar la ventana actual, y volver a la anterior, es decir, principal
				
                
				frame.setVisible(false);
				Principal p = new Principal();
				p.frame.setVisible(true);
			}
		});
		btnVolverAtrs.setForeground(Color.WHITE);
		btnVolverAtrs.setBackground(Color.RED);
		btnVolverAtrs.setBounds(24, 284, 124, 29);
		frame.getContentPane().add(btnVolverAtrs);
		
		textField_4 = new JTextField();
		textField_4.setBounds(294, 69, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(294, 111, 113, 121);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { //En esta función, cuando hagamos click en guardar,
														//si hay algún fallo, mostrará un mensaje de error
														
				
				String Nombre = textField.getText();
				String Numero = textField_1.getText();
				String Nivelevolucion = textField_1.getText();
				String Region = textField_1.getText();
				String Tipo = textField_1.getText();
				String Comentarios = textField_1.getText();
				
				if (Nombre.isEmpty() || Numero.isEmpty() || Nivelevolucion.isEmpty() || Region.isEmpty() || Tipo.isEmpty() || Comentarios.isEmpty()){
					
					JOptionPane.showMessageDialog(null, "Faltan Campos por rellenar", "EEH!",
							JOptionPane.ERROR_MESSAGE);
				}
				else{
					JOptionPane.showMessageDialog(frame, "Pokemon guardado con éxito", "Guardado",
							JOptionPane.INFORMATION_MESSAGE);
				}
			
			}
		});
		btnGuardar.setBounds(291, 284, 116, 26);
		frame.getContentPane().add(btnGuardar);
	}
}

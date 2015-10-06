package CapaDePresentación;

import java.awt.EventQueue;

import CapaDeEntidades.Ficha;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import CapaDeEntidades.Ficha.Color;
import CapaDeNegocio.CtrlAjedrez;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class AjedrezPartida {

	private JFrame frame;
	private JTextField txtPosicionInicial;
	private JTextField txtPosicionFinal;
	private JLabel lblColorJugador;

	private CtrlAjedrez ctrlAjedrez = new CtrlAjedrez();
	
	/**
	 * Launch the application.
	 */
	public static void invocador(/*String[] args*/) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjedrezPartida window = new AjedrezPartida();
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
	public AjedrezPartida() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 314, 341);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPosicinInicial = new JLabel("Posici\u00F3n Inicial");
		lblPosicinInicial.setBounds(29, 119, 95, 14);
		frame.getContentPane().add(lblPosicinInicial);
		
		txtPosicionInicial = new JTextField();
		txtPosicionInicial.setBounds(147, 116, 86, 20);
		frame.getContentPane().add(txtPosicionInicial);
		txtPosicionInicial.setColumns(10);
		
		JLabel lblTipoDeFicha = new JLabel("Tipo de Ficha ");
		lblTipoDeFicha.setBounds(29, 73, 86, 14);
		frame.getContentPane().add(lblTipoDeFicha);
		
		JComboBox cbTipoFicha = new JComboBox();
		cbTipoFicha.setModel(new DefaultComboBoxModel(new String[] {"Alfil", "Caballo", "Dama", "Pe\u00F3n", "Rey", "Torre"}));
		cbTipoFicha.setBounds(147, 70, 86, 20);
		frame.getContentPane().add(cbTipoFicha);
		
		JLabel lblPosicinFinal = new JLabel("Posici\u00F3n Final");
		lblPosicinFinal.setBounds(29, 174, 86, 14);
		frame.getContentPane().add(lblPosicinFinal);
		
		txtPosicionFinal = new JTextField();
		txtPosicionFinal.setBounds(147, 171, 86, 20);
		frame.getContentPane().add(txtPosicionFinal);
		txtPosicionFinal.setColumns(10);
		
		JButton btnJugar = new JButton("Jugar");
		btnJugar.setBounds(51, 247, 89, 23);
		frame.getContentPane().add(btnJugar);
		
		JLabel lblJugador = new JLabel("Jugador");
		lblJugador.setBounds(29, 27, 46, 14);
		frame.getContentPane().add(lblJugador);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(199, 247, 89, 23);
		frame.getContentPane().add(btnGuardar);
		
		lblColorJugador = new JLabel("");
		lblColorJugador.setBounds(85, 27, 46, 14);
		frame.getContentPane().add(lblColorJugador);
	}
	
	private void setJugador(String color){
	
		this.lblColorJugador.setText(color);
	
	}
	
	
}

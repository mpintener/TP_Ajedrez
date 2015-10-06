package CapaDePresentación;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import CapaDeNegocio.CtrlAjedrez;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Button;

public class AjedrezIniciarSesion {

	private JFrame frmIniciarSesin;
	private JTextField txtDNIJugador1;
	private JTextField txtDniJugador2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjedrezIniciarSesion window = new AjedrezIniciarSesion();
					window.frmIniciarSesin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AjedrezIniciarSesion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIniciarSesin = new JFrame();
		frmIniciarSesin.setTitle("Iniciar Sesi\u00F3n Jugadores");
		frmIniciarSesin.setBounds(100, 100, 424, 324);
		frmIniciarSesin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIniciarSesin.getContentPane().setLayout(null);
		
		JLabel lblDniJugador1 = new JLabel("DNI Jugador 1");
		lblDniJugador1.setBounds(45, 51, 76, 14);
		frmIniciarSesin.getContentPane().add(lblDniJugador1);
		
		txtDNIJugador1 = new JTextField();
		txtDNIJugador1.setBounds(149, 48, 86, 20);
		frmIniciarSesin.getContentPane().add(txtDNIJugador1);
		txtDNIJugador1.setColumns(10);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				BotonIngresar();
			}
		});
		btnIngresar.setBounds(284, 88, 89, 23);
		frmIniciarSesin.getContentPane().add(btnIngresar);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				BotonRegistrar();
			}
		});
		btnRegistrarse.setBounds(149, 197, 113, 23);
		frmIniciarSesin.getContentPane().add(btnRegistrarse);
		
		JLabel lblDniJugador2 = new JLabel("DNI Jugador 2");
		lblDniJugador2.setBounds(45, 126, 69, 14);
		frmIniciarSesin.getContentPane().add(lblDniJugador2);
		
		txtDniJugador2 = new JTextField();
		txtDniJugador2.setBounds(149, 123, 86, 20);
		frmIniciarSesin.getContentPane().add(txtDniJugador2);
		txtDniJugador2.setColumns(10);
	}
	protected void BotonIngresar(){
		AjedrezPartida.invocador();
		//Acá escribir todas las funciones del boton
		this.frmIniciarSesin.setVisible(false);
	}
	public void BotonRegistrar()
	{
		AjedrezRegistro.invocador();
		this.frmIniciarSesin.setVisible(false);
		
	}
	
}

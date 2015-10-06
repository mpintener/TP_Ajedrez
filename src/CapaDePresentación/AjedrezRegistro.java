package CapaDePresentación;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import CapaDeEntidades.Jugador;
import CapaDeNegocio.CtrlAjedrez;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AjedrezRegistro {

	private JFrame frmRegistrarJugadro;
	private JTextField txtDNI;
	private JTextField txtNombre;
	private JTextField txtApellido;

	private CtrlAjedrez ctrlAjedrez;
	
	/**
	 * Launch the application.
	 */
	public static void invocador(/*String[] args*/) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjedrezRegistro window = new AjedrezRegistro();
					window.frmRegistrarJugadro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AjedrezRegistro() {
	
		initialize();
		
		 ctrlAjedrez= new CtrlAjedrez();	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistrarJugadro = new JFrame();
		frmRegistrarJugadro.setTitle("Registrar Jugador");
		frmRegistrarJugadro.setBounds(100, 100, 335, 341);
		frmRegistrarJugadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistrarJugadro.getContentPane().setLayout(null);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(34, 54, 46, 14);
		frmRegistrarJugadro.getContentPane().add(lblDni);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(34, 108, 46, 14);
		frmRegistrarJugadro.getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(34, 169, 46, 14);
		frmRegistrarJugadro.getContentPane().add(lblApellido);
		
		txtDNI = new JTextField();
		txtDNI.setBounds(114, 51, 86, 20);
		frmRegistrarJugadro.getContentPane().add(txtDNI);
		txtDNI.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(114, 105, 86, 20);
		frmRegistrarJugadro.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(114, 166, 86, 20);
		frmRegistrarJugadro.getContentPane().add(txtApellido);
		txtApellido.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				GuardarJugador();
			}
		});
		btnAceptar.setBounds(59, 216, 89, 23);
		frmRegistrarJugadro.getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				
			}
		});
		btnCancelar.setBounds(200, 216, 89, 23);
		frmRegistrarJugadro.getContentPane().add(btnCancelar);
	}
	
	
	public void GuardarJugador()
	{
		Jugador j = new Jugador();
		
		j.setDni(this.txtDNI.getText());
		j.setApellido(this.txtApellido.getText());
		j.setNombre(this.txtNombre.getText());
		
		if (ctrlAjedrez.save(j))
		{
			JOptionPane.showMessageDialog(btnAceptar, "El jugador ha sido creado","Guardar Jugador",JOptionPane.INFORMATION_MESSAGE);
		}
		else 
		{
			JOptionPane.showMessageDialog(btnAceptar, "","",JOptionPane.INFORMATION_MESSAGE);

		}
		
		
	}
}

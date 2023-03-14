package vista;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class Formulario extends JFrame {

	private JPanel contentPane;
	public JTextField txtNum;
	public JTextField txtRes;
	public JButton btnBinario = new JButton("Binario");
	public JButton btnOctal = new JButton("Octal");
	public JButton btnHexa = new JButton("Hexadecimal");
	public JButton btnNuevo = new JButton("Nuevo");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
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
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMensajeNum = new JLabel("Ingrese un numero en sistema decimal:");
		lblMensajeNum.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMensajeNum.setBounds(39, 53, 240, 20);
		contentPane.add(lblMensajeNum);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblResultado.setBounds(108, 84, 149, 14);
		contentPane.add(lblResultado);
		
		txtNum = new JTextField();
		txtNum.setBounds(287, 54, 86, 20);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		txtRes = new JTextField();
		txtRes.setEnabled(false);
		txtRes.setText("0");
		txtRes.setBounds(287, 82, 86, 20);
		contentPane.add(txtRes);
		txtRes.setColumns(10);
		
		
		
		btnBinario.setBackground(UIManager.getColor("Button.light"));
		btnBinario.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBinario.setBounds(133, 156, 124, 23);
		contentPane.add(btnBinario);
		
	
		btnOctal.setEnabled(false);
		btnOctal.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnOctal.setBounds(338, 156, 89, 23);
		contentPane.add(btnOctal);
		
		
		btnHexa.setEnabled(false);
		btnHexa.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnHexa.setBounds(133, 201, 124, 23);
		contentPane.add(btnHexa);
		
		
		btnNuevo.setEnabled(false);
		btnNuevo.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNuevo.setBounds(338, 201, 89, 23);
		contentPane.add(btnNuevo);
		
		JLabel lblNewLabel_2 = new JLabel("Convertir un número  decimal a binario, octal y hexadecimal.");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(29, 11, 463, 31);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("TIPOS DE CONVERSIONES");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(29, 114, 463, 31);
		contentPane.add(lblNewLabel_2_1);
	}
}

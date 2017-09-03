package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaUsuario extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaUsuario frame = new TelaUsuario();
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
	public TelaUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 205, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAlugarCarro = new JButton("Alugar Carro");
		btnAlugarCarro.setBounds(29, 11, 138, 39);
		contentPane.add(btnAlugarCarro);
		
		JButton btnAlugarMoto = new JButton("Alugar Moto");
		btnAlugarMoto.setBounds(29, 61, 138, 39);
		contentPane.add(btnAlugarMoto);
		
		JButton btnAlugarVan = new JButton("Alugar Van");
		btnAlugarVan.setBounds(29, 111, 138, 39);
		contentPane.add(btnAlugarVan);
		
		JButton btnAlugarBicicleta = new JButton("Alugar Bicicleta");
		btnAlugarBicicleta.setBounds(29, 163, 138, 39);
		contentPane.add(btnAlugarBicicleta);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLogin tl = new TelaLogin();
				tl.setVisible(true);
				tl.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnSair.setBounds(29, 241, 138, 39);
		contentPane.add(btnSair);
	}

}

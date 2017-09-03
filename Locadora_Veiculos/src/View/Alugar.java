package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Alugar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Alugar frame = new Alugar();
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
	public Alugar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 285, 311);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 277, 272);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnMotos = new JButton("Motos");
		btnMotos.setBounds(73, 115, 114, 41);
		panel.add(btnMotos);
		
		JButton btnCarros = new JButton("Carros");
		btnCarros.setBounds(73, 11, 114, 41);
		panel.add(btnCarros);
		
		JButton btnVans = new JButton("Vans");
		btnVans.setBounds(73, 63, 114, 41);
		panel.add(btnVans);
		
		JButton btnBicicletas = new JButton("Bicicletas");
		btnBicicletas.setBounds(73, 167, 114, 41);
		panel.add(btnBicicletas);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaFornecedor tc = new TelaFornecedor();
				tc.setVisible(true);
				tc.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnSair.setBounds(73, 219, 114, 41);
		panel.add(btnSair);
	}
}

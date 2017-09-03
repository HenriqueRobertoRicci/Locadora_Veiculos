package View;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Controller.ControllerBicicleta;
import Model.Bicicleta;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroBicicleta extends JFrame {
	private JTextField preco;
	private JPanel contentPane;

	/**
	 * Create the panel.
	 */
	public TelaCadastroBicicleta() {
		// setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 536, 290);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Marca:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 23, 46, 14);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Cor:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 60, 46, 14);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Quantidade de Marchas:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 104, 148, 14);
		panel.add(lblNewLabel_2);

		JComboBox marchas = new JComboBox();
		marchas.setModel(new DefaultComboBoxModel(new String[] { "18", "21", "24", "27", "30", "33" }));
		marchas.setBounds(168, 103, 39, 20);
		panel.add(marchas);

		JLabel lblAro = new JLabel("Aro:");
		lblAro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAro.setBounds(231, 104, 46, 14);
		panel.add(lblAro);

		JComboBox aro = new JComboBox();
		aro.setModel(new DefaultComboBoxModel(new String[] {"12", "16", "20", "24", "26", "29"}));
		aro.setBounds(270, 103, 59, 20);
		panel.add(aro);

		JLabel lblTipoDeUso = new JLabel("Tipo de Uso:");
		lblTipoDeUso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoDeUso.setBounds(10, 139, 84, 19);
		panel.add(lblTipoDeUso);

		JComboBox uso = new JComboBox();
		uso.setModel(new DefaultComboBoxModel(new String[] { "Corrida", "Trilha", "Urbana" }));
		uso.setBounds(104, 140, 67, 20);
		panel.add(uso);

		JLabel lblTipoDeFreio = new JLabel("Tipo de Freio:");
		lblTipoDeFreio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoDeFreio.setBounds(232, 20, 84, 20);
		panel.add(lblTipoDeFreio);

		JComboBox freio = new JComboBox();
		freio.setModel(new DefaultComboBoxModel(new String[] { "A Disco", "Hidr\u00E1ulico" }));
		freio.setBounds(326, 22, 67, 20);
		panel.add(freio);

		JLabel lblPreo = new JLabel("Pre\u00E7o:");
		lblPreo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPreo.setBounds(231, 57, 46, 20);
		panel.add(lblPreo);

		preco = new JTextField();
		preco.setBounds(326, 59, 67, 20);
		panel.add(preco);
		preco.setColumns(10);

		JComboBox cor = new JComboBox();
		cor.setModel(new DefaultComboBoxModel(new String[] { "Preta", "Branca" }));
		cor.setBounds(66, 59, 67, 20);
		panel.add(cor);

		JComboBox marca = new JComboBox();
		marca.setModel(new DefaultComboBoxModel(new String[] { "Galo", "Shimano" }));
		marca.setBounds(66, 22, 67, 20);
		panel.add(marca);

		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaFornecedor tf = new TelaFornecedor();
				tf.setVisible(true);
				tf.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSair.setBounds(118, 207, 89, 23);
		panel.add(btnSair);

		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerBicicleta cb = new ControllerBicicleta();
				Bicicleta novaBicicleta = new Bicicleta(marca.getSelectedItem().toString(),
						cor.getSelectedItem().toString(), Integer.parseInt(marchas.getSelectedItem().toString()),
						Integer.parseInt(aro.getSelectedItem().toString()), uso.getSelectedItem().toString(),
						freio.getSelectedItem().toString(), Double.parseDouble(preco.getText()));
				cb.cadastrar(novaBicicleta);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(270, 207, 89, 23);
		panel.add(btnNewButton);

	}

}

package View;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Controller.ControllerCarro;
import Model.Carro;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroCarro extends JFrame {
	private JTextField modelo;
	private JTextField placa;
	private JTextField renavam;
	private JTextField preco;
	private JPanel contentPane;

	/**
	 * Create the panel.
	 */
	public TelaCadastroCarro() {
		// setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Modelo:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 23, 56, 14);
		panel.add(lblNewLabel);

		modelo = new JTextField();
		modelo.setBounds(63, 22, 115, 20);
		panel.add(modelo);
		modelo.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Marca:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 66, 46, 14);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Ano:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 112, 46, 14);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Placa:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 157, 46, 14);
		panel.add(lblNewLabel_3);

		placa = new JTextField();
		placa.setBounds(63, 156, 115, 20);
		panel.add(placa);
		placa.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Cor:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(10, 196, 46, 14);
		panel.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Categoria:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(10, 244, 70, 19);
		panel.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Quantidade de Portas:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(232, 22, 145, 17);
		panel.add(lblNewLabel_6);

		JComboBox portas = new JComboBox();
		portas.setModel(new DefaultComboBoxModel(new String[] { "2", "3", "4" }));
		portas.setToolTipText("");
		portas.setBounds(387, 22, 70, 20);
		panel.add(portas);

		JLabel lblTipoDeDireo = new JLabel("Tipo de Dire\u00E7\u00E3o:");
		lblTipoDeDireo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoDeDireo.setBounds(232, 64, 115, 19);
		panel.add(lblTipoDeDireo);

		JComboBox direcao = new JComboBox();
		direcao.setModel(
				new DefaultComboBoxModel(new String[] { "El\u00E9trico", "Hidr\u00E1ulico", "Mec\u00E2nico" }));
		direcao.setBounds(387, 65, 99, 20);
		panel.add(direcao);

		JLabel lblQuantidadeDePortas = new JLabel("Quantidade de Lugares:");
		lblQuantidadeDePortas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblQuantidadeDePortas.setBounds(232, 110, 159, 19);
		panel.add(lblQuantidadeDePortas);

		JComboBox lugares = new JComboBox();
		lugares.setModel(new DefaultComboBoxModel(new String[] { "2", "4", "5", "7", "8" }));
		lugares.setBounds(387, 111, 70, 20);
		panel.add(lugares);

		JLabel lblNewLabel_7 = new JLabel("Tipo de C\u00E2mbio:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(232, 154, 115, 20);
		panel.add(lblNewLabel_7);

		JComboBox cambio = new JComboBox();
		cambio.setModel(new DefaultComboBoxModel(new String[] { "Autom\u00E1tico", "Manual" }));
		cambio.setBounds(387, 156, 99, 20);
		panel.add(cambio);

		JLabel lblNewLabel_8 = new JLabel("Renavam:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(232, 196, 70, 14);
		panel.add(lblNewLabel_8);

		renavam = new JTextField();
		renavam.setBounds(376, 195, 133, 20);
		panel.add(renavam);
		renavam.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel("Pre\u00E7o:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(232, 243, 46, 20);
		panel.add(lblNewLabel_9);

		preco = new JTextField();
		preco.setBounds(376, 244, 133, 20);
		panel.add(preco);
		preco.setColumns(10);

		JComboBox ano = new JComboBox();
		ano.setModel(new DefaultComboBoxModel(new String[] { "2015", "2016", "2017" }));
		ano.setBounds(63, 112, 70, 20);
		panel.add(ano);

		JComboBox cor = new JComboBox();
		cor.setModel(new DefaultComboBoxModel(new String[] { "Preto", "Prata" }));
		cor.setBounds(63, 195, 70, 20);
		panel.add(cor);

		JComboBox categoria = new JComboBox();
		categoria.setModel(new DefaultComboBoxModel(new String[] { "SUV", "Sedan", "Hatch" }));
		categoria.setBounds(86, 245, 70, 20);
		panel.add(categoria);

		JComboBox marca = new JComboBox();
		marca.setModel(new DefaultComboBoxModel(new String[] { "Honda" }));
		marca.setBounds(63, 65, 70, 20);
		panel.add(marca);

		JButton btnNewButton = new JButton("Sair");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaFornecedor tf = new TelaFornecedor();
				tf.setVisible(true);
				tf.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(119, 333, 89, 23);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Enviar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerCarro cc = new ControllerCarro();
				Carro novoCarro = new Carro(modelo.getText(), marca.getSelectedItem().toString(),
						Integer.parseInt(ano.getSelectedItem().toString()), placa.getText(),
						cor.getSelectedItem().toString(), categoria.getSelectedItem().toString(),
						Integer.parseInt(portas.getSelectedItem().toString()), direcao.getSelectedItem().toString(),
						Integer.parseInt(lugares.getSelectedItem().toString()), cambio.getSelectedItem().toString(),
						Integer.parseInt(renavam.getText()), Double.parseDouble(preco.getText()));
				cc.cadastrar(novoCarro);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(288, 333, 89, 23);
		panel.add(btnNewButton_1);

	}
}

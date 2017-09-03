package View;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;

import Controller.ControllerMoto;
import Model.Moto;

import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroMoto extends JFrame {
	private JTextField modelo;
	private JTextField placa;
	private JTextField renavam;
	private JTextField preco;
	private JPanel contentPane;

	/**
	 * Create the panel.
	 */
	public TelaCadastroMoto() {
		// setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Marca:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 28, 46, 14);
		panel.add(lblNewLabel);

		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblModelo.setBounds(10, 79, 57, 14);
		panel.add(lblModelo);

		modelo = new JTextField();
		modelo.setBounds(66, 78, 104, 20);
		panel.add(modelo);
		modelo.setColumns(10);

		JLabel lblAno = new JLabel("Ano:");
		lblAno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAno.setBounds(10, 125, 46, 14);
		panel.add(lblAno);

		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPlaca.setBounds(10, 180, 46, 14);
		panel.add(lblPlaca);

		placa = new JTextField();
		placa.setBounds(66, 179, 104, 20);
		panel.add(placa);
		placa.setColumns(10);

		JLabel lblCor = new JLabel("Cor:");
		lblCor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCor.setBounds(212, 180, 46, 14);
		panel.add(lblCor);

		JLabel lblCategoria = new JLabel("Categoria:");
		lblCategoria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCategoria.setBounds(10, 231, 70, 20);
		panel.add(lblCategoria);

		JLabel lblNewLabel_1 = new JLabel("Tipo de Freio:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(212, 27, 95, 17);
		panel.add(lblNewLabel_1);

		JComboBox freio = new JComboBox();
		freio.setModel(new DefaultComboBoxModel(new String[] { "A Disco", "Tambor" }));
		freio.setBounds(304, 27, 61, 20);
		panel.add(freio);

		JLabel lblRenavam = new JLabel("Renavam:");
		lblRenavam.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRenavam.setBounds(212, 79, 70, 14);
		panel.add(lblRenavam);

		renavam = new JTextField();
		renavam.setBounds(292, 78, 142, 20);
		panel.add(renavam);
		renavam.setColumns(10);

		JLabel lblPreo = new JLabel("Pre\u00E7o:");
		lblPreo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPreo.setBounds(212, 124, 46, 17);
		panel.add(lblPreo);

		preco = new JTextField();
		preco.setBounds(292, 124, 142, 20);
		panel.add(preco);
		preco.setColumns(10);

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
		btnSair.setBounds(97, 313, 89, 23);
		panel.add(btnSair);

		JComboBox ano = new JComboBox();
		ano.setModel(new DefaultComboBoxModel(new String[] {"2015", "2016", "2017"}));
		ano.setBounds(66, 124, 75, 20);
		panel.add(ano);

		JComboBox cor = new JComboBox();
		cor.setModel(new DefaultComboBoxModel(new String[] {"Preta"}));
		cor.setBounds(292, 179, 57, 20);
		panel.add(cor);

		JComboBox categoria = new JComboBox();
		categoria.setModel(new DefaultComboBoxModel(new String[] {"Cidade"}));
		categoria.setBounds(90, 233, 61, 20);
		panel.add(categoria);

		JComboBox marca = new JComboBox();
		marca.setModel(new DefaultComboBoxModel(new String[] {"Honda"}));
		marca.setBounds(66, 27, 75, 20);
		panel.add(marca);

		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerMoto cm = new ControllerMoto();
				Moto novaMoto = new Moto(marca.getSelectedItem().toString(), modelo.getText(),
						Integer.parseInt(ano.getSelectedItem().toString()), placa.getText(),
						cor.getSelectedItem().toString(), categoria.getSelectedItem().toString(),
						freio.getSelectedItem().toString(), Integer.parseInt(renavam.getText()),
						Double.parseDouble(preco.getText()));
				cm.cadastrar(novaMoto);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(231, 313, 89, 23);
		panel.add(btnNewButton);

	}

}

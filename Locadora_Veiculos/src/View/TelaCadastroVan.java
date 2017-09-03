package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControllerVan;
import Model.Van;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroVan extends JFrame {

	private JPanel contentPane;
	private JTextField modelo;
	private JTextField placa;
	private JTextField renavam;
	private JTextField preco;
	JComboBox cor = new JComboBox();
	JComboBox direcao = new JComboBox();
	JComboBox lugares = new JComboBox();
	JComboBox ano = new JComboBox();
	JComboBox marca = new JComboBox();
	JComboBox cambio = new JComboBox();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroVan frame = new TelaCadastroVan();
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
	public TelaCadastroVan() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 316);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 424, 272);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Modelo:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 64, 14);
		panel.add(lblNewLabel);

		modelo = new JTextField();
		modelo.setBounds(62, 10, 117, 20);
		panel.add(modelo);
		modelo.setColumns(10);

		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMarca.setBounds(10, 50, 46, 14);
		panel.add(lblMarca);

		JLabel lblAno = new JLabel("Ano:");
		lblAno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAno.setBounds(10, 95, 46, 14);
		panel.add(lblAno);

		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPlaca.setBounds(10, 139, 46, 14);
		panel.add(lblPlaca);

		placa = new JTextField();
		placa.setBounds(62, 138, 117, 20);
		panel.add(placa);
		placa.setColumns(10);

		JLabel lblCor = new JLabel("Cor:");
		lblCor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCor.setBounds(10, 183, 46, 14);
		panel.add(lblCor);

		JLabel lblTipoDeDireo = new JLabel("Tipo de dire\u00E7\u00E3o:");
		lblTipoDeDireo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoDeDireo.setBounds(211, 13, 98, 17);
		panel.add(lblTipoDeDireo);

		direcao.setModel(
				new DefaultComboBoxModel(new String[] { "El\u00E9trico", "Hidr\u00E1ulico", "Mec\u00E2nico" }));
		direcao.setBounds(319, 10, 95, 20);
		panel.add(direcao);

		JLabel lblQuantidadeDeLugares = new JLabel("Quantidade de Lugares:");
		lblQuantidadeDeLugares.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblQuantidadeDeLugares.setBounds(211, 52, 151, 17);
		panel.add(lblQuantidadeDeLugares);

		lugares.setModel(new DefaultComboBoxModel(new String[] { "15", "17" }));
		lugares.setBounds(372, 49, 42, 20);
		panel.add(lugares);

		JLabel lblTipoDeCmbio = new JLabel("Tipo de c\u00E2mbio:");
		lblTipoDeCmbio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoDeCmbio.setBounds(211, 97, 98, 17);
		panel.add(lblTipoDeCmbio);

		cambio.setModel(new DefaultComboBoxModel(new String[] { "Autom\u00E1tico", "Manual" }));
		cambio.setBounds(319, 94, 95, 20);
		panel.add(cambio);

		JLabel lblRenavam = new JLabel("Renavam:");
		lblRenavam.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRenavam.setBounds(211, 141, 98, 14);
		panel.add(lblRenavam);

		renavam = new JTextField();
		renavam.setBounds(281, 138, 119, 20);
		panel.add(renavam);
		renavam.setColumns(10);

		JLabel lblPreo = new JLabel("Pre\u00E7o:");
		lblPreo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPreo.setBounds(211, 185, 46, 17);
		panel.add(lblPreo);

		preco = new JTextField();
		preco.setBounds(281, 182, 119, 20);
		panel.add(preco);
		preco.setColumns(10);

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
		btnNewButton.setBounds(98, 238, 89, 23);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Enviar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerVan cv = new ControllerVan();
				Van novaVan = new Van(modelo.getText(), marca.getSelectedItem().toString(),
						Integer.parseInt(ano.getSelectedItem().toString()), placa.getText(),
						cor.getSelectedItem().toString(), direcao.getSelectedItem().toString(),
						Integer.parseInt(lugares.getSelectedItem().toString()), cambio.getSelectedItem().toString(),
						Integer.parseInt(renavam.getText()), Double.parseDouble(preco.getText()));
				cv.cadastrar(novaVan);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(241, 238, 89, 23);
		panel.add(btnNewButton_1);

		cor.setModel(new DefaultComboBoxModel(new String[] { "Preto", "Branco", "Prata" }));
		cor.setBounds(62, 182, 64, 20);
		panel.add(cor);

		ano.setModel(new DefaultComboBoxModel(
				new String[] { "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007",
						"2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017" }));
		ano.setBounds(62, 94, 64, 20);
		panel.add(ano);

		marca.setModel(new DefaultComboBoxModel(new String[] { "Ford", "Chevrolet", "Honda", "Renault" }));
		marca.setBounds(62, 49, 64, 20);
		panel.add(marca);
	}
}

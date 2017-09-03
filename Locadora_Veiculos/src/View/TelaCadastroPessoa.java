package View;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Model.BuscaCEP;
import Model.Pessoa;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Date;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;

import Controller.ControllerFornecedor;
import Controller.ControllerUsuario;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;

public class TelaCadastroPessoa extends JFrame {
	private JTextField email;
	private JTextField nome;
	private JTextField cpf;
	private JTextField telefone;
	private JTextField rua;
	private JTextField bairro;
	private JTextField cidade;
	private JTextField numero;
	private JTextField cep;
	private JTextField numerocnh;
	private JTextField login;
	private JPanel contentPane;
	private JPasswordField senha;
	JComboBox tipo = new JComboBox();
	JComboBox estado = new JComboBox();
	JComboBox categoriacnh = new JComboBox();
	private String escolha;
	private JDateChooser dateChooser;

	/**
	 * Create the panel.
	 */
	public TelaCadastroPessoa() {
		// setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 551, 674);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		bairro = new JTextField();
		bairro.setBounds(77, 290, 176, 20);
		panel.add(bairro);
		bairro.setColumns(10);

		JDateChooser dateChooser = new JDateChooser();

		JButton btnNewButton = new JButton("Sair");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaLogin tl = new TelaLogin();
				tl.setVisible(true);
				tl.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton.setBounds(117, 593, 89, 23);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Enviar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tipo.getSelectedItem() == "Usuário") {
					ControllerUsuario controllerUsuario = new ControllerUsuario();
					java.sql.Date dataSQL = new java.sql.Date(dateChooser.getDate().getTime());
					Pessoa pessoa = new Pessoa(nome.getText(), Integer.parseInt(cpf.getText()), escolha, dataSQL,
							email.getText(), Integer.parseInt(telefone.getText()), Integer.parseInt(cep.getText()),
							rua.getText(), Integer.parseInt(numero.getText()), bairro.getText(), cidade.getText(),
							estado.getSelectedItem().toString(), categoriacnh.getSelectedItem().toString(),
							Integer.parseInt(numerocnh.getText()), login.getText(), senha.getText(),
							tipo.getSelectedItem().toString());
					controllerUsuario.cadastrar(pessoa);
				}

				if (tipo.getSelectedItem() == "Fornecedor" || tipo.getSelectedItem() == "Ambos") {
					ControllerFornecedor cf = new ControllerFornecedor();
					java.sql.Date dataSQL = new java.sql.Date(dateChooser.getDate().getTime());
					Pessoa pessoa = new Pessoa(nome.getText(), Integer.parseInt(cpf.getText()), escolha, dataSQL,
							email.getText(), Integer.parseInt(telefone.getText()), Integer.parseInt(cep.getText()),
							rua.getText(), Integer.parseInt(numero.getText()), bairro.getText(), cidade.getText(),
							estado.getSelectedItem().toString(), categoriacnh.getSelectedItem().toString(),
							Integer.parseInt(numerocnh.getText()), login.getText(), senha.getText(),
							tipo.getSelectedItem().toString());
					cf.cadastrar(pessoa);
				}
			}
		});
		btnNewButton_1.setBounds(272, 593, 89, 23);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(btnNewButton_1);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(0, 0, 525, 156);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 54, 41, 17);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));

		email = new JTextField();
		email.setBounds(61, 120, 177, 20);
		panel_1.add(email);
		email.setColumns(10);

		JLabel lblInformaesPessoais = new JLabel("Informa\u00E7\u00F5es Pessoais");
		lblInformaesPessoais.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblInformaesPessoais.setBounds(10, 11, 197, 20);
		panel_1.add(lblInformaesPessoais);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(10, 121, 46, 14);
		panel_1.add(lblEmail);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));

		nome = new JTextField();
		nome.setBounds(61, 54, 177, 20);
		panel_1.add(nome);
		nome.setColumns(10);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(258, 55, 46, 14);
		panel_1.add(lblCpf);
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 14));

		cpf = new JTextField();
		cpf.setBounds(324, 54, 138, 20);
		panel_1.add(cpf);
		cpf.setColumns(10);

		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(10, 84, 46, 14);
		panel_1.add(lblSexo);
		lblSexo.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBounds(61, 81, 103, 17);
		panel_1.add(rdbtnMasculino);

		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setBounds(166, 78, 86, 20);
		panel_1.add(rdbtnFeminino);

		JLabel lblCategoriaDaCnh = new JLabel("Data de Nascimento:");
		lblCategoriaDaCnh.setBounds(258, 87, 138, 19);
		panel_1.add(lblCategoriaDaCnh);
		lblCategoriaDaCnh.setFont(new Font("Tahoma", Font.PLAIN, 14));

		dateChooser.setBounds(393, 85, 87, 20);
		panel_1.add(dateChooser);

		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(258, 121, 56, 14);
		panel_1.add(lblTelefone);
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 14));

		telefone = new JTextField();
		telefone.setBounds(324, 120, 138, 20);
		panel_1.add(telefone);
		telefone.setColumns(10);

		rdbtnMasculino.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (rdbtnMasculino.isSelected()) {
					rdbtnFeminino.setSelected(false);
					escolha = "Masculino";
				}
			}
		});

		rdbtnFeminino.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (rdbtnFeminino.isSelected()) {
					rdbtnMasculino.setSelected(false);
					escolha = "Feminino";
				}
			}
		});

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(0, 167, 525, 192);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Endere\u00E7o");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 11, 76, 14);
		panel_2.add(lblNewLabel_1);

		JLabel lblEstado = new JLabel("CEP:");
		lblEstado.setBounds(10, 55, 56, 14);
		panel_2.add(lblEstado);
		lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 14));

		cep = new JTextField();
		cep.setBounds(76, 54, 116, 20);
		panel_2.add(cep);
		cep.setColumns(10);

		JLabel lblRua = new JLabel("Rua:");
		lblRua.setBounds(10, 92, 46, 14);
		panel_2.add(lblRua);
		lblRua.setFont(new Font("Tahoma", Font.PLAIN, 14));

		rua = new JTextField();
		rua.setBounds(76, 91, 177, 20);
		panel_2.add(rua);
		rua.setColumns(10);

		JButton btnBuscarCep = new JButton("Buscar CEP");
		btnBuscarCep.setBounds(221, 53, 110, 23);
		panel_2.add(btnBuscarCep);

		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(10, 127, 46, 14);
		panel_2.add(lblBairro);
		lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JLabel lblNmero = new JLabel("Cidade:");
		lblNmero.setBounds(275, 127, 56, 14);
		panel_2.add(lblNmero);
		lblNmero.setFont(new Font("Tahoma", Font.PLAIN, 14));

		cidade = new JTextField();
		cidade.setBounds(341, 126, 177, 20);
		panel_2.add(cidade);
		cidade.setColumns(10);

		JLabel lblCep = new JLabel("N\u00FAmero:");
		lblCep.setBounds(275, 92, 56, 14);
		panel_2.add(lblCep);
		lblCep.setFont(new Font("Tahoma", Font.PLAIN, 14));

		numero = new JTextField();
		numero.setBounds(341, 91, 56, 20);
		panel_2.add(numero);
		numero.setColumns(10);

		JLabel lblDataDeNascimento = new JLabel("Estado:");
		lblDataDeNascimento.setBounds(10, 162, 56, 14);
		panel_2.add(lblDataDeNascimento);
		lblDataDeNascimento.setFont(new Font("Tahoma", Font.PLAIN, 14));

		estado.setModel(new DefaultComboBoxModel(new String[] { "SP", "RJ" }));
		estado.setBounds(76, 161, 46, 20);
		panel_2.add(estado);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(0, 370, 525, 76);
		panel.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblCnh_1 = new JLabel("CNH");
		lblCnh_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCnh_1.setBounds(10, 11, 46, 14);
		panel_3.add(lblCnh_1);

		JLabel lblCnh = new JLabel("Categoria da CNH:");
		lblCnh.setBounds(10, 39, 130, 20);
		panel_3.add(lblCnh);
		lblCnh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		categoriacnh.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C", "D", "E", "A/B"}));

		categoriacnh.setBounds(131, 41, 39, 20);
		panel_3.add(categoriacnh);

		numerocnh = new JTextField();
		numerocnh.setBounds(300, 41, 145, 20);
		panel_3.add(numerocnh);
		numerocnh.setColumns(10);

		JLabel lblLogin = new JLabel("N\u00FAmero CNH:");
		lblLogin.setBounds(193, 42, 97, 14);
		panel_3.add(lblLogin);
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBounds(0, 457, 525, 125);
		panel.add(panel_4);
		panel_4.setLayout(null);

		JLabel lblLogin_1 = new JLabel("Login:");
		lblLogin_1.setBounds(10, 40, 46, 20);
		panel_4.add(lblLogin_1);
		lblLogin_1.setFont(new Font("Tahoma", Font.PLAIN, 14));

		login = new JTextField();
		login.setBounds(54, 42, 133, 20);
		panel_4.add(login);
		login.setColumns(10);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(197, 43, 46, 14);
		panel_4.add(lblSenha);
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JLabel lblCrednciais = new JLabel("Cred\u00EAnciais");
		lblCrednciais.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCrednciais.setBounds(10, 15, 88, 14);
		panel_4.add(lblCrednciais);

		senha = new JPasswordField();
		senha.setBounds(253, 42, 125, 20);
		panel_4.add(senha);

		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipo.setBounds(10, 87, 31, 27);
		panel_4.add(lblTipo);

		tipo.setModel(new DefaultComboBoxModel(new String[] { "Usu\u00E1rio", "Fornecedor", "Ambos" }));
		tipo.setToolTipText("Usu\u00E1rio");
		tipo.setBounds(54, 92, 82, 20);
		panel_4.add(tipo);
		btnBuscarCep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BuscaCEP bcep = new BuscaCEP();
				String resultado = null;
				try {
					resultado = bcep.getEndereco(cep.getText());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Endereço: " + resultado);
			}
		});

	}
}

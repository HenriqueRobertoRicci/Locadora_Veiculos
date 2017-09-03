package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import Controller.ControllerFornecedor;
import Controller.ControllerUsuario;
import javax.swing.JPasswordField;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField tlogin;
	private String escolha;
	private JPasswordField tsenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 314, 309);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(81, 27, 38, 26);
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblLogin);

		tlogin = new JTextField();
		tlogin.setBounds(129, 32, 86, 20);
		panel.add(tlogin);
		tlogin.setColumns(10);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(81, 77, 45, 26);
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblSenha);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (escolha.equals("Usuário")) {
					ControllerUsuario controllerusuario = new ControllerUsuario();
					if (controllerusuario.logarUsuario(tlogin.getText(), tsenha.getText())) {
						controllerusuario.mostrarTelaUsuario();
						dispose();
					} else
						JOptionPane.showMessageDialog(null, "Usuário não Cadastrado!");
				} else {
					ControllerFornecedor cf = new ControllerFornecedor();
					if (cf.logarUsuario(tlogin.getText(), tsenha.getText())) {
						cf.mostrarTelaFornecedor();
						dispose();
					} else
						JOptionPane.showMessageDialog(null, "Usuário não Cadastrado!");
				}
			}
		});
		btnEntrar.setBounds(102, 165, 113, 23);
		panel.add(btnEntrar);

		JButton btnCadastrarse = new JButton("Cadastrar-se");
		btnCadastrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroPessoa cp = new TelaCadastroPessoa();
				cp.setVisible(true);
				cp.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnCadastrarse.setBounds(102, 199, 113, 23);
		panel.add(btnCadastrarse);

		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(102, 233, 113, 23);
		panel.add(btnSair);

		JRadioButton rdbtnUsurio = new JRadioButton("Usu\u00E1rio");
		rdbtnUsurio.setBounds(76, 124, 79, 23);
		panel.add(rdbtnUsurio);

		JRadioButton rdbtnFornecedor = new JRadioButton("Fornecedor");
		rdbtnFornecedor.setBounds(157, 124, 108, 23);
		panel.add(rdbtnFornecedor);

		tsenha = new JPasswordField();
		tsenha.setBounds(129, 82, 86, 20);
		panel.add(tsenha);

		rdbtnUsurio.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (rdbtnUsurio.isSelected()) {
					rdbtnFornecedor.setSelected(false);
					escolha = "Usuário";
				}
			}
		});

		rdbtnFornecedor.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (rdbtnFornecedor.isSelected()) {
					rdbtnUsurio.setSelected(false);
					escolha = "Fornecedor";
				}
			}
		});
	}
}

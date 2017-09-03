package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class TelaFornecedor extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFornecedor frame = new TelaFornecedor();
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
	public TelaFornecedor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 354, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnAlugar = new JButton("Alugar");
		btnAlugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Alugar alugar = new Alugar();
				alugar.setVisible(true);
				alugar.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnAlugar.setBounds(86, 142, 158, 41);
		panel.add(btnAlugar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(0, 0, 328, 131);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnCadastrarBicicleta = new JButton("Cadastrar Bicicleta");
		btnCadastrarBicicleta.setBounds(0, 79, 158, 41);
		panel_1.add(btnCadastrarBicicleta);
		
		JButton btnCadastrarVan = new JButton("Cadastrar Van");
		btnCadastrarVan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroVan tcv = new TelaCadastroVan();
				tcv.setVisible(true);
				tcv.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnCadastrarVan.setBounds(168, 79, 158, 41);
		panel_1.add(btnCadastrarVan);
		
		JButton btnCadastrarMoto = new JButton("Cadastrar Moto");
		btnCadastrarMoto.setBounds(0, 27, 158, 41);
		panel_1.add(btnCadastrarMoto);
		
		JButton btnCadastrarCarro = new JButton("Cadastrar Carro");
		btnCadastrarCarro.setBounds(168, 27, 158, 41);
		panel_1.add(btnCadastrarCarro);
		
		JLabel lblCadastro = new JLabel("Cadastro");
		lblCadastro.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCadastro.setBounds(0, 0, 85, 16);
		panel_1.add(lblCadastro);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaLogin tl = new TelaLogin();
				tl.setVisible(true);
				tl.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnSair.setBounds(86, 194, 158, 41);
		panel.add(btnSair);
		btnCadastrarCarro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroCarro tcc = new TelaCadastroCarro();
				tcc.setVisible(true);
				tcc.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnCadastrarMoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroMoto tcm = new TelaCadastroMoto();
				tcm.setVisible(true);
				tcm.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnCadastrarBicicleta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroBicicleta tcb = new TelaCadastroBicicleta();
				tcb.setVisible(true);
				tcb.setLocationRelativeTo(null);
				dispose();
			}
		});
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}

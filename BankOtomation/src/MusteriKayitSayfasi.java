import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Musteri;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class MusteriKayitSayfasi extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textAd;
	private JTextField textSoyad;
	private JTextField textMail;
	private JTextField textTelNo;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MusteriKayitSayfasi frame = new MusteriKayitSayfasi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creating the frame.
	 */
	public MusteriKayitSayfasi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 616);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 191, 216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textAd = new JTextField();
		textAd.setFont(new Font("Arial", Font.PLAIN, 13));
		textAd.setBounds(198, 81, 156, 33);
		contentPane.add(textAd);
		textAd.setColumns(10);
		
		textSoyad = new JTextField();
		textSoyad.setFont(new Font("Arial", Font.PLAIN, 13));
		textSoyad.setBounds(198, 141, 156, 33);
		contentPane.add(textSoyad);
		textSoyad.setColumns(10);
		
		textMail = new JTextField();
		textMail.setFont(new Font("Arial", Font.PLAIN, 13));
		textMail.setBounds(198, 204, 156, 33);
		contentPane.add(textMail);
		textMail.setColumns(10);
		
		JLabel lblAd = new JLabel("Ad\u0131:");
		lblAd.setHorizontalAlignment(SwingConstants.LEFT);
		lblAd.setForeground(UIManager.getColor("CheckBox.darkShadow"));
		lblAd.setFont(new Font("Arial", Font.BOLD, 16));
		lblAd.setBounds(85, 81, 86, 34);
		contentPane.add(lblAd);
		
		JLabel lblSoyad = new JLabel("Soyad\u0131:");
		lblSoyad.setHorizontalAlignment(SwingConstants.LEFT);
		lblSoyad.setForeground(UIManager.getColor("CheckBox.darkShadow"));
		lblSoyad.setFont(new Font("Arial", Font.BOLD, 16));
		lblSoyad.setBounds(85, 141, 86, 34);
		contentPane.add(lblSoyad);
		
		JLabel lblMailAdres = new JLabel("Mail Adresi:");
		lblMailAdres.setHorizontalAlignment(SwingConstants.LEFT);
		lblMailAdres.setForeground(UIManager.getColor("CheckBox.darkShadow"));
		lblMailAdres.setFont(new Font("Arial", Font.BOLD, 16));
		lblMailAdres.setBounds(85, 204, 103, 34);
		contentPane.add(lblMailAdres);
		
		JLabel lblTelNo = new JLabel("Tel No:");
		lblTelNo.setHorizontalAlignment(SwingConstants.LEFT);
		lblTelNo.setForeground(UIManager.getColor("CheckBox.darkShadow"));
		lblTelNo.setFont(new Font("Arial", Font.BOLD, 16));
		lblTelNo.setBounds(85, 264, 86, 34);
		contentPane.add(lblTelNo);
		
		textTelNo = new JTextField();
		textTelNo.setFont(new Font("Arial", Font.PLAIN, 13));
		textTelNo.setBounds(198, 264, 156, 33);
		contentPane.add(textTelNo);
		textTelNo.setColumns(10);
		
		JButton btnMusteriEkle = new JButton("Musteri Ekle");
		btnMusteriEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lblAd.getText().length() == 0 || lblSoyad.getText().length() == 0 || lblMailAdres.getText().length() == 0 || lblTelNo.getText().length() == 0) {
					JOptionPane.showMessageDialog(null, "Lütfen tüm alanları doldurunuz!");
				} else {
					Random randomNumber = new Random();
					
					Musteri müsteri = new Musteri();
					
					müsteri.setAd(lblAd.getText());
					müsteri.setSoyad(lblSoyad.getText());
					müsteri.setEmail(lblMailAdres.getText());
					müsteri.setTelefonNumarasi(Integer.parseInt(lblTelNo.getText()));
					müsteri.setMusteriNumarasi(100000 + randomNumber.nextInt(900000));
					
					JOptionPane.showMessageDialog(null, "Müsteri basari ile kaydedilmistir!");
					
				}
			}
		});
		
		btnMusteriEkle.setForeground(new Color(255, 255, 240));
		btnMusteriEkle.setFont(new Font("Arial", Font.BOLD, 13));
		btnMusteriEkle.setBackground(new Color(188, 143, 143));
		btnMusteriEkle.setBounds(198, 330, 156, 34);
		contentPane.add(btnMusteriEkle);
		
		JButton btnHesapBilgileri = new JButton("Hesap Bilgileri");
		btnHesapBilgileri.setFont(new Font("Arial", Font.PLAIN, 13));
		btnHesapBilgileri.setForeground(SystemColor.info);
		btnHesapBilgileri.setBackground(new Color(188, 143, 143));
		btnHesapBilgileri.setBounds(198, 396, 156, 34);
		contentPane.add(btnHesapBilgileri);
		
		JButton btnMusteriBilgileri = new JButton("Musteri Bilgileri");
		btnMusteriBilgileri.setFont(new Font("Arial", Font.PLAIN, 13));
		btnMusteriBilgileri.setForeground(new Color(255, 255, 240));
		btnMusteriBilgileri.setActionCommand("");
		btnMusteriBilgileri.setBackground(new Color(188, 143, 143));
		btnMusteriBilgileri.setBounds(10, 396, 161, 34);
		contentPane.add(btnMusteriBilgileri);
		
		JButton btnKrediBilgileri = new JButton("Kredi Bilgileri");
		btnKrediBilgileri.setFont(new Font("Arial", Font.PLAIN, 13));
		btnKrediBilgileri.setForeground(new Color(255, 255, 240));
		btnKrediBilgileri.setBackground(new Color(188, 143, 143));
		btnKrediBilgileri.setBounds(380, 396, 156, 34);
		contentPane.add(btnKrediBilgileri);
		
		JLabel lblOgrenciAd = new JLabel("Ad Soyad");
		lblOgrenciAd.setForeground(SystemColor.controlDkShadow);
		lblOgrenciAd.setFont(new Font("Arial", Font.BOLD, 16));
		lblOgrenciAd.setBackground(SystemColor.controlShadow);
		lblOgrenciAd.setBounds(345, 500, 86, 14);
		contentPane.add(lblOgrenciAd);
		
		JLabel lblOgrenciNo = new JLabel("Ogrenci No");
		lblOgrenciNo.setForeground(SystemColor.controlDkShadow);
		lblOgrenciNo.setFont(new Font("Arial", Font.BOLD, 16));
		lblOgrenciNo.setBackground(SystemColor.controlShadow);
		lblOgrenciNo.setBounds(345, 525, 97, 26);
		contentPane.add(lblOgrenciNo);
	}
}

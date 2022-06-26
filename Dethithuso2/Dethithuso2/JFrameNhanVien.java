package Dethithuso2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class JFrameNhanVien extends JFrame {

	private JPanel contentPane;
	private JTextField txtMaNV;
	private JTextField txtTenNV;
	private JTextField txtCV;
	private NhanVien nhanVien;
	private ArrayList<NhanVien> nhanViens = new ArrayList<NhanVien>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameNhanVien frame = new JFrameNhanVien();
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
	public JFrameNhanVien() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblMaNV = new JLabel("M\u00E3 nh\u00E2n vi\u00EAn:");
		lblMaNV.setBounds(5, 5, 99, 19);
		contentPane.add(lblMaNV);

		txtMaNV = new JTextField();
		txtMaNV.setBounds(114, 4, 348, 20);
		contentPane.add(txtMaNV);
		txtMaNV.setColumns(10);

		JLabel lblTenNV = new JLabel("T\u00EAn nh\u00E2n vi\u00EAn:");
		lblTenNV.setBounds(5, 48, 99, 14);
		contentPane.add(lblTenNV);

		txtTenNV = new JTextField();
		txtTenNV.setBounds(114, 45, 348, 20);
		contentPane.add(txtTenNV);
		txtTenNV.setColumns(10);

		JLabel lblCV = new JLabel("Ch\u1EE9c v\u1EE5:");
		lblCV.setBounds(5, 83, 99, 14);
		contentPane.add(lblCV);

		txtCV = new JTextField();
		txtCV.setBounds(114, 80, 348, 20);
		contentPane.add(txtCV);
		txtCV.setColumns(10);

		JLabel lblNewLabel = new JLabel("Gi\u1EDBi t\u00EDnh");
		lblNewLabel.setBounds(5, 126, 52, 29);
		contentPane.add(lblNewLabel);

		JRadioButton rdbtnNam = new JRadioButton("Nam");
		rdbtnNam.setBounds(90, 129, 109, 23);
		contentPane.add(rdbtnNam);

		JRadioButton rdbtnNu = new JRadioButton("N\u1EEF");
		rdbtnNu.setBounds(272, 129, 109, 23);
		contentPane.add(rdbtnNu);

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnNu);
		buttonGroup.add(rdbtnNam);

		JButton btnExit = new JButton("Tho\u00E1t");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int kq = JOptionPane.showConfirmDialog(btnExit, "Bạn có muốn thoát không", "Thông báo",
						JOptionPane.YES_NO_OPTION);
				if (kq == JOptionPane.YES_OPTION) {
					System.exit(kq);
				}
			}
		});
		btnExit.setBounds(362, 327, 90, 23);
		contentPane.add(btnExit);

		JButton btnThem = new JButton("Th\u00EAm Nh\u00E2n Vi\u00EAn");
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtCV.getText().trim() == "" || txtMaNV.getText().trim() == "" || txtTenNV.getText().trim() == ""
						|| !(rdbtnNam.isSelected() || rdbtnNu.isSelected())) {
					JOptionPane.showMessageDialog(btnThem, "Yêu cầu nhập đầy đủ thông tin", "Thông báo",
							JOptionPane.WARNING_MESSAGE);
				} else {
					nhanVien = new NhanVien();
					String gtinhString = null;
					if (rdbtnNam.isSelected()) {
						nhanVien.setGioiTinh(true);
						gtinhString = "Nam";
					} else if (rdbtnNu.isSelected()) {
						nhanVien.setGioiTinh(false);
						gtinhString = "Nu";
					}
					nhanVien.setChucVu(txtCV.getText());
					nhanVien.setHoTen(txtTenNV.getText());
					nhanVien.setMaNV(txtMaNV.getText());
					JOptionPane.showMessageDialog(btnThem,
							"Mã nhân viên:" + txtMaNV.getText() + "\nTên nhân viên:" + txtTenNV.getText() + "\nChức vụ:"
									+ txtCV.getText() + "\nGiới Tính:" + gtinhString,
							"Thêm thành công", JOptionPane.INFORMATION_MESSAGE);
					nhanViens.add(nhanVien);
				}

			}
		});
		btnThem.setBounds(5, 327, 135, 23);
		contentPane.add(btnThem);

		JButton btnSave = new JButton("L\u01B0u d\u1EEF li\u1EC7u");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int kq = JOptionPane.showConfirmDialog(btnSave, "Bạn muốn lưu thông tin nhân viên không?", "Thông báo",
						JOptionPane.YES_NO_OPTION);
				if (kq == JOptionPane.YES_OPTION) {
					File file = new File("nhanvien.data");
					FileOutputStream fileOutputStream = null;
					ObjectOutputStream objectOutputStream = null;
					try {
						fileOutputStream = new FileOutputStream(file, true);
						objectOutputStream = new ObjectOutputStream(fileOutputStream);
						objectOutputStream.writeObject(nhanVien);
						JOptionPane.showMessageDialog(btnSave, "Ghi dữ liệu thành công", "Thông báo",
								JOptionPane.INFORMATION_MESSAGE);
					} catch (FileNotFoundException e1) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(btnSave, "Không tìm đc file", "Thông báo",
								JOptionPane.WARNING_MESSAGE);
						e1.printStackTrace();

					} catch (IOException e1) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(btnSave, "Lỗi nhập xuất", "Thông báo",
								JOptionPane.WARNING_MESSAGE);
						e1.printStackTrace();
					}
					finally {
						if(fileOutputStream!=null)
						{
							try {
								fileOutputStream.close();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
						if (objectOutputStream!=null) {
							try {
								objectOutputStream.close();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
				}
			}
		});
		btnSave.setBounds(178, 327, 135, 23);
		contentPane.add(btnSave);
	}
}

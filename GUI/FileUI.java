package GUI;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

import Backend.Driver;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.awt.FlowLayout;
import javax.swing.JList;

public class FileUI {

	private JFrame frame;
	private Driver drive;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					FileUI window = new FileUI();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public FileUI(Driver d) {
		this.drive = d;
		frame = new JFrame();
		try {
			initialize(drive.getAction());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(ActionListener listen) throws Exception{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		DefaultListModel<String> model = new DefaultListModel<>();
		JList<String> list = new JList<String>(model);
		list.setBounds(44, 11, 335, 206);
		
		JMenuItem mntmRead = new JMenuItem("Read");
		mntmRead.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println(System.getProperty("user.dir"));
				String fileToRead = "src\\data.txt";
				String lineBeingRead ="";
				String csvSplitBy =",";
				try {
					FileReader fr = new FileReader(fileToRead);
					Scanner sc = new Scanner(fr);
					model.removeAllElements();
					while(sc.hasNextLine()) {
						lineBeingRead = sc.nextLine();
						String[] RequiredData = lineBeingRead.split(csvSplitBy);
						model.addElement(RequiredData[0]);
					}
					sc.close();
				}catch(FileNotFoundException e1) {
					System.err.println("make sure you have a \"data\" file with.");
				}
			}
		});
		mnFile.add(mntmRead);
		frame.getContentPane().setLayout(null);
		
		frame.getContentPane().add(list);
	}
	
	public void setVisible(boolean x) {
		frame.setVisible(x);
	}
}

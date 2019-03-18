
import java.awt.event.ActionListener;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JLabel;

public class GUI_AdminReviewProc extends JFrame{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					GUI_AdminReviewProc window = new GUI_AdminReviewProc();
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
	public GUI_AdminReviewProc(ActionListener l) {
		initialize(l);
	}

	/**
	 * Initialize the contents of the frame.
	 * @param l 
	 */
	private void initialize(ActionListener l) {
		//frame = new JFrame();
		super.setBounds(100, 100, 450, 300);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.getContentPane().setLayout(null);
		
		//displays the list of submissions
		JList listSubmissionList = new JList();
		listSubmissionList.setBounds(37, 30, 190, 36);
		super.getContentPane().add(listSubmissionList);
		
		//Assigns 3 reviewers to a selected paper
		JButton btnAssign = new JButton("Assign");
		btnAssign.addActionListener(l);
		btnAssign.setBounds(37, 88, 89, 23);
		super.getContentPane().add(btnAssign);
		
		//Judge button allows the reviewer to determine if the paper is good for publication
		JButton btnJudge = new JButton("Judge");
		btnJudge.addActionListener(l);
		btnJudge.setBounds(155, 88, 89, 23);
		super.getContentPane().add(btnJudge);
		
		//displays info about the selected submission
		JList listSubmissionInfo = new JList();
		listSubmissionInfo.setBounds(281, 57, 125, 159);
		super.getContentPane().add(listSubmissionInfo);
	}
}

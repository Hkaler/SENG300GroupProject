import java.util.Scanner;

import javax.swing.JFileChooser;
/*Source: https://www.youtube.com/watch?v=xkcs25Ustag */
public class OpenFile {
	JFileChooser fileChooser = new JFileChooser();
	StringBuilder sb = new StringBuilder();

	public void PickMe() throws Exception {
		if(fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			
			java.io.File file = fileChooser.getSelectedFile();
					
			Scanner input = new Scanner(file);
			
			while(input.hasNext()) {
				sb.append(input.nextLine());
				sb.append("\n");
			}
			
			input.close();
		}
		else {
			sb.append("No File was selected");
			
			
		}
	}
}

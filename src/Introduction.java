
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Introduction
{
				static String name; 
				static int choiceName;
				static int playOrNo;
				static JFrame frame = new JFrame();
				static Scanner userInput = new Scanner(System.in);
				private static final long serialVersionUID = 1L;

						public static void askNameToPlay()
							{ 
							name = JOptionPane.showInputDialog("What is your name?");  
							JOptionPane.showMessageDialog(frame, "Hi, " + name);
							Object[] options = {"Yes", "No"};
							playOrNo = JOptionPane.showOptionDialog(frame, "Would you like to play the memory game?",
									"Yes or No",
									JOptionPane.YES_NO_CANCEL_OPTION,
									JOptionPane.QUESTION_MESSAGE,
									null, options, options[1]);
						switch(playOrNo)
							{
							case 0:
								{
								JOptionPane.showMessageDialog(frame, "Ok, lets play!");
								break;
								}
							case 1:
							
								{
								JOptionPane.showMessageDialog(frame, "Ah, you don't.");
								System.exit(0);
								break;
								}
							}

							}


}
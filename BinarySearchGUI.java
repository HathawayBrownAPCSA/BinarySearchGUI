/** A GUI for a Library management program.
  * Based on various sources.
  *
  * @author Michael Buescher for Hathaway Brown APCS
  * @version Spring 2017
  */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.*;
import javax.swing.border.*;

public class BinarySearchGUI extends JPanel
{
  // -------------- Private Instance Variables --------------------
  
  
  
  // -------------- GUI components ------------------------
  private JLabel guessWords;
  private JLabel nextGuess;
  private JLabel blank;
  private JButton lowerButton;
  private JButton correctButton;
  private JButton higherButton;
  
  
  //----------------------------------------------------------------------------
  // Constructor sets up the GUI 
  // Add other code at the beginning
  //----------------------------------------------------------------------------
  
  public BinarySearchGUI ()
  {    
    JOptionPane.showMessageDialog(null, "Think of an Integer from 1 to 100.\nPress OK when ready!",
                          "Get Ready!", JOptionPane.INFORMATION_MESSAGE);
          
    // The GUI Tools
    guessWords = new JLabel(" My first guess is ... ");
    nextGuess = new JLabel("50");
    nextGuess.setFont(new Font("Arial", Font.BOLD, 20));
    blank = new JLabel(" ");
    
    // If the font is too small for the buttons, set it larger, like above
    lowerButton = new JButton("Lower");
    lowerButton.addActionListener(new lowerButtonListener());
    
    correctButton = new JButton("Correct!");
    correctButton.addActionListener(new correctButtonListener());
    
    higherButton = new JButton("Higher");
    higherButton.addActionListener(new higherButtonListener());
        
    // Lay Out the Tools on a JFrame
    // 2 rows, 3 cols, spaced by 10 horizontally and vertically
    setLayout(new GridLayout(2, 3, 10, 10));
    add(blank);
    add(guessWords);
    add(nextGuess);
    add(lowerButton);
    add(correctButton);
    add(higherButton);
  }
  
  
  // When the user clicks the "Lower" button
  private class lowerButtonListener
      implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      // your code here      
    }
  }

  
    // When the user clicks the "Correct" button
  private class correctButtonListener
      implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      // your code here     
      
      
      // At the end of the "Correct" button, close the window.
      System.exit(0);
    }
  }
  
    // When the user clicks the "Higher" button
  private class higherButtonListener
      implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      // your code here      
    }
  }

  
  
  public static void main(String[] args) 
  {
    JFrame window = new JFrame("Guess My Number!");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.getContentPane().add(new BinarySearchGUI());
    window.setBounds(300,300,360,120);    // Use larger numbers for the last two parameters if your screen is too small
    window.setVisible(true);
  }
 
}

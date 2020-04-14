import java.lang.StringBuilder;
import javax.swing.JOptionPane;

public class MadLibMaker
{
  public MadLibMaker()
  {
    story = new StringBuilder();
  }

  public void addToStory(String str)
  {
    story.append(str);
  }

  public void askSpeechPart(String part)
  {
    String phrase;

    phrase = JOptionPane.showInputDialog("Please enter a " + part);
    story.append(phrase);
  }

  public void showStory()
  {
    JOptionPane.showMessageDialog(null, story);
  }
  

  private StringBuilder story;
}
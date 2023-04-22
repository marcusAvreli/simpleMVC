package simpleMVC;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;


public class PanelModel extends JPanel{

	public PanelModel() {
		initComponents();
	}
	public void initComponents() {
		TitledBorder title;
		Border  blackline = BorderFactory.createLineBorder(Color.black);
		title = BorderFactory.createTitledBorder(
                blackline, "title");
		setBorder(title);
	}
}

package infovis.example;

import infovis.gui.GUI;

import java.awt.Graphics2D;
import java.util.Iterator;

import javax.swing.SwingUtilities;

import com.sun.prism.Graphics;

public class Example {
	private MouseController controller = null;
    private Model model = null;
    private View view = null;
       
	public View getView() {
		if (view == null) generateDiagram();
		return view;
	}
	public void generateDiagram(){
	   model = new Model();
	   view = new View();
	   controller = new MouseController();
	   view.addMouseListener(controller);
	   view.addMouseMotionListener(controller);
	   view.setModel(model);
	   controller.setModel(model);
	   controller.setView(view);
	}
	
	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		for(Iterator<E> i = model.iterator(); i.hasNext();) {
			
		}
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GUI application = new GUI();
				application.setView(new Example().getView());
				application.getJFrame().setVisible(true);
			}
		});
	}
	
	
}

package Main;

import javax.swing.UIManager;

import Gui.Principal;

public class Arranque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Arranque del programa desde esta clase, llamando a la clase Principal
		
		Principal window = new Principal();
		 for(UIManager.LookAndFeelInfo laf:UIManager.getInstalledLookAndFeels()){
	            if("Nimbus".equals(laf.getName()))
	                try {
	                UIManager.setLookAndFeel(laf.getClassName());
	            } catch (Exception ex) {
	            }
	        }
		window.frame.setVisible(true);
 	        }

	}



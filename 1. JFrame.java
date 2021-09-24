
public class JFrameExample
{	
	public static void main(String[] args)
	{
		
		// JFrame Object is used to create a Frame
		// We can Give the Frame name by passing the constructor 
		JFrame frame=new JFrame("Frame Header");
		
		// Set Layout method is used to configure the layout of the Frame
		frame.setLayout(null);
		
		// Set Visible method is used to display or un-display the Frame
		frame.setVisible(true);
		
		// Set Size method is used to set the Width and Hight of the Frame
		frame.setSize(500,500);
		
		// Set Location Relate to method is used to display the frame at center of the monitor
		frame.setLocationRelativeTo(null);
		
		// ReSizable method is used to restrict the Resize of the Frame, Maximize Button will not available if pass value as false
		frame.setResizable(false);
				
		// Used to close stop the running of programe
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
	}
}

import javax.swing.JOptionPane;


public class HeightConverter {
	public static void main(String [] args) {
		String strHeightInCm = "";
		double dblHeightInCm, dblHeightInIn, dblHeightInFt; 
		
		strHeightInCm = JOptionPane.showInputDialog("Enter your height in centimeters.");
		dblHeightInCm = Double.parseDouble(strHeightInCm);
		dblHeightInIn = dblHeightInCm * 0.39;
		dblHeightInFt = dblHeightInIn / 12;
		
		JOptionPane.showMessageDialog(null, "Your height in inches is " + dblHeightInIn + " and your height in feet is " + dblHeightInFt + ".");
		
	}
}

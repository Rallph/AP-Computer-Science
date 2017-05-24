// Ralph Nahra
//
// This is the driver class which tests the methods of the Worker classes
// and prints the incomes of three people

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Container;

public class U9A1 extends JFrame {

	private JTextArea output = new JTextArea();

	public static void main(String[] args) {

		U9A1 app = new U9A1();
		app.setSize(500,500);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public U9A1() {

		
		output.setFont(new Font("Monospaced", Font.PLAIN, 20));
		Container c = getContentPane();
		c.add(output);
		TestHourly();
		TestSalaried();
		TestPiece();
	}

	public void TestHourly() {

		HourlyWorker hw = new HourlyWorker("John Doe", 9.48, 43);
		output.append("Test Hourly Worker Class\n");
		output.append("------------------------\n");
		output.append("Wage for " + hw.getName() + " = "
		+ String.format("$%.2f", hw.wage()) + "\n\n\n");
	}

	public void TestSalaried() {

		SalariedWorker sw = new SalariedWorker("Karen Jones", 25.76, 52);
		output.append("Test Salaried Worker Class\n");
		output.append("------------------------\n");
		output.append("Wage for " + sw.getName() + " = "
		+ String.format("$%.2f", sw.wage()) + "\n\n\n");
	}

	public void TestPiece() {

		PieceWorker pw = new PieceWorker("Wesley Smith", 5.65, 36);
		output.append("Test Piece Worker Class\n");
		output.append("------------------------\n");
		output.append("Wage for " + pw.getName() + " = "
		+ String.format("$%.2f", pw.wage(1025)) + "\n\n\n");

	}




}
package pproject;
import java.util.ArrayList;
import java.util.List;

public class PWR{
	
	public static void main(String[]args) {
		Receiver newReceiver = TVR.getReceiver();
		
		Down offCommand = new Down(newReceiver);
	Button	 onPressed = new Button(offCommand);
		 
		Up onCommand = new Up(newReceiver);
		 onPressed = new Button(onCommand);
		onPressed.press();
		
		
		 
		onPressed.press();
		onPressed.press();
		onPressed.press();
		onPressed.press();
		onPressed.press();
		onPressed.press();
		
	}
}
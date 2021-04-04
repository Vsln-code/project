package pproject;
public class Down implements Command{
	
	Receiver Trener;
	
	public Down(Receiver newReceiver) {
	Trener = newReceiver;
	
}
public void execute() {
	Trener.Down();
}
}
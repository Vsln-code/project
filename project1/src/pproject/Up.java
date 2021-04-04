package pproject;
public class Up implements Command{
	
	Receiver Trener;
	
	public Up(Receiver newReceiver) {
	Trener = newReceiver;
	
}
public void execute() {
	Trener.Up();
}
}
package xtra.anonymousClassTest;

public class ExistentClassExtension {

	public static void main(String[] args) {

		new Room(){
			private int seatNum;
			
			public void reserveSeat() {
				System.out.println(seatNum + "reserved.");
			}
			
		}.reserveSeat(); //Way to call anonymous class method: . point right after close} declaration
		
	}

}

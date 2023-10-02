package xtra.anonymousClassTest;

public class ExistentInterfaceImplementation {

	public static void main(String[] args) {
		
		/*Roomable room =*/ new Roomable() {
			private int roomNumber;
			private final int key = 9;
			
			public void shareRoomKey(String email) {
				System.out.println(key + " sared with " + email);
			}
			
			@Override
			public void openARoom(int key) {
				if (key == this.key) {
					System.out.println(roomNumber + " opended");
				}
				
			}
			
		}	
		
		//room.openARoom(0);
		.shareRoomKey("p.lopez.ch.hr@hotmail.com"); // Way to call anonymous class method: . point right after close} declaration
	}

}

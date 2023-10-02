package xtra.anonymousClassTest;


public class ACUsedAsParameterOfMethodCall {

	public static void main(String[] args) {
		
		testingRoom(new Room() {});
		
		testingRoomable(new Roomable() {

			@Override
			public void openARoom(int key) {
				
			}
			
		});
		
		
		/*
		 * As example, what we did during walkFileTree() call:
		 * 
		 * Files.walkFileTree(dir, new SimpleFileVisitor<Path>(){
		  @Override
		  public FileVisitResult preVisitDirectory(Path file, BasicFileAttributes attrs) throws IOException {			
		       directory.add("(D) " + file.getFileName() + " | Modified: " + attrs.lastModifiedTime());
		    return FileVisitResult.CONTINUE;
		  }  
		  @Override
		  public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		    if(!attrs.isDirectory()){
		       directory.add("(F) " + file.getFileName() + " | Modified: " + attrs.lastModifiedTime());
		    }
		    return FileVisitResult.CONTINUE;
		  }});
		 */
		
	}
	
	public static void testingRoom (Room room) {
		
	}
	
	public static void testingRoomable (Roomable room) {
		
	}

}

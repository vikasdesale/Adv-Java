package sendfiles;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private ServerSocket serverSocket = null;
	private Socket socket = null;
	private ObjectInputStream inputStream = null;
	private FileEvent fileEvent;
	private File dstFile = null;
	private FileOutputStream fileOutputStream = null;
	
	public Server(){
		
	}
	public void doConnect(){
		try{
			serverSocket = new ServerSocket(4452);
			socket = serverSocket.accept();
			inputStream = new ObjectInputStream(socket.getInputStream());
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	//reading the FileEvent object and copying the file to disk
	public void downloadFile(){
		try{
			fileEvent.setFileData(inputStream.readObject());
			
			if(fileEvent.getStatus().equalsIgnoreCase("Error")){
				System.out.println("Error occured..so exiting");
				System.exit(0);
			}
			String outputFile = fileEvent.getDestinationDirectory()+fileEvent.getFileName();
			if(!new File(fileEvent.getDestinationDirectory()).exists()){
				new File(fileEvent.getDestinationDirectory()).mkdirs();
			}
			dstFile = new File(outputFile);
			fileOutputStream = new FileOutputStream(dstFile);
			fileOutputStream.write((int) fileEvent.getFileData());
			fileOutputStream.flush();
			fileOutputStream.close();
			System.out.println("Output File: "+outputFile+" successfully saved!");
			Thread.sleep(3000);
			System.exit(1);
		}catch(Exception exx){
			exx.printStackTrace();
		}
	}
	public static void main(String args[]){
		Server server = new Server();
		server.doConnect();
		server.downloadFile();
		
	}
}

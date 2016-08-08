package sendfiles;
import java.io.Serializable;

public class FileEvent implements Serializable{
	public FileEvent(){
}
	private static final long serialVersionUID = 1L;
	private String destinationDirectory;
	private String sourceDirectory;
	private String fileName;
	private long filesize;
	private Object filedata;
	private String status;
	
	public String getDestinationDirectory(){
		return destinationDirectory;
	}
	public void setDestinationDirectory(String desdir){
		this.destinationDirectory = desdir;
	}
	public String getSourceDirectory(){
		return sourceDirectory;
	}
	public void setSourceDirectory(String sd){
		this.sourceDirectory = sd;
	}
	public String getFileName(){
		return fileName;
	}
	public void setFileName(String fn){
		this.fileName=fn;
	}
	public long getFileSize(){
		return filesize;
	}
	public void setFileSize(long fs){
		this.filesize=fs;
	}
	public String getStatus(){
		return status;
	}
	public void setStatus(String st){
		this.status = status;
	}
	public Object getFileData(){
		return filedata;
	}
	public void setFileData(Object obj){
		this.filedata = obj;
	}
	
	}

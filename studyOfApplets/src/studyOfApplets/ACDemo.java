package studyOfApplets;
import java.awt.*;
import java.applet.*;
import java.net.*;
public class ACDemo extends Applet{
	URL songpath;
	public void start(){
			try {
			songpath = new URL("E:\\Aux Download\\");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			AudioClip myfavsong=getAudioClip(songpath,"DC.mp3");
			myfavsong.play();
			}
	}


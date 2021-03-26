import processing.core.*;
import processing.core.PImage;
public class MyPApplet extends PApplet {
	private String url="/Users/maryeskandari/Downloads/beach.jpeg";
    private PImage backgroungImg;
	public void setup(){
		size(400,400);
		backgroungImg=loadImage(url,"jpeg");
		backgroungImg.resize(0, height);
		image(backgroungImg,0,0);
	}
	
	public void draw(){
		int[] color=sunColorSec(second());
		fill(color[0],color[1],color[2]);
		ellipse(width/4,height/5,width/4,height/5);
		fill(0,0,0);
		ellipse((int)(0.85*width/4),(int)(0.9*height/5),(int)(0.1*width/4),(int)(0.2*height/5));
		ellipse((int)(1.15*width/4),(int)(0.9*height/5),(int)(0.1*width/4),(int)(0.2*height/5));
		noFill();
		arc((int)(1*width/4),(int)(1.2*height/5), 30, 30, 0, PI);
		
	}
	
	

	public int[] sunColorSec(float seconds) {
		int[] rgb= new int[3];
		float difffrom30=Math.abs(30-seconds);
		float ratio = difffrom30/30;
		rgb[0]=(int)(255*ratio);
		rgb[1]=(int)(255*ratio);
		rgb[2]=0;
		
		return rgb;
		
	}

}

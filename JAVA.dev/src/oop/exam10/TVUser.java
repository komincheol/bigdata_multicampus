package oop.exam10;

import java.io.FileInputStream;
import java.util.Properties;

public class TVUser {
	public static void main(String[] args) throws Exception{
		TVplayer(new SamsungTV(), new HarmanSpeaker());
		TVplayer( new LGTV(),new AppleSpeaker());
		TVplayer(new SonyTV(),new OrangeSpeaker());
		
		Properties p = new Properties();
		p.load(new FileInputStream("product.properties"));
		Class clazz1 = Class.forName(p.getProperty("tv"));
		Class clazz2 = Class.forName(p.getProperty("speaker"));
		
		TV tv = (TV) clazz1.newInstance(); //new SonyTV();
		Speaker speaker = (Speaker) clazz2.newInstance();
		tv.setSpeaker(speaker);
		tv.powerOn();
		tv.channelUp();
		tv.channelUp();
		tv.soundUp();
		tv.soundUp();
		tv.soundDown();
		tv.powerOff();
		
		/*
		TV tv = new SamsungTV();
		TV tv1 = new LGTV();
		TV tv2 = new SonyTV();
		tv.setSpeaker(new HarmanSpeaker());
		tv1.setSpeaker(new AppleSpeaker());
		tv2.setSpeaker(new OrangeSpeaker());*/
		/*
		tv.powerOn();
		tv.channelUp();
		tv.channelUp();
		tv.soundUp();
		tv.soundUp();
		tv.channelDown();
		tv.soundDown();
		tv.soundDown();
		tv.powerOff();
		
		tv1.powerOn();
		tv1.channelUp();
		tv1.channelUp();
		tv1.soundUp();
		tv1.soundUp();
		tv1.channelDown();
		tv1.soundDown();
		tv1.soundDown();
		tv1.powerOff();
		
		tv2.powerOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.soundUp();
		tv2.soundUp();
		tv2.channelDown();
		tv2.soundDown();
		tv2.soundDown();
		tv2.powerOff();
		*/
	}
	
	public static void TVplayer(TV tv , Speaker speaker){
			tv.setSpeaker(speaker);
			
			tv.powerOn();
			tv.channelUp();
			tv.channelUp();
			tv.soundUp();
			tv.soundUp();
			tv.channelDown();
			tv.soundDown();
			tv.soundDown();
			tv.powerOff();
			
		}
				
}



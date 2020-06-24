package com.cohortThree;

import java.util.function.BooleanSupplier;

public class Television {
	
	private int channelId;
	private int volume;
	private boolean isTvSwitchedOn;
	
//	public void changeChannel(int channelId, int volume, boolean isTvSwitchedOn) {
//		this.channelId = channelId;
//		this.volume = volume;
//		this.isTvSwitchedOn = isTvSwitchedOn;
	
	public boolean turnTvOn() {
		isTvSwitchedOn = true;
		return isTvSwitchedOn;
	}
	public int getChannelId() {
		return channelId;
	}	
	public void changeChannel(int newChannel) {
		if (isTvSwitchedOn) {
			channelId = newChannel;
		}
		else {
			System.out.println("Please turn TV on");
		}
	}
	public void channelUp() {
		channelId++;
	}
	public void channelDown() {
		channelId--;
	}
	
}

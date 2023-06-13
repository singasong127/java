package com.mycompany.study.ch07.first;

public class MobilePhone extends DmbCellPhone {
	
	void changeCh() {
		powerOn();
		changeChannelDmb(3);
	}
	@Override
	void changeChannelDmb(int channel) {
		// TODO Auto-generated method stub
		System.out.println("채널 " + channel + "번으로 바꿈");
	}
}

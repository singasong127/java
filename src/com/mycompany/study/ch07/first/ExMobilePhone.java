package com.mycompany.study.ch07.first;

public class ExMobilePhone {

	public static void main(String[] args) {
		
		CellPhone cell = new CellPhone();
		
		cell.powerOn();
		cell.powerOn(1);
		
		System.out.println("=================");
		
		DmbCellPhone dmb = new DmbCellPhone();
		
		dmb.turnOffDmb();
		dmb.powerOn();
		dmb.powerOn(2);
		
		System.out.println("=================");
		
		MobilePhone mobile = new MobilePhone();
		
		mobile.hangUp();
		mobile.bell();
		mobile.channel = 11;
		mobile.changeChannelDmb(mobile.channel);
	}

}

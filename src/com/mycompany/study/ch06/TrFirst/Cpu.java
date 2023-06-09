package com.mycompany.study.ch06.TrFirst;

public class Cpu {
	
	//	field
	String name;
	String nick;
	String company;
	int core;
	int thread;
	double clock;
	int cache;
	
	Cpu(String company, String name, String nick, int core, int thread, double clock, int cache) {
		this.name = name;
		this.nick = nick;
		this.company = company;
		this.core = core;
		this.thread = thread;
		this.clock = clock;
		this.cache = cache;
		
	}
	
	
}

package com.t99sdevelopment.philesd;

import com.t99sdevelopment.philesd.util.CommandInterpreter;

public class Philesd {
	
	public static void main(String[] args) {

		CommandInterpreter.interpret("s - -m \"primary node\"").debugOutput();

	}
	
}
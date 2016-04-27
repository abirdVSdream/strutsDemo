package org.cai.app.action;

public class MyException extends Exception {
	private String s;
	MyException(String s)
	{
		this.s=s;
	}

}

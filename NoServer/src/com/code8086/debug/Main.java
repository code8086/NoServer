package com.code8086.debug;

import com.code8086.server.SocketListener;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Server is starting ...");
		SocketListener main_listener = new SocketListener();
		main_listener.start();
	}
}

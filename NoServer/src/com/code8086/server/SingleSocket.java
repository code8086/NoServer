package com.code8086.server;

import java.io.InputStream;
import java.net.Socket;

public class SingleSocket extends Thread
{
	public Socket socket;
	public void run ()
	{
		try {
			InputStream in = socket.getInputStream();
			byte[] buffer = new byte[1024];
			int size = 0;
			while ((size=in.read(buffer)) != -1)
			{
				System.out.println( socket.toString() + " " + size + " " + new String(buffer,0,size,"GBK"));
				buffer = new byte[1024];
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}

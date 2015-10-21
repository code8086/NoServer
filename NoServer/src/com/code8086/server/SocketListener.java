package com.code8086.server;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class SocketListener extends Thread
{
	public List<SingleSocket> sockets_list;
	public void run ()
	{
		try {
			sockets_list = new ArrayList<SingleSocket>();
			@SuppressWarnings("resource")
			ServerSocket serverSocket = new ServerSocket(1111);
			while (true)
			{
				Socket clientSocket = serverSocket.accept();
				System.out.println(clientSocket.toString());
				SingleSocket tmp_single_socket = new SingleSocket();
				tmp_single_socket.socket = clientSocket;
				sockets_list.add(tmp_single_socket);
				sockets_list.get(sockets_list.size()-1).start();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

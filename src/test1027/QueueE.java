package test1027;


import java.util.*;




public class QueueE {

	public static void main(String[] args) {
		Queue<Message>messageQueue= new LinkedList<>();
		
		messageQueue.offer(new Message("send","È«"));
		messageQueue.offer(new Message("new","±æ"));
		messageQueue.offer(new Message("end","µ¿"));
		
		while(!messageQueue.isEmpty()) {
			Message message =messageQueue.poll();
			switch (message.command) {
			case "send":
				System.out.println(message.to+"1");
				break;
			case "new":
				System.out.println(message.to+"2");
				break;
			case "end":
				System.out.println(message.to+"3");
				break;
			
			}
		}
	}

}

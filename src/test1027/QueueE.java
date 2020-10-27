package test1027;


import java.util.*;




public class QueueE {

	public static void main(String[] args) {
		Queue<Message>messageQueue= new LinkedList<>();
		
		messageQueue.offer(new Message("send","ȫ"));
		messageQueue.offer(new Message("new","��"));
		messageQueue.offer(new Message("end","��"));
		
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

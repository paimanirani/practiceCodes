package org.lint.practice;

import java.util.ArrayList;
//How many time business owner got involved from all the conversation that had to do with him.
import java.util.List;
//floor((business owner wrote > 0 / business owner involved) *100)

public class MySolution {
	public static int businessResponsivenessRate(int bizOwnerId, List<Message> allMessages) {
		int currentConvId = -1;
		int bizInvolved = 0;
		int bizResponse = 0;
		boolean reply = false;

		for (int i = 0; i < allMessages.size(); i++) {
			if (allMessages.get(i).getConversationId() != currentConvId) {
				if (allMessages.get(i).getRecipient() == bizOwnerId) {
					currentConvId = allMessages.get(i).getConversationId();
					bizInvolved++;
					reply = false;
				}

			} else {
				if (allMessages.get(i).getSender() == bizOwnerId && reply == false) {
					bizResponse++;
					reply = true;
				}
			}
		}

		if (bizInvolved != 0 && bizResponse != 0) {
			return (int) Math.floor((bizResponse / (double) bizInvolved) * 100);
		}
		return 0;

	}

	public static void main(String[] args) {
		int bizOwnerId = 42;
		List<Message> allMessages = new ArrayList<Message>();
		Message message1 = new Message(1, 42, 1);
		Message message2 = new Message(42, 1, 1);
		Message message3 = new Message(2, 42, 2);
		Message message4 = new Message(2, 42, 2);
		Message message5 = new Message(3, 88, 3);
		Message message6 = new Message(3, 42, 4);

		allMessages.add(message1);
		allMessages.add(message2);
		allMessages.add(message3);
		allMessages.add(message4);
		allMessages.add(message5);
		allMessages.add(message6);

		// output 33 (only 1 response from 1, 2, 4)
		int responsiveRate = businessResponsivenessRate(bizOwnerId, allMessages);
		System.out.println(responsiveRate);
	}

}

class Message {
	int sender;
	int recipient;
	int conversationId;

	public Message(int sender, int recipient, int conversationId) {
		this.sender = sender;
		this.recipient = recipient;
		this.conversationId = conversationId;
	}

	public int getSender() {
		return this.sender;
	}

	public int getRecipient() {
		return this.recipient;
	}

	public int getConversationId() {
		return this.conversationId;
	}
}

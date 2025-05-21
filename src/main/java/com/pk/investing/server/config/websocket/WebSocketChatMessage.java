package com.pk.investing.server.config.websocket;

public class WebSocketChatMessage {

	private MessageType type;
	private String message;
	private String messageSender;
	private String messageReceiver;
	private String messageSenderName;
	private String messageReceiverName;

	public enum MessageType {
		CHAT, JOIN, LEAVE
	}

	public MessageType getType() {
		return type;
	}

	public void setType(MessageType type) {
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessageSender() {
		return messageSender;
	}

	public void setMessageSender(String messageSender) {
		this.messageSender = messageSender;
	}

	public String getMessageReceiver() {
		return messageReceiver;
	}

	public void setMessageReceiver(String messageReceiver) {
		this.messageReceiver = messageReceiver;
	}

	public String getMessageSenderName() {
		return messageSenderName;
	}

	public void setMessageSenderName(String messageSenderName) {
		this.messageSenderName = messageSenderName;
	}

	public String getMessageReceiverName() {
		return messageReceiverName;
	}

	public void setMessageReceiverName(String messageReceiverName) {
		this.messageReceiverName = messageReceiverName;
	}

	@Override
	public String toString() {
		return "WebSocketChatMessage [type=" + type + ", message=" + message + ", messageSender=" + messageSender
				+ ", messageReceiver=" + messageReceiver + ", messageSenderName=" + messageSenderName
				+ ", messageReceiverName=" + messageReceiverName + "]";
	}

}

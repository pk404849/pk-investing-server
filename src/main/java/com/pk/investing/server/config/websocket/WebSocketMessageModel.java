package com.pk.investing.server.config.websocket;

public class WebSocketMessageModel {

	private String from;
	private String text;
	private String messageSenderName;
	private String messageReceiverName;

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
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

}

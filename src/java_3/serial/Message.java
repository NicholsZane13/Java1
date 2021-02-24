package java_3.serial;

public class Message {
	private int id;
	private String msgTxt;

	public String getMsgTxt(int id) {
		return msgTxt; //to get a message, the id must be passed in
	}
}

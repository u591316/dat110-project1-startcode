package no.hvl.dat110.messaging;

import no.hvl.dat110.TODO;

public class Message {

	private byte[] data;

	public Message(byte[] data) {
		
		// TODO - START
		this.data = data; 
		
		if (data == null || data.length > 127)
			throw new UnsupportedOperationException(TODO.constructor("Message"));
			
		// TODO - END
	}

	public byte[] getData() {
		return this.data; 
	}

}

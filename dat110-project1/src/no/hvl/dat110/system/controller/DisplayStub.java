package no.hvl.dat110.system.controller;

import no.hvl.dat110.TODO;
import no.hvl.dat110.rpc.*;

public class DisplayStub extends RPCLocalStub {
		
	private byte RPCIDDISPLAY = 2;
	
	public DisplayStub(RPCClient rpcclient) {
		super(rpcclient);
	}
	
	public void write (String message) {
		
		// TODO - START
		
		// implement marshalling, call and unmarshalling for write RPC method
		
		byte[] msg = RPCUtils.marshallString(message);
		
		byte[] ret = rpcclient.call(RPCIDDISPLAY, msg); 
		
		RPCUtils.unmarshallVoid(ret);
		
		
		
		
		
//		if (true)
//			throw new UnsupportedOperationException(TODO.method());
		
		// TODO - END
		
	}
}

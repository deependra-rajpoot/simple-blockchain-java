package com.deep.poc;

public class SimpleBlock {
	public String hash;
	public String previousHash;
	public String data;
	
	public SimpleBlock(String previousHash, String data) {
		this.previousHash = previousHash;
		this.data = data;
		this.hash = calculateHash();
	}

	public String calculateHash() {
		
		return StringUtils.applySha256(previousHash+data);
	}	
}





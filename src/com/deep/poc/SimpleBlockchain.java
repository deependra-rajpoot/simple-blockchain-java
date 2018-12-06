package com.deep.poc;

import java.util.ArrayList;
import java.util.List;

public class SimpleBlockchain {

	public List<SimpleBlock> blocks;
	
	public SimpleBlockchain() {
		blocks = new ArrayList<SimpleBlock>();
		SimpleBlock genesis = new SimpleBlock("0","Genesis");
		blocks.add(genesis);
	}
	
	public boolean addBlock(SimpleBlock block){
		return blocks.add(block);
	}
	
	public boolean isValidBlockchain(){
		boolean isValid = true;
		for(int i=0; i<blocks.size()-1;i++){
			if (!blocks.get(i).hash .equals( blocks.get(i+1).previousHash)){
				System.out.println("Hash of previous block and previous hash of current block do not match");
				isValid = false;
				break;
			}
			if(!blocks.get(i).hash.equals(blocks.get(i).calculateHash())){
				System.out.println("Hash and calculated hash of current block do not match");
				isValid = false;
				break;
			}
		}
		return isValid;
	}
}








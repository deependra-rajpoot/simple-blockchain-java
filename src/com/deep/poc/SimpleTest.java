package com.deep.poc;

public class SimpleTest {

	public static void main(String[] args) {
		SimpleBlockchain blockchain = new SimpleBlockchain();

		System.out.println("Is blockchain valid : " + blockchain.isValidBlockchain());

		String genesisHash = blockchain.blocks.get(0).hash;
		
		SimpleBlock block1 = new SimpleBlock(genesisHash, "Block1Data");
		blockchain.addBlock(block1);
		System.out.println("Is blockchain valid : " + blockchain.isValidBlockchain());

		SimpleBlock block2 = new SimpleBlock(block1.hash, "Block2Data");
		blockchain.addBlock(block2);
		System.out.println("Is blockchain valid : " + blockchain.isValidBlockchain());

		SimpleBlock block3 = new SimpleBlock(block2.hash, "Block3Data");
		blockchain.addBlock(block3);
		System.out.println("Is blockchain valid : " + blockchain.isValidBlockchain());
		
		block1.data = "ChangedData";
		System.out.println("Is blockchain valid : " +blockchain.isValidBlockchain());
		
		block1.data = "Block1Data";
		System.out.println("Is blockchain valid : " +blockchain.isValidBlockchain());
		
		block3.previousHash = block1.hash;
		System.out.println("Is blockchain valid : " +blockchain.isValidBlockchain());		

	}
}


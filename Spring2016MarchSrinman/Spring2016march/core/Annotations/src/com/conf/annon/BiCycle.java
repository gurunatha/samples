package com.conf.annon;

public class BiCycle {
	private Chain chain;

	public void init() {
		System.out.println("created biCycle");
	}

	public void run() {
		System.out.println("running with : " + chain.getChainType() + " chain");
	}

	public void destroy() {
		System.out.println("destroyed biCycle");
	}

	public void setChain(Chain chain) {
		this.chain = chain;
	}

}

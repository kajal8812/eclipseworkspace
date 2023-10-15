package com.learning.mockito.demo.business;

public class SomeBusImpl {
	private DataService ds;

	public int findGreatest() {
		int[] d = ds.retrieveAllData();
		int x = Integer.MIN_VALUE;
		for (int v : d) {
			if (v > x)
				x = v;
		}
		return x;
	}

}

interface DataService {
	int[] retrieveAllData();
}
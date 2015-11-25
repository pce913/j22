package com.j2.templatemethod.comparator;
import java.util.*;

public class AscCompare implements Comparator<Duck>{
	int weight1;
	int weight2;
	
	public int compare(Duck o1, Duck o2) {
		weight1=o1.getWeight();
		weight2=o2.getWeight();
		if(weight1 > weight2)
			return 1;
		else if(weight1 == weight2)
			return 0;
		else
			return -1;
	}

}

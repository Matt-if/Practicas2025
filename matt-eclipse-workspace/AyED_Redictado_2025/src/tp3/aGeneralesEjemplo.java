package tp3;

import java.util.LinkedList;
import java.util.List;

public class aGeneralesEjemplo {
	public static GeneralTree<String> aGeneralStrings_1 () {
		GeneralTree<String> a1 = new GeneralTree<String>("1");
		List<GeneralTree<String>> children2 = new LinkedList<GeneralTree<String>>();
		children2.add(new GeneralTree<String>("21"));
		children2.add(new GeneralTree<String>("22"));
		children2.add(new GeneralTree<String>("23"));
		GeneralTree<String> a2 = new GeneralTree<String>("2", children2);
		List<GeneralTree<String>> children3 = new LinkedList<GeneralTree<String>>();
		children3.add(new GeneralTree<String>("31"));
		children3.add(new GeneralTree<String>("32"));
		GeneralTree<String> a3 = new GeneralTree<String>("3", children3);
		List<GeneralTree<String>> childen = new LinkedList<GeneralTree<String>>();
		childen.add(a1);childen.add(a2);childen.add(a3);
		GeneralTree<String> a = new GeneralTree<String>("0", childen);
		
		return a;
	}
	
	public static GeneralTree<Integer> aGeneralIntegers_1 () {
		GeneralTree<Integer> a1 = new GeneralTree<Integer>(1);
		List<GeneralTree<Integer>> children2 = new LinkedList<GeneralTree<Integer>>();
		children2.add(new GeneralTree<Integer>(21));
		children2.add(new GeneralTree<Integer>(22));
		children2.add(new GeneralTree<Integer>(23));
		GeneralTree<Integer> a2 = new GeneralTree<Integer>(2, children2);
		List<GeneralTree<Integer>> children3 = new LinkedList<GeneralTree<Integer>>();
		children3.add(new GeneralTree<Integer>(31));
		children3.add(new GeneralTree<Integer>(32));
		GeneralTree<Integer> a3 = new GeneralTree<Integer>(3, children3);
		List<GeneralTree<Integer>> childen = new LinkedList<GeneralTree<Integer>>();
		childen.add(a1);childen.add(a2);childen.add(a3);
		GeneralTree<Integer> a = new GeneralTree<Integer>(0, childen);
		
		return a;
	}
	
	/*					  0
	 * 				/	  |		  \
	 * 			  1	      2			 3
	 * 				  /   |   \		 |    \
	 * 				21   22   23 	31    32
	 * 							  /  |  \
	 * 							 10  15  99
	 */
	public static GeneralTree<Integer> aGeneralIntegers_2 () {
		
		List<GeneralTree<Integer>> children = new LinkedList<GeneralTree<Integer>>();
		GeneralTree<Integer> a = new GeneralTree<Integer>(0, children);

		GeneralTree<Integer> h1 = new GeneralTree<Integer>(1);
		
		List<GeneralTree<Integer>> children2 = new LinkedList<GeneralTree<Integer>>();
		GeneralTree<Integer> h2 = new GeneralTree<Integer>(2, children2);
		
		List<GeneralTree<Integer>> children3 = new LinkedList<GeneralTree<Integer>>();
		GeneralTree<Integer> h3 = new GeneralTree<Integer>(3, children3);
		
		children.add(h1);children.add(h2);children.add(h3);
		
		List<GeneralTree<Integer>> children31 = new LinkedList<GeneralTree<Integer>>();
		GeneralTree<Integer> h31 = new GeneralTree<Integer>(31, children31);
		children31.add(new GeneralTree<Integer>(10));
		children31.add(new GeneralTree<Integer>(15));
		children31.add(new GeneralTree<Integer>(99));
		
		children2.add(new GeneralTree<Integer>(21));
		children2.add(new GeneralTree<Integer>(22));
		children2.add(new GeneralTree<Integer>(23));
		
		children3.add(h31);
		children3.add(new GeneralTree<Integer>(32));

		return a;
	}
	
	/*					  				0
	 * 				/	  /		    		|			\		\
	 * 			  1	      2			 		3  			4		5
	 * 				  /   |   \		 	/    \   \   \
	 * 				21   22   23 		31    32  33  34
	 * 							  	  /  |  \
	 * 							 	10  15  99
	 */
	public static GeneralTree<Integer> aGeneralAbeto () {
		
		List<GeneralTree<Integer>> children = new LinkedList<GeneralTree<Integer>>();
		GeneralTree<Integer> a = new GeneralTree<Integer>(0, children);

		GeneralTree<Integer> h1 = new GeneralTree<Integer>(1);
		
		List<GeneralTree<Integer>> children2 = new LinkedList<GeneralTree<Integer>>();
		GeneralTree<Integer> h2 = new GeneralTree<Integer>(2, children2);
		
		List<GeneralTree<Integer>> children3 = new LinkedList<GeneralTree<Integer>>();
		GeneralTree<Integer> h3 = new GeneralTree<Integer>(3, children3);
		
		children.add(h1);children.add(h2);children.add(h3);
		children.add(new GeneralTree<Integer>(4));
		children.add(new GeneralTree<Integer>(5));
		
		List<GeneralTree<Integer>> children31 = new LinkedList<GeneralTree<Integer>>();
		GeneralTree<Integer> h31 = new GeneralTree<Integer>(31, children31);
		children31.add(new GeneralTree<Integer>(10));
		children31.add(new GeneralTree<Integer>(15));
		children31.add(new GeneralTree<Integer>(99));
		
		children2.add(new GeneralTree<Integer>(21));
		children2.add(new GeneralTree<Integer>(22));
		children2.add(new GeneralTree<Integer>(23));
		
		children3.add(h31);
		children3.add(new GeneralTree<Integer>(32));
		children3.add(new GeneralTree<Integer>(33));
		children3.add(new GeneralTree<Integer>(34));

		return a;
	}
	
	
	/*					  0
	 * 				/	  |		  \
	 * 			  1	      2		   0
	 * 				  /   |   \		 |    \
	 * 				2   22   23 	 0    32
	 * 							  /  |  \
	 * 							 10  15  0
	 */
	public static GeneralTree<Integer> aDeSeleccion () {
		
		List<GeneralTree<Integer>> children = new LinkedList<GeneralTree<Integer>>();
		GeneralTree<Integer> a = new GeneralTree<Integer>(0, children);

		GeneralTree<Integer> h1 = new GeneralTree<Integer>(1);
		
		List<GeneralTree<Integer>> children2 = new LinkedList<GeneralTree<Integer>>();
		GeneralTree<Integer> h2 = new GeneralTree<Integer>(2, children2);
		
		List<GeneralTree<Integer>> children3 = new LinkedList<GeneralTree<Integer>>();
		GeneralTree<Integer> h3 = new GeneralTree<Integer>(0, children3);
		
		children.add(h1);children.add(h2);children.add(h3);
		
		List<GeneralTree<Integer>> children31 = new LinkedList<GeneralTree<Integer>>();
		GeneralTree<Integer> h31 = new GeneralTree<Integer>(0, children31);
		children31.add(new GeneralTree<Integer>(10));
		children31.add(new GeneralTree<Integer>(15));
		children31.add(new GeneralTree<Integer>(0));
		
		children2.add(new GeneralTree<Integer>(2));
		children2.add(new GeneralTree<Integer>(22));
		children2.add(new GeneralTree<Integer>(23));
		
		children3.add(h31);
		children3.add(new GeneralTree<Integer>(32));

		return a;
	}

	/*					  0
	 * 				/	  |		    \
	 * 			  1	      1		     1
	 * 				  /   |   \		 |    \
	 * 				1     0   0 	 1    1
	 * 							  /  |  \
	 * 							 1  1    0
	 */
	public static GeneralTree<Integer> aDeCerosYUnos () {
		
		List<GeneralTree<Integer>> children = new LinkedList<GeneralTree<Integer>>();
		GeneralTree<Integer> a = new GeneralTree<Integer>(0, children);

		GeneralTree<Integer> h1 = new GeneralTree<Integer>(1);
		
		List<GeneralTree<Integer>> children2 = new LinkedList<GeneralTree<Integer>>();
		GeneralTree<Integer> h2 = new GeneralTree<Integer>(1, children2);
		
		List<GeneralTree<Integer>> children3 = new LinkedList<GeneralTree<Integer>>();
		GeneralTree<Integer> h3 = new GeneralTree<Integer>(1, children3);
		
		children.add(h1);children.add(h2);children.add(h3);
		
		List<GeneralTree<Integer>> children31 = new LinkedList<GeneralTree<Integer>>();
		GeneralTree<Integer> h31 = new GeneralTree<Integer>(1, children31);
		children31.add(new GeneralTree<Integer>(1));
		children31.add(new GeneralTree<Integer>(1));
		children31.add(new GeneralTree<Integer>(0));
		
		children2.add(new GeneralTree<Integer>(1));
		children2.add(new GeneralTree<Integer>(0));
		children2.add(new GeneralTree<Integer>(0));
		
		children3.add(h31);
		children3.add(new GeneralTree<Integer>(1));

		return a;
	}
}

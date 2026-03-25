package tp3;

import java.util.LinkedList;
import java.util.List;

public class aGeneralesEjemplo {
	public static GeneralTreeViejo<String> aGeneralStrings_1 () {
		GeneralTreeViejo<String> a1 = new GeneralTreeViejo<String>("1");
		List<GeneralTreeViejo<String>> children2 = new LinkedList<GeneralTreeViejo<String>>();
		children2.add(new GeneralTreeViejo<String>("21"));
		children2.add(new GeneralTreeViejo<String>("22"));
		children2.add(new GeneralTreeViejo<String>("23"));
		GeneralTreeViejo<String> a2 = new GeneralTreeViejo<String>("2", children2);
		List<GeneralTreeViejo<String>> children3 = new LinkedList<GeneralTreeViejo<String>>();
		children3.add(new GeneralTreeViejo<String>("31"));
		children3.add(new GeneralTreeViejo<String>("32"));
		GeneralTreeViejo<String> a3 = new GeneralTreeViejo<String>("3", children3);
		List<GeneralTreeViejo<String>> childen = new LinkedList<GeneralTreeViejo<String>>();
		childen.add(a1);childen.add(a2);childen.add(a3);
		GeneralTreeViejo<String> a = new GeneralTreeViejo<String>("0", childen);
		
		return a;
	}
	
	public static GeneralTreeViejo<Integer> aGeneralIntegers_1 () {
		GeneralTreeViejo<Integer> a1 = new GeneralTreeViejo<Integer>(1);
		List<GeneralTreeViejo<Integer>> children2 = new LinkedList<GeneralTreeViejo<Integer>>();
		children2.add(new GeneralTreeViejo<Integer>(21));
		children2.add(new GeneralTreeViejo<Integer>(22));
		children2.add(new GeneralTreeViejo<Integer>(23));
		GeneralTreeViejo<Integer> a2 = new GeneralTreeViejo<Integer>(2, children2);
		List<GeneralTreeViejo<Integer>> children3 = new LinkedList<GeneralTreeViejo<Integer>>();
		children3.add(new GeneralTreeViejo<Integer>(31));
		children3.add(new GeneralTreeViejo<Integer>(32));
		GeneralTreeViejo<Integer> a3 = new GeneralTreeViejo<Integer>(3, children3);
		List<GeneralTreeViejo<Integer>> childen = new LinkedList<GeneralTreeViejo<Integer>>();
		childen.add(a1);childen.add(a2);childen.add(a3);
		GeneralTreeViejo<Integer> a = new GeneralTreeViejo<Integer>(0, childen);
		
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
	public static GeneralTreeViejo<Integer> aGeneralIntegers_2 () {
		
		List<GeneralTreeViejo<Integer>> children = new LinkedList<GeneralTreeViejo<Integer>>();
		GeneralTreeViejo<Integer> a = new GeneralTreeViejo<Integer>(0, children);

		GeneralTreeViejo<Integer> h1 = new GeneralTreeViejo<Integer>(1);
		
		List<GeneralTreeViejo<Integer>> children2 = new LinkedList<GeneralTreeViejo<Integer>>();
		GeneralTreeViejo<Integer> h2 = new GeneralTreeViejo<Integer>(2, children2);
		
		List<GeneralTreeViejo<Integer>> children3 = new LinkedList<GeneralTreeViejo<Integer>>();
		GeneralTreeViejo<Integer> h3 = new GeneralTreeViejo<Integer>(3, children3);
		
		children.add(h1);children.add(h2);children.add(h3);
		
		List<GeneralTreeViejo<Integer>> children31 = new LinkedList<GeneralTreeViejo<Integer>>();
		GeneralTreeViejo<Integer> h31 = new GeneralTreeViejo<Integer>(31, children31);
		children31.add(new GeneralTreeViejo<Integer>(10));
		children31.add(new GeneralTreeViejo<Integer>(15));
		children31.add(new GeneralTreeViejo<Integer>(99));
		
		children2.add(new GeneralTreeViejo<Integer>(21));
		children2.add(new GeneralTreeViejo<Integer>(22));
		children2.add(new GeneralTreeViejo<Integer>(23));
		
		children3.add(h31);
		children3.add(new GeneralTreeViejo<Integer>(32));

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
	public static GeneralTreeViejo<Integer> aGeneralAbeto () {
		
		List<GeneralTreeViejo<Integer>> children = new LinkedList<GeneralTreeViejo<Integer>>();
		GeneralTreeViejo<Integer> a = new GeneralTreeViejo<Integer>(0, children);

		GeneralTreeViejo<Integer> h1 = new GeneralTreeViejo<Integer>(1);
		
		List<GeneralTreeViejo<Integer>> children2 = new LinkedList<GeneralTreeViejo<Integer>>();
		GeneralTreeViejo<Integer> h2 = new GeneralTreeViejo<Integer>(2, children2);
		
		List<GeneralTreeViejo<Integer>> children3 = new LinkedList<GeneralTreeViejo<Integer>>();
		GeneralTreeViejo<Integer> h3 = new GeneralTreeViejo<Integer>(3, children3);
		
		children.add(h1);children.add(h2);children.add(h3);
		children.add(new GeneralTreeViejo<Integer>(4));
		children.add(new GeneralTreeViejo<Integer>(5));
		
		List<GeneralTreeViejo<Integer>> children31 = new LinkedList<GeneralTreeViejo<Integer>>();
		GeneralTreeViejo<Integer> h31 = new GeneralTreeViejo<Integer>(31, children31);
		children31.add(new GeneralTreeViejo<Integer>(10));
		children31.add(new GeneralTreeViejo<Integer>(15));
		children31.add(new GeneralTreeViejo<Integer>(99));
		
		children2.add(new GeneralTreeViejo<Integer>(21));
		children2.add(new GeneralTreeViejo<Integer>(22));
		children2.add(new GeneralTreeViejo<Integer>(23));
		
		children3.add(h31);
		children3.add(new GeneralTreeViejo<Integer>(32));
		children3.add(new GeneralTreeViejo<Integer>(33));
		children3.add(new GeneralTreeViejo<Integer>(34));

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
	public static GeneralTreeViejo<Integer> aDeSeleccion () {
		
		List<GeneralTreeViejo<Integer>> children = new LinkedList<GeneralTreeViejo<Integer>>();
		GeneralTreeViejo<Integer> a = new GeneralTreeViejo<Integer>(0, children);

		GeneralTreeViejo<Integer> h1 = new GeneralTreeViejo<Integer>(1);
		
		List<GeneralTreeViejo<Integer>> children2 = new LinkedList<GeneralTreeViejo<Integer>>();
		GeneralTreeViejo<Integer> h2 = new GeneralTreeViejo<Integer>(2, children2);
		
		List<GeneralTreeViejo<Integer>> children3 = new LinkedList<GeneralTreeViejo<Integer>>();
		GeneralTreeViejo<Integer> h3 = new GeneralTreeViejo<Integer>(0, children3);
		
		children.add(h1);children.add(h2);children.add(h3);
		
		List<GeneralTreeViejo<Integer>> children31 = new LinkedList<GeneralTreeViejo<Integer>>();
		GeneralTreeViejo<Integer> h31 = new GeneralTreeViejo<Integer>(0, children31);
		children31.add(new GeneralTreeViejo<Integer>(10));
		children31.add(new GeneralTreeViejo<Integer>(15));
		children31.add(new GeneralTreeViejo<Integer>(0));
		
		children2.add(new GeneralTreeViejo<Integer>(2));
		children2.add(new GeneralTreeViejo<Integer>(22));
		children2.add(new GeneralTreeViejo<Integer>(23));
		
		children3.add(h31);
		children3.add(new GeneralTreeViejo<Integer>(32));

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
	public static GeneralTreeViejo<Integer> aDeCerosYUnos () {
		
		List<GeneralTreeViejo<Integer>> children = new LinkedList<GeneralTreeViejo<Integer>>();
		GeneralTreeViejo<Integer> a = new GeneralTreeViejo<Integer>(0, children);

		GeneralTreeViejo<Integer> h1 = new GeneralTreeViejo<Integer>(1);
		
		List<GeneralTreeViejo<Integer>> children2 = new LinkedList<GeneralTreeViejo<Integer>>();
		GeneralTreeViejo<Integer> h2 = new GeneralTreeViejo<Integer>(1, children2);
		
		List<GeneralTreeViejo<Integer>> children3 = new LinkedList<GeneralTreeViejo<Integer>>();
		GeneralTreeViejo<Integer> h3 = new GeneralTreeViejo<Integer>(1, children3);
		
		children.add(h1);children.add(h2);children.add(h3);
		
		List<GeneralTreeViejo<Integer>> children31 = new LinkedList<GeneralTreeViejo<Integer>>();
		GeneralTreeViejo<Integer> h31 = new GeneralTreeViejo<Integer>(1, children31);
		children31.add(new GeneralTreeViejo<Integer>(1));
		children31.add(new GeneralTreeViejo<Integer>(1));
		children31.add(new GeneralTreeViejo<Integer>(0));
		
		children2.add(new GeneralTreeViejo<Integer>(1));
		children2.add(new GeneralTreeViejo<Integer>(0));
		children2.add(new GeneralTreeViejo<Integer>(0));
		
		children3.add(h31);
		children3.add(new GeneralTreeViejo<Integer>(1));

		return a;
	}
}

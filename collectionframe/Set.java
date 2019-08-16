package collectionframe;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		
		//Random order
		HashSet<Character> alphabet=new HashSet<Character>();
		alphabet.add('D');
		alphabet.add('J');
		alphabet.add('R');
		alphabet.add('H');
		alphabet.add('V');
		alphabet.add('R');

		System.out.println(alphabet);

		//Insertion order
		LinkedHashSet<Character> alph=new LinkedHashSet<Character>();
		alph.add('D');
		alph.add('J');
		alph.add('R');
		alph.add('H');
		alph.add('V');
		alph.add('R');

		System.out.println(alph);
		
		//Ascending Order
		TreeSet<Character> alpha=new TreeSet<Character>();
		alpha.add('D');
		alpha.add('J');
		alpha.add('R');
		alpha.add('H');
		alpha.add('V');
		alpha.add('R');

		System.out.println(alpha);
	    System.out.println(alpha.descendingSet());
		}

}

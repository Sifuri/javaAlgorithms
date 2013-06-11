import javax.swing.JOptionPane;

/**@author Lemuel M. Uhuru
 * @Date   June 10, 2013
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 189 Problem 7: Sorted Names
 * 
 * @Description Write a program that asks the user to enter three names,
 * and then displays the names sorted in ascending order.
 */


public class SortedNames {

	public static void main(String[] args) {
		// Declare 3 string variables to hold three names
		String name1,
		       name2,
		       name3;
		
		// Prompt user for 3 names
		name1 = JOptionPane.showInputDialog("Enter the first name");
		name2 = JOptionPane.showInputDialog("Enter the second name");
		name3 = JOptionPane.showInputDialog("Enter the third name");
		
		// Design decision structure to sort and display
		// the set of names in ascending order.
		
			if(name1.compareTo(name2) < 0 & name1.compareTo(name3) < 0)
				if(name2.compareTo(name3) < 0)
					JOptionPane.showMessageDialog(null, name1 + ", " + name2 + ", " + name3 );
				else
					JOptionPane.showMessageDialog(null, name1 + ", " + name3 + ", " + name2 );
			else if(name2.compareTo(name1) < 0 & name2.compareTo(name3) < 0)
				if(name1.compareTo(name3)<0)
					JOptionPane.showMessageDialog(null, name2 + ", " + name1 + ", " + name3 );
				else
					JOptionPane.showMessageDialog(null, name2 + ", " + name3 + ", " + name1 );
			else if (name3.compareTo(name2) < 0 & name3.compareTo(name1) < 0)
				if(name2.compareTo(name1) < 0)
					JOptionPane.showMessageDialog(null, name3 + ", " + name2 + ", " + name1 );
				else
					JOptionPane.showMessageDialog(null, name3 + ", " + name1 + ", " + name2 );			
	}
}

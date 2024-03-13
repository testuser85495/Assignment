/*W.A.J.P to check whether a given string starts with the contents of another string. 
Red is favorite color. Starts with Red? True Orange is also my favorite color. Starts 
with Red? False I3*/

package CoreJava_assign;

public class Q_17_red {

	public static void main(String[] args) {
		String str1 = "Red is favorite color.";
		
        String str2 = "Orange is also my favorite color.";
        
        String str = "Red";
        
       
        
        System.out.println(str1 + " starts with " +
        		str + "? "+str1.startsWith(str));
        System.out.println(str2 + " starts with " +
        		str + "? "+str2.startsWith(str));
        
	}

}

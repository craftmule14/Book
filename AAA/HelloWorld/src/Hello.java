import java.util.HashMap;
import java.util.Map.Entry;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
        hm.put(0, "first name");
        hm.put(1, "last name");
        hm.put(2, "gender");
        hm.put(3,"age");
        System.out.println(hm);
        System.out.println(hm.get(0));
       for(Entry M: hm.entrySet())
        {
       	 System.out.println(M.getKey() +"   "+M.getValue());
       }
        

	}

}

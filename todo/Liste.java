package todo;


import java.util.*;



public class Liste {
	
	private ArrayList<String> theList;
		
	public Liste()
	{
		theList = new ArrayList<String>();	
		
	}
	
	public void add(String activity)
	  {
	    theList.add(activity);
	  }

	  public void done(String chaussure)
	  {
	    theList.remove(chaussure);
	  }

}
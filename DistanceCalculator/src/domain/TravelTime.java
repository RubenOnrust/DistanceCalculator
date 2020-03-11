package domain;

public class TravelTime {
	public String time;
    private static TravelTime single_instance = null; 
    
    private TravelTime() 
    {  
    } 
  
    public static TravelTime getInstance() 
    { 
        if (single_instance == null) 
            single_instance = new TravelTime(); 
  
        return single_instance; 
    }
	
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
}

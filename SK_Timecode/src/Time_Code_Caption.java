
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.sql.Time;

// Array<Time_Code_Caption> time_code_caption;


public class Time_Code_Caption {	

	int eventIndex = 0;
	
	ArrayList<TimeCode> events = new ArrayList<TimeCode>();
	
	class TimeCode
	{		
		int 	eventID;
		long 	startTime;
//		int 	startFrame;
		
		long 	endTime;
//		int 	endFrame;
		
		String 	caption;
		String 	uri;
		
		public int getEventID() {
			return eventID;
		}
		public void setEventID(int eventID) {
			this.eventID = eventID;
		}
		public long getStartTime() {
			return startTime;
		}
		public void setStartTime(long startTime) {
			this.startTime = startTime;
		}
		public long getEndTime() {
			return endTime;
		}
		public void setEndTime(long endTime) {
			this.endTime = endTime;
		}
		public String getCaption() {
			return caption;
		}
		public void setCaption(String caption) {
			this.caption = caption;
		}
		public String getUri() {
			return uri;
		}
		public void setUri(String uri) {
			this.uri = uri;
		}
		
		String toStringTimeCode()
		{
			return  getEventID() + " " + 
					getStartTime() + "."  + 
					getEndTime() + "." +  
					getCaption();
		}
		
		TimeCode(String eventId , long startTime, long endTime, String caption)
		{
			setEventID(Integer.parseInt(eventId));
			setStartTime(startTime);
			setEndTime(	endTime);
			setCaption(caption);
			System.out.println(this.toStringTimeCode());
		}
		
	}
final long ONE_SECOND = 1000;
final long ONE_MINUTE = ONE_SECOND * 60;
final long ONE_HOUR   = ONE_MINUTE * 60;
	long timeToLong(String timeString)
	{
		long value = 0;
		String hours = timeString.substring(0,1);
		String minutes = timeString.substring(3,4);
		String seconds = timeString.substring(6,7);
		String milliSeconds = timeString.substring(9);
		
		value = Integer.parseInt(hours) * ONE_HOUR;
		value += Integer.parseInt(minutes) * ONE_MINUTE;
		value += Integer.parseInt(seconds) * ONE_SECOND;
		value += Integer.parseInt(milliSeconds) ;
		return value;
	}
	void parseLine(String theLine)
	{
//        System.out.println(theLine);

        StringTokenizer st = 
            new StringTokenizer
                (theLine, "\t");
        String eventID=st.nextToken();
//        eventID = eventID.replace("\"", "");
        String startTime=st.nextToken();
        String endTime=st.nextToken();
        String caption=st.nextToken();
        
        TimeCode tc = new TimeCode(eventID, timeToLong(startTime), timeToLong(endTime), caption);
        events.add(tc);
 /*    
     while(st.hasMoreTokens()){
       String s=st.nextToken();
       System.out.print(s);
       System.out.print("\t");
       }	
     System.out.println(); */
	}
	
	void getNextEvent(long time, long offset)
	{
		System.out.println(time + " ---" + offset);
		
		time=time-offset;
		TimeCode nextEvent = events.get(eventIndex);
		long nextTime = nextEvent.getStartTime();
		
		System.out.println(time + " ->" + nextTime);
		if (time>nextTime)
		{
			eventIndex++;
			System.out.println(nextEvent.getEventID() + ":" + nextEvent.getStartTime() + " - " + nextEvent.getCaption());
		}
	}
	void doIt(String filePath)
	{
	       try {
	           FileInputStream fin =  new FileInputStream(filePath);
	           // JDK1.1+
	           String thisLine;
	           BufferedReader myInput = new BufferedReader
	               (new InputStreamReader(fin));
	           while ((thisLine = myInput.readLine()) != null) {  
	              // System.out.println(thisLine);
	              parseLine(thisLine);
	              }
	           }
	        catch (Exception e) {
	          e.printStackTrace();
	          }
			long offsetTime = timeToLong("00:02:20.000");
			
			long nowTime = timeToLong("00:00:00.000");
			
			while (true)
			{
				getNextEvent(nowTime, offsetTime);
				long waitTime = System.currentTimeMillis()+(1000/30);
				while (waitTime>System.currentTimeMillis())
				{
					// nop until 1/30 of a second
				}
				nowTime=nowTime + (1000/30);
			}
	       	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time_Code_Caption tcc = new Time_Code_Caption();
		tcc.doIt("VIDEO_TS.csv");
	}

}

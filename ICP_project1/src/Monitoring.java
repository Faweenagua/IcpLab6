
import java.util.*;




/**
 
 * This class holds information about all observatories
 
 * @author Eugenia Mawuenya AKPO
 
 * @author Michael AGYEMAN-PREMPEH
 
 * @author Issifu ALHASSAN
 
 * @author Francis AWEEENAGUA
 
 * @version 1.0.3
 
 */


public class Monitoring {
	
	private ArrayList<Observatory> observatories = new ArrayList<Observatory>();
	
	
	
	/**
	 
	 * The default Constructor
	 
	 */
	public Monitoring(){}
	
	
	
	/**
	 
	 * getObservatoryWithLargestAverage takes no parameters and returns the largest average recorded amongst the observatories
	 
	 * @return observatory
	 
	 */
	
	private ArrayList<Double> largestAverage=new ArrayList<Double>();
	
	private  double highest=0;
	
	private  Observatory observatory;
	
	public  Observatory getObservatoryWithLargestAverage(){
		
		for(Observatory i: observatories) {
		   
			largestAverage.add(i.averageGalamseyColourValueRecorded());
		   
			for(int j=0;j< largestAverage.size();j++) {if(largestAverage.get(j)>highest) {
				
					highest = largestAverage.get(j);
			   
			}
		   
			if(i.averageGalamseyColourValueRecorded()==highest) { observatory = i;}
		   
			}
		
		}
		
		System.out.println(observatory);
		
		return observatory;
		
	}
	
	
	
	/**
	 
	 * getLargestGalamseyColourValueEverRecorded is a method that returns the largest Galamsey colour value ever recorded
	 
	 * @return largestGalamseyColourValue
	 
	 */
    
	
	private  ArrayList<Integer> list= new ArrayList<Integer>();
	
	private  int largestGalamseyColourValue=0;
	
	public  int getLargestGalamseyColourValueEverRecorded(){
		
		for(Observatory i:observatories) {
			
			list.add(i.largestGalamseyColourValueRecorded());
		
			for (int j=0;j<list.size();j++) {
			
				if(list.get(j) > largestGalamseyColourValue) {
				
					largestGalamseyColourValue=list.get(j);
			
				}
		
			}

     
		}
		
		System.out.println(largestGalamseyColourValue);
	    
		return largestGalamseyColourValue;	   
	
	}
	
	
	
	/**
	 
	 * This method returns a list of all Galamsey whose vegetation colour value is greater than some arbitrary constant
	 
	 * @param number
	 
	 * @return List
	 
	 */
   
	
	public ArrayList<Galamsey> ListOfGalamseysWithColourValueGreaterThan(double number) {
	  ArrayList<Galamsey> List=new ArrayList<Galamsey>(); 
		for(Observatory i: observatories) {
			List.addAll(i.galamseysWithColourValueGreaterThan(number));
             }
		System.out.println(List);
	    	   return List;
	       
	}
	/**
	 
	 * This method returns a list of all Galamsey whose vegetation colour value is lesser than some arbitrary constant
	 
	 * @param number
	 
	 * @return List
	 
	 */
	
	
	public ArrayList<Galamsey> ListOfGalamseysWithColourValueLesserThan(double number) {
		  ArrayList<Galamsey> List=new ArrayList<Galamsey>(); 
			for(Observatory i: observatories) {
				List.addAll(i.galamseysWithColourValueLesserThan(number));
	             }
			System.out.println(List);
		    	   return List;
		       
		}
	
	/**
	 
	 * This method returns a list of all Galamsey whose vegetation colour value is equal to some arbitrary constant
	 
	 * @param number
	 
	 * @return List
	 
	 */
	
	public ArrayList<Galamsey> ListOfGalamseysWithColourValueEqualTo(double number) {
		  ArrayList<Galamsey> List=new ArrayList<Galamsey>(); 
			for(Observatory i: observatories) {
				List.addAll(i.galamseysWithColourValueEqualTo(number));
	             }
			System.out.println(List);
		    	   return List;   
			  
		}
	
	public Observatory observatoryWithFewerEvent(){
		Observatory nob = observatories.get(0);
		int minSize = observatories.get(0).getEvents().size();
		
		for (Observatory o :observatories) {
			if(o.getEvents().size()<minSize) {
				minSize = o.getEvents().size();
				nob = o;
			}
		}
		
		return nob;
	}
	
	public Observatory observatoryWithHigherEvent(){
		Observatory nob = observatories.get(0);
		int maxSize = observatories.get(0).getEvents().size();
		
		for (Observatory o :observatories) {
			if(o.getEvents().size()>maxSize) {
				maxSize = o.getEvents().size();
				nob = o;
			}
		}
		
		return nob;
	}
	
	/**
	 
	 * Operations are executed in the main method
	 
	 * @param args
	
	 */
	
	public static void main(String[] args) {
		Monitoring monitor =new Monitoring();
		
		Galamsey g = new Galamsey ("brown",3);
       
		Galamsey q = new Galamsey ("brown",3);
       
		Galamsey r = new Galamsey ("yellow",2);
       
		Galamsey y = new Galamsey ("green",1);
       
		Galamsey u = new Galamsey ("green",1);
       
		Galamsey p = new Galamsey ("brown",3);
       
		Galamsey a = new Galamsey ("green",1);
      
		Galamsey s = new Galamsey ("yellow",2);
        
		Galamsey d = new Galamsey ("green",1);
       
		Galamsey h = new Galamsey ("brown",3);
      
		ArrayList<Galamsey> events =new ArrayList<Galamsey>();
       
		ArrayList<Galamsey> event =new ArrayList<Galamsey>();
       
		events.add(g);
       
		events.add(q);
      
		events.add(r);
       
		event.add(y);
       
		events.add(u);
       
		event.add(p);
       
		events.add(a);
       
		event.add(s);
      
		events.add(d);
       
		event.add(h);
     
	
       
		Observatory e = new Observatory("force","Ghana",2000, 50000,events);
		
                Observatory t = new Observatory("force2","Togo",3000, 100000,event);
	    
		
		
	        monitor.observatories.add(e);
	   
		monitor.observatories.add(t);
	   
		monitor.getObservatoryWithLargestAverage();
	   
		monitor.getLargestGalamseyColourValueEverRecorded();
	   
		monitor.ListOfGalamseysWithColourValueGreaterThan(0);
		
		monitor.ListOfGalamseysWithColourValueEqualTo(1);
		
		monitor.ListOfGalamseysWithColourValueLesserThan(3);
        
		System.out.println("\nMin events " + monitor.observatoryWithFewerEvent().toString());
		
		System.out.println("\nMax events " + monitor.observatoryWithHigherEvent().toString());
	}
 
}



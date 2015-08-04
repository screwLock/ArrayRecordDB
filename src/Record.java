/***************************************************
 * Class Record used to model Employee Records
 * 3 Properties:  name string
 * 				  id   string
 * 				  double pay
 * 
 * 
 * 2 methods:  toString() method overridden to display Record
 * 			  properties
 * 			   compareTo() method implemented
 * 
 * 
 * @author Travus Helmly
 *
 */////////////////////////////////////////////////////
public class Record implements Comparable<Record>{

	//properties
	public String name ="";
	public String id = "";
	public double pay = 0;
	
	//Single Constructor
	public Record(String name, String id, double pay){
		this.name = name;
		this.id = id;
		this.pay = pay;
	} //end of constructor
	
	public String toString(Record record){
	
		return "Employee Name: " + record.name +
			  " Employee id: "    + record.id +
			  " Employee pay: "   + record.pay;
	
	
	}//end of toString method

	@Override
	public int compareTo(Record record) {
		int idCmp = this.id.compareTo(record.id);
		return idCmp;
	}
	
	
	
} //

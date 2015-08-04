import java.util.Arrays;

/***********************************************
 * Class RecordDB is a database for records.
 * The data structure is (unfortunately) an array
 * 
 * 
 * 
 * @author Travis
 *
 */

public class RecordDB  {
	
	//properties
	private int size=0;
	private Record[] db;
	private int currentIndex = 0;
	private int dbSize = 0;
	
	//single constructor
	public RecordDB(int size){
		
		this.size = size;
		this.db = new Record[size];
	}
	
	//insert() method
	public boolean insert(Record newRecord){
		if(this.isFull()==false){
			System.out.println("Insert cannot be performed");
			return false;
		}
		db[currentIndex] = newRecord;
		currentIndex++;
		dbSize++;
		
		//need to add sort method here after insertion
		
		return true;
	}//end of insert()
	
	//delete() method
	public boolean delete(String id){
		if(this.isEmpty()==false){
			System.out.println("Delete cannot be performed");
			return false;
		}
		
		//use select method hear to find record to delete
		
		dbSize--;
		
		//need to add sort method
		
		return true;
	}//end of delete()
	
	//delete() method
	public boolean delete(double pay){
		if(this.isEmpty()==false){
			System.out.println("Delete cannot be performed");
			return false;
		}

		//use select method hear to find record to delete
		
		dbSize--;
		
		//use sort method here
		
		return true;
	}//end of delete()
	
	
	//select() method
	public Record select(String id){
		Record currentRecord;
		for(int n = 0; n<(dbSize-1);n++){
			currentRecord = db[n];
			if(id.compareTo(currentRecord.id)==0){
				return currentRecord;
			}
		}
		//record could not be found
		//this should be changed to a more useful value
		return null;
	}//end of select() method
	
	
	private boolean isEmpty(){
		if(currentIndex<=0){
			System.out.println("Database is empty");
			return false;
		}
		System.out.println("Database is not empty");
		return true;
		
	}
	
	//isFull() method
	private boolean isFull(){
		if(currentIndex>=size){
			System.out.println("Database is full");
			return false;
		}
		System.out.println("Database is not yet full");
		return true;
	}//end of isFull()


}//class end

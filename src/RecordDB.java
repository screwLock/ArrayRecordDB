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

public class RecordDB implements Comparable<RecordDB> {
	
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
	
	public boolean insert(Record newRecord){
		if(this.isFull()==false){
			System.out.println("Insert cannot be performed");
			return false;
		}
		db[currentIndex] = newRecord;
		currentIndex++;
		dbSize++;
		return true;
	}
	public boolean delete(String id){
		if(this.isEmpty()==false){
			System.out.println("Delete cannot be performed");
			return false;
		}
		dbSize--;
		//Arrays.sort();
		return true;
	}
	
	public boolean delete(double pay){
		if(this.isEmpty()==false){
			System.out.println("Delete cannot be performed");
			return false;
		}
		dbSize--;
		return true;
	}
	
	
	
	public Record search(String id){
		Record currentRecord;
		for(int n = 0; n<(dbSize-1);n++){
			currentRecord = db[n];
			if(id == currentRecord.id){
				return currentRecord;
			}
		}
		//record could not be found
		//this should be changed to a more useful value
		return null;
	}
	
	
	private boolean isEmpty(){
		if(currentIndex<=0){
			System.out.println("Database is empty");
			return false;
		}
		System.out.println("Database is not empty");
		return true;
		
	}
	
	
	private boolean isFull(){
		if(currentIndex>=size){
			System.out.println("Database is full");
			return false;
		}
		System.out.println("Database is not yet full");
		return true;
	}

	@Override
	public int compareTo(RecordDB db) {
		// TODO Auto-generated method stub
		return 0;
	}
}
package docComments;
/**
 * 
 * @author sarah
 *
 */
public class Cameras{
	//Outline the instance variables in doc comments here
	private String name, type, model;
	private int id;
	private static int count = 0; //Initialize at 0

	/**
	 * 
	 * @param name
	 * @param type
	 * @param model
	 */
	//Outline the constructor detail sin doc comments here
	public Cameras(String name, String type,String model) {
		this.name = name;
		this.type = type;
		this.model = model;
		
		id = 123 + count++; 
	}
	
	/**
	 * 
	 * @return name returns the Name of the Camera that the user selects
	 */
	//Outline the getters and seter details in doc comments
	public String getName() {
		return name;
	}
	//each setter
	public void setName(String name) {
		this.name = name;
	}
	//each getter
	public String getType() {
		return type;
	}
	//each setter
	public void setType(String type) {
		this.type = type;
	}
	//each getter
	public String getModel() {
		return model;
	}
	//each setter
	public void setModel(String model) {
		this.model = model;
	}
	//each getter
	public int getId() {
		return id;
	}
	//each setter
	public void setId(int id) {
		this.id = id;
	}
	
	//Outline the string representation of the objects in doc comments and override config
	@Override
	
	public String toString() {
		return ",Name: " +name+
				",Type: "+type+
				",Model: "+model
				",ID: "+id+; //Not sure I need this?? 
	}
	
}



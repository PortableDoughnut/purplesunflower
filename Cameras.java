package docComments;

public class Cameras {
    
        private String name, type, model;
        private final int id;
        private static int count = 0;

        /**
         * 
         * @param name
         * name of the camera
         * @param type
         * type of the camera
         * @param model
         * model of the camera
         */
        public Cameras(String name, String type, String model) {

            this.name = name;
            this.type = type;
            this.model = model;
            
            id = 1000000 + count++; 

        }
        
        /**
         * Returns name type and model of the camera in string form
         */
        public String toString() {
        	return this.name + " " + this.type + " " + this.model;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getId() {
            return id;
        }

}

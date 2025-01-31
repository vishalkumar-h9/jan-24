
public class Car {

	
		private String model;
		private String name;
		private String price;
		public Car(String model, String name, String price) {
			super();
			this.model = model;
			this.name = name;
			this.price = price;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPrice() {
			return price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "Car [model=" + model + ", name=" + name + ", price=" + price + "]";
		}

	

}


public class Hospital {

	
		private String name;
		private String address;
		private String phno;
		public Hospital(String name, String address, String phno) {
			super();
			this.name = name;
			this.address = address;
			this.phno = phno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPhno() {
			return phno;
		}
		public void setPhno(String phno) {
			this.phno = phno;   
		}
		@Override
		public String toString() {
			return "Hospital [name=" + name + ", address=" + address + ", phno=" + phno + "]";
		}

	}




public class College {

	
		private String id;
		private String name;
		private String rollno;
		private int marks;
		public College(String id, String name, String rollno, int marks) {
			super();
			this.id = id;
			this.name = name;
			this.rollno = rollno;
			this.marks = marks;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getRollno() {
			return rollno;
		}
		public void setRollno(String rollno) {
			this.rollno = rollno;
		}
		public int getMarks() {
			return marks;
		}
		public void setMarks(int marks) {
			this.marks = marks;
		}
		@Override
		public String toString() {
			return "College [id=" + id + ", name=" + name + ", rollno=" + rollno + ", marks=" + marks + "]";
		}
		
		 

	}



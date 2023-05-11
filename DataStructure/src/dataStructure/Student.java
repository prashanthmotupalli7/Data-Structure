package dataStructure;

import java.util.HashMap;
import java.util.Objects;

public class Student {
	
		
		public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		int id;
		String name;
		
	

@Override
		public int hashCode() {
			return Objects.hash(id, name);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			return id == other.id && Objects.equals(name, other.name);
		}
public static void main(String[] args) {
	
Student s1= new Student();
s1.setId(100);
s1.setName("ravi");

Student s2= new Student();
s2.setId(101);
s2.setName("devi");

HashMap<Integer, Object> hm=new HashMap<>();
hm.put(1, s1);
hm.put(1,s2);
System.out.println("Hash Map Size "+hm.size());


}
}


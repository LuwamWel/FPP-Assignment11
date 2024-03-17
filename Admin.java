package prob1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
		HashMap<Key, Student> myHashMap = new HashMap<>();
		//students.
		for (Student student: students) {
			Key key = new Key(student.getFirstName(), student.getLastName());
			myHashMap.put(key,student);
		}
		return myHashMap;
	}
	public static double computeAverageGPA(HashMap<Key,Student> maps){
		//implement
		int numOfStudents = maps.size();
		double sumOfAllStudentsGpa = 0.0;
		double averageGpa = 0.0;
		for (Student student: maps.values()) {
			sumOfAllStudentsGpa += student.getGpa();
		}
		averageGpa = sumOfAllStudentsGpa / numOfStudents;
		return averageGpa;
}
}

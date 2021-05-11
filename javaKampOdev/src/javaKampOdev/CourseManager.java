package javaKampOdev;

public class CourseManager {
	public void addCourse(Course course) {
 		System.out.println("Kurs eklendi: " + course.name);
	}
	
	public void removeCourse(Course course) {
		System.out.println("Kurs silindi: " + course.name);

	}
	public void updateCourse(Course course) {
		System.out.println("Kurs güncellendi: " + course.name);

	}

}

package javaKampOdev;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1, "Temel Kurs", "Engin Demiroð", "Programlamaya Giriþ Ýçin Temel Kurs", 0);
		Course course2 = new Course(2, "C# + Angular", "Engin Demiroð", "Yazýlým Geliþtirici Yetiþtirme Kampý", 0);
		Course course3 = new Course(3, "Java+React", "Engin Demiroð", "Yazýlým Geliþtirici Yetiþtirme Kampý", 0);

		Course[] courses = { course1, course2, course3 };

		UserAccount userAccount1 = new UserAccount();
		UserAccount userAccount2 = new UserAccount();

		UserAccount[] userAccount = { userAccount1, userAccount2 };

		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
		courseManager.addCourse(course3);// manager'dan toplu yönetme

		courseManager.removeCourse(course1);
		courseManager.updateCourse(course3);

		// kursa ne ekleyecek?addCourse () içine eklenecek olan data yazýlýr.yoksa
		// addCourse kýzar.

		UserAccountManager userAccountManager = new UserAccountManager();
		userAccountManager.addUserAccount(userAccount1);
		userAccountManager.addUserAccount(userAccount2);
		
		Student student = new Student();
		student.name( );
		student.lastname();
		
		Educator educator = new Educator();
		educator.nationalIdentity();

	}

}

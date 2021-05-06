package javaKampOdev;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"Temel Kurs","Engin Demiro�","Programlamaya Giri� ��in Temel Kurs",0);
		Course course2 = new Course(2, "C# + Angular","Engin Demiro�","Yaz�l�m Geli�tirici Yeti�tirme Kamp�",0);
		Course course3 = new Course (3,"Java+React", "Engin Demiro�","Yaz�l�m Geli�tirici Yeti�tirme Kamp�",0);
		
		Course[] courses = {course1,course2,course3};
		
		UserAccount userAccount1 = new UserAccount("AG�l AS","asya0077@kodlama.io",12345);
	    UserAccount userAccount2 = new UserAccount("�eyma �en","seymasen@kodlama.io",67890);
	    
	    UserAccount[] userAccount = {userAccount1,userAccount2};
	    
	    CourseManager courseManager = new CourseManager();
	    courseManager.addCourse(course1);
	    courseManager.addCourse(course2);
	    courseManager.addCourse(course3);//manager'dan toplu y�netme 
	    
	    //kursa ne ekleyecek?addCourse () i�ine eklenecek olan data yaz�l�r.yoksa addCourse k�zar.
	    
	    UserAccountManager userAccountManager = new UserAccountManager();
	    userAccountManager.addUserAccount(userAccount1);
	    userAccountManager.addUserAccount(userAccount2);
		
	
		
		

	}

}

package hello.JavaStudy;

import classpackage.Child;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaStudyApplication
{
	public static void main(String[] args)
	{
		Child a = new Child();
		boolean booltype = a.ChildPeople();
		System.out.println(booltype);
		SpringApplication.run(JavaStudyApplication.class, args);
	}

}

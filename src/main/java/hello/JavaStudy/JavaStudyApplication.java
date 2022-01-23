package hello.JavaStudy;

import classpackage.Child;
import enumpackage.EnumByte;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaStudyApplication
{
	public static void main(String[] args)
	{
		long test1 = 2222222222222222222L;
		int test2 = (int)test1;

		String test3 = "abc";
		String test4 = "abc";

		boolean test6 = test3.equals(test4);
		boolean test7 = test3 == "abc" ? true : false;
		System.out.println(test6);
		System.out.println(test7);

		System.out.println(test1);
		System.out.println(test2);


		int a = 10;
		float b = 20;
		float c = a + b;

		EnumByte s = EnumByte.A;

		switch(s)
		{
			case A:
				int d = s.GetData();
				break;
			case B:
				break;
			case C:
				break;
		}

		//Child a = new Child();
		//boolean booltype = a.ChildPeople();
		//System.out.println(booltype);
		SpringApplication.run(JavaStudyApplication.class, args);
	}

}

package hello.JavaStudy;

import hello.JavaStudy.StandardJava.StandardJava;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaStudyApplication
{
	public static void main(String[] args)
	{
		//configue를 별도로 생성해 준다는 항목이 있는데, 그거 맞는거야 ?...
		StandardJava standardJava = new StandardJava();
		standardJava.Update();



		SpringApplication.run(JavaStudyApplication.class, args);
	}

}

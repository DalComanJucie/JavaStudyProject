package hello.JavaStudy;

import hello.JavaStudy.StandardJava.Collection;
import hello.JavaStudy.StandardJava.StandardJava;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class JavaStudyApplication
{
	public static void main(String[] args)
	{
		Collection collection = new Collection();
		collection.Update();


		//configue를 별도로 생성해 준다는 항목이 있는데, 그거 맞는거야 ?...
		StandardJava standardJava = new StandardJava();
		standardJava.Update();

		try
		{
			Exception a = new Exception("This Count is Must Level 1");
			throw a;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

		try{
			RuntimeException ex = new RuntimeException("This Value is Very Fool");
			throw ex;
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

		System.out.println("why not finish");

		String a = " 232323";
		a += "232323232";
		a = "232323";

//		Math.abs();
//		//Math, strictMath...
//		StrictMath.abs();

		Random rand = new Random();
		Random rand2 = new Random();

		System.out.println("=====================");

		for(int i = 0 ; i < 5; ++i)
		{
			int randomcount = rand.nextInt(1000);
			System.out.println(randomcount);
		}

		for(int i = 0 ; i < 5; ++i)
		{
			int randomcount = rand2.nextInt(1000);
			System.out.println(randomcount);
		}


		System.out.println("=====================");

		SpringApplication.run(JavaStudyApplication.class, args);
	}

}

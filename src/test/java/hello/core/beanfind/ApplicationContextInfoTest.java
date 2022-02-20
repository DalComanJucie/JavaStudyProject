package hello.core.beanfind;

import hello.core.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextInfoTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("모든 빈 출력하기")
    void findAllBean() {

        String[] beanDefinitionName = ac.getBeanDefinitionNames();
        for(String beanDifinitionName : beanDefinitionName)
        {
            Object bean = ac.getBean(beanDifinitionName);
            System.out.println("name = " + beanDifinitionName + " object= " + bean);
        }
    }

    @Test
    @DisplayName("애플리케이션 빈 출력하기")
    void findApplicationBean() {

        String[] beanDefinitionName = ac.getBeanDefinitionNames();
        for(String beanDifinitionName : beanDefinitionName)
        {
            //어떤 빈이 등록되었는지 확인 가능하다.
            BeanDefinition beanDefinition = ac.getBeanDefinition(beanDifinitionName);
            if(beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION){
                Object bean = ac.getBean(beanDifinitionName);
                System.out.println("name = " + beanDifinitionName + " object= " + bean);
            }

        }
    }

}

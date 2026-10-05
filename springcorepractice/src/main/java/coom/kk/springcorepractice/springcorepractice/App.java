package coom.kk.springcorepractice.springcorepractice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
 //       System.out.println( "Hello World!" );
        
        BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("com/main/resource/application-context.xml"));
        
      Vehicle vh  = (Vehicle) beanFactory.getBean("citroen");
       System.out.println("");
       vh.display();
    }
}

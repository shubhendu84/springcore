package coom.kk.springDIIntf;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.kk.beans.Radio;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("application-context.xml"));
    
    
    Radio radio = (Radio) beanFactory.getBean("radio");
    radio.listen();
    }
}

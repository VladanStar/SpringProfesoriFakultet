import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		
		Profesor profesor1 = (Profesor)context.getBean("pera");
				System.out.println(profesor1.toString());
				Profesor profesor2 = (Profesor)context.getBean("mara");
				System.out.println(profesor2.toString());
		
		((FileSystemXmlApplicationContext)context).close();

	}

}

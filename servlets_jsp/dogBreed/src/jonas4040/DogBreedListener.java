package jonas4040;

import jakarta.servlet.*;

//import jakarta.servlet.ServletContextListener;

public class DogBreedListener implements ServletContextListener{
	@Override
	public void contextInitialized(ServletContextEvent evt){
		ServletContext svlCtx = evt.getServletContext();
		String dogBreed = svlCtx.getInitParameter("breed");
		Dog d=new Dog(dogBreed);
		svlCtx.setAttribute("dog",d);
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent evt){
	
	}
}

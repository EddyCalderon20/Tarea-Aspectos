import java.io.File;
import java.util.EventListener;

public aspect email {
    private String email ="tareaobserver@espol.edu.ec";
    File file = new File("log.txt");
  
    pointcut log() : call(* changeColor(..) );
    after() : log() {
    	  Object[] args = thisJoinPoint.getArgs();
          String mensaje="COLOR CHANGED TO "+args[0];
  
        System.out.println("Email to " + email + ": Someone has performed " + mensaje + " operation with the following file: " + file.getName());
    
    }
}
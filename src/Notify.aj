import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

public aspect Notify{
	File file = new File("log.txt");
	pointcut log() : call(* changeColor(..) );
    after() : log() {
    	
    	Calendar cal = Calendar.getInstance();
        int hora =cal.get(Calendar.HOUR_OF_DAY);
        int minutos = cal.get(Calendar.MINUTE);
        int segundos = cal.get(Calendar.SECOND);
        Object[] args = thisJoinPoint.getArgs();
        String mensaje="COLOR CHANGED TO "+args[0];
        
        try {
    		FileWriter fr = new FileWriter(file,true);
			PrintWriter wr = new PrintWriter(fr);
			wr.append("\n "+mensaje+" Hora->"+ hora + ":" + minutos + ":" + segundos);
			wr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	System.out.println("\n "+mensaje+" Hora->"+ hora + ":" + minutos + ":" + segundos);
    }
	
}
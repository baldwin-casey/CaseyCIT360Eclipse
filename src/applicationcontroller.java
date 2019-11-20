import java.util.HashMap;

public class applicationcontroller {
	public HashMap<String, handler> applicationhandlermap = new HashMap();
	
    public void handleRequest(String command, HashMap<String,Object> data){
        handler aCommandHandler = applicationhandlermap.get(command);
        if (aCommandHandler != null){
            aCommandHandler.handleIt(data);
        }
    }
    //https://github.com/Langston-Ben/cit360/blob/master/AppContPatt/src/appcontpatt/AppController.java

    public void mapCommand(String aCommand, handler acHandler){
    	applicationhandlermap.put(aCommand,acHandler);
    }
}


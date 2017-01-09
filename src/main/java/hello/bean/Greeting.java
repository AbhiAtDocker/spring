package hello.bean;

public class Greeting {
    
    private  long id;
    private  String message;
    
    public Greeting(long id, String message){
        this.id =id;
        this.message=message;
        
    }
    
    public String getMessage(){
        return this.message;
    }
    
    
    public void setMessage(String message){
        this.message = message;
    }
 
 
 
    public long getId(){
        return this.id;
    }
    
    
    public void setId(long id){
        this.id = id;
    }
}

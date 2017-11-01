package in.vamsoft.training.employee;

public class Samplestaticmethod {
  
  private static Samplestaticmethod Samplestaticmethod;
  private Samplestaticmethod(){
    
  }
  public static Samplestaticmethod getInstance() {
    if(Samplestaticmethod==null)
    {
      Samplestaticmethod =new Samplestaticmethod();
    }
    return Samplestaticmethod;
  }
  public void display() {
   
  }

}

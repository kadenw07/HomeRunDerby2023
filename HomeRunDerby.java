/** 
 * represents a home run derby that is an 
 * event where a batter hits a ball thrown 
 * by the pitcher and tries to hit a home run.
 */

public class HomeRunDerby {

  /* Variables */

  private Pitcher pitcher;
  private Batter batter;
  private int pitchNumber;

  /* Constructor(s) */

  /**
   *
   * Constructs a new HomeRunDerby object that represents a home run derby 
   * that is an event where a batter hits a ball thrown by the pitcher and 
   * tries to hit a home run. A pitcher and batter object must be supplied 
   * as arguments. 
   * 
   * @param Pitcher _pitcher   A pitcher object
   * @param Batter _batter   A batter object
   *
   */
  public HomeRunDerby(Pitcher _pitcher, Batter _batter) {

    this.pitcher = new Pitcher(_pitcher.getName());
    this.batter = new Batter(_batter.getName());
    this.pitchNumber = 0;
    
  }
  

  /* Methods */
  
  /** void nextPitch()
  * increments pitchNumber & moves the pitchers and batters to the next pitch/swing.
  */
  public void nextPitch(){
    pitchNumber++;
    pitcher.nextPitch();
    batter.nextSwing();
  }






}


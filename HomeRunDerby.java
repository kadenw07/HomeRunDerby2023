/** void nextPitch()
  * increments pitchNumber & moves the pitchers and batters to the next pitch/swing.
  */
void nextPitch(){
  pitchNumber++;
  pitcher.nextPitch();
  batter.nextSwing();
}
  

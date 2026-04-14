package lektion16;

public class Brett
{
  boolean[][] brett = new boolean[8][8];
  
  public Brett()
  {
    
  }
  
  public void markiereFeld(int x, int y)
  {
    brett[x-1][y-1] = true;
  }
  
  public boolean gibFeld(int x, int y)
  {
    return brett[x-1][y-1];
  }

  public Brett kombiniere(Brett brett){
    Brett kombiniertesBrett = new Brett();
    for (int j = 1; j <= 8; j++)
    {
      for (int i = 1; i <= 8; i++)
      {
          if (brett.gibFeld(j,i)) {
              kombiniertesBrett.markiereFeld(j, i);
          } else if (this.gibFeld(j, i)) {
              kombiniertesBrett.markiereFeld(j, i);
          }
      }
    }
    return kombiniertesBrett;
  }
  
}

int aposx = 70;
int aposy = 85; 
int acceleration = 2;
void setup()
{
  size(225, 225);
  PImage catPic = loadImage("imgres.jpg");
  background(catPic);
}
void draw()
{
ellipse(aposx, aposy, 20, 20);
fill(250, 0, 0);
}
void keyPressed() 
{
aposx+=acceleration-=2;
aposy+=acceleration+=2;
}
void noStroke()
{

}

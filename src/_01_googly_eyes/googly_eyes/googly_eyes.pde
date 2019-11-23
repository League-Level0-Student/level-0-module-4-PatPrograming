
PImage face;
void setup() {
 face = loadImage("TrumpGod.jpg");
  size(800,600);
    face.resize(width,height);

}

void draw() {
      background(face);
  if(mouseX>420){
   mouseX=420;
  }
   if(mouseX<380){
   mouseX=380;
  }
    if(mouseY<140){
   mouseY=140;
  }
    if(mouseY>170){
   mouseY=165;
  }
  fill(#FFFFFF);
  ellipse(400, 150, 60, 60);
  fill(#000000);
  ellipse(mouseX, mouseY, 20, 20);
  fill(#FFFFFF);
  ellipse(500, 150, 60, 60);
  fill(#000000);
  ellipse(mouseX+100, mouseY, 20, 20);
}

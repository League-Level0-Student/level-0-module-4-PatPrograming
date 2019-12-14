PImage creeper;
int x=20;
int y=40;
void setup() {
  size(500, 500);
  PImage minecraft = loadImage("minecraft.png");     //in setup method
minecraft.resize(500, 500);          //in setup method
background(minecraft);          //in setup method
creeper=loadImage("creeper.png");
creeper.resize(10, 10);
}

void draw() {
  image(creeper, x, y);
  if (mousePressed){
    fill(#FF3B3B);
   ellipse(mouseX, mouseY, 10,10) ;
  }
  if (isNear(mouseX, x)){
    fill(#19E50C);
    ellipse(mouseX, mouseY, 10,10) ;
    println("You found the creeper!");
  }
  if (isNear(mouseY, y)){
    fill(#19E50C);
    ellipse(mouseX, mouseY, 10,10) ;
    println("You found the creeper!");
  }
}
boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}

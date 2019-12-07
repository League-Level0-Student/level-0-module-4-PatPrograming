PImage creeper;
void setup() {
  size(500, 500);
  PImage minecraft = loadImage("minecraft.png");     //in setup method
minecraft.resize(500, 500);          //in setup method
background(minecraft);          //in setup method
creeper=loadImage("creeper.png");
creeper.resize(10, 10);
}

void draw() {
  image(creeper, mouseX, mouseY);
}

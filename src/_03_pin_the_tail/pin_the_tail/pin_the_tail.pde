PImage donkey;
PImage tail;
void setup() {
size(550,406);
donkey = loadImage("donkey.jpg");      //change the file name if you need to
tail = loadImage("tail.png");      //change the file name if you need to
tail.resize(100, 100);
}

void draw() {
  background (donkey);
  rect(0, 0, 30, 30);
  rect(454, 75, 40, 40);
image(tail, mouseX-10, mouseY-20);
if(dist(0, 0, mouseX, mouseY) < 30){
 background(#FFEDED); 
}

}

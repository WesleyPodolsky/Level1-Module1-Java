
float birdX = 100;
float birdY = 200;
float birdVel = 0;

float pipeX = 400;
float pipeY = 0;
float pipeDist = 80;


boolean gameRunning = false;

void setup(){
   size(600,400);
   

}

void draw(){
  background(220,240,255);
  
  //bird draw
  fill(250,250,20);
  ellipse(birdX, birdY, 30, 30); 
  
  //pipe draw
  fill(0,200,0);
  rect(pipeX, pipeY-pipeDist-250-30, 50,500);
  rect(pipeX, pipeY+pipeDist+250-30, 50,500);
  
  //falling stuff
  if(gameRunning){
    birdY += birdVel;
    if(birdVel < 5){
      birdVel +=0.15;
    }
  }
  
}

void mousePressed(){
 if(!gameRunning){ gameRunning = true; }
 
 birdVel = -3;
 
}
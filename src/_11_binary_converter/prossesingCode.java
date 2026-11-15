import java.util.Random;

float birdX = 100;
float birdY = 200;
float birdVel = 0;

float pipeX = 400;
float pipeY = 0;
float pipeDist = 80;
float pipeSpeed = 2;

int pipeCanJump = 0;

boolean gameRunning = false;
boolean gameOver = false;

Random ran = new Random();

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
  //go
  if(gameRunning){
      pipeX -= pipeSpeed;
    if(pipeX<-30){
      if(pipeDist > 50){
      pipeDist -= 1;
      }
      if(pipeSpeed < 10){
      pipeSpeed +=1;
      }
      pipeX = 650;
      pipeY = 0;
      pipeY =+ (ran.nextInt(80) -40);
      
   
      }
//collides
if(pipeX<120&&pipeX>80){
  if(birdY-15<pipeY+250-30-pipeDist||birdY+15>pipeY+250-30+pipeDist){
        System.out.print("pipe: ");
        System.out.println(pipeY+250-30-pipeDist);
        System.out.print("bird: ");
        System.out.println(birdY);
         gameOver=true;
      }}

}  
if(gameOver){
  pipeSpeed = pipeSpeed *0.9;
  
}
}

void mousePressed(){
 if(!gameOver){
 if(!gameRunning){ gameRunning = true; }

 
 birdVel = -3;
 
}}
//1. create an array of ints. don't initialize it yet.
int[] randomInts;

void setup() {
  //2. set the size of your window
  size(500,500);

  //3. initialize your array with the built in width variable
randomInts = new int[width];
  
  //4. initialize the ints in the array with random numbers
  //   from 0 to the built in height variable
  

  //5. call the noStroke() method
  noStroke();
}

void draw() {
  //6. set the background color with background(r, g, b);
background(0,0,0);

  //7. set the color for your graph
fill(255,255,255);

  //8. draw a rectangle for each int in your array.
  //   the x value will be the index of the int
  //   the y value will the height variable
  //   the width is 1
  //   the height is negative the value of the int at that element in the array
for(int i = 0; i < randomInts.length; i++){
  rect(i,height,1,-randomInts[i]);
  }

  //9. call the stepSort method
  stepSort(randomInts);

  //10. extract the code that randomizes the array into a method.
  

  //11. call the method you made in step 10 when the mouse is pressed
  
}

void randomizeIntArray(int[] intArray){
for(int i = 0; i < intArray.length; i++){
  intArray[i] = int(random(height+1));
  }
}

void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}

void mouseClicked(){
randomizeIntArray(randomInts);
}

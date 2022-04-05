class Rectangle {

    constructor(height, width) {
      this.height = height;
      this.width = width;
      Rectangle.prototype.getArea = this.height * this.width;   // Q2 - object programming
    }

}


var  Rect1 = new Rectangle(4, 5);

  Rect1.height = 50 ;                                    // Q3 - object programming  ans should be 200 if height is 50
  console.log("height : " + Rect1.height);
  console.log("width : " + Rect1.width);
  console.log("The area is : " + Rect1.getArea);
  

var Rect2 = new Rectangle(7,10);

  console.log("Height : " + Rect2.height);
  console.log("Width : " + Rect2.width);
  console.log("the area is : " + Rect2.getArea);
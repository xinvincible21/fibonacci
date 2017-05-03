:
object Fibonacci{
  def recursive(i: Int) : Int = {
    if(i == 0){
      0
    }
    else if(i == 1){
      1
    }else{
      recursive(i - 1) + recursive(i - 2)
    }
  }
  
  
def fibIter(prev:Int, current:Int, n:Int):Int = {
    if(n == 0){
    	current
    }
    else {
    	fibIter(current, prev + current, n - 1)
    }
}


def fibWithTailRec(n:Int) = {
    if (n > 1) {
    	fibIter(1, 1, n - 2)
    } else {
    	n
    }
}

  def iterative(i:Int) : Int = {

    var j = 0
    var k = 1
    var l = 0

    if(i == 0){
      l = 0
    }else if(i == 1){
      l = 1
    }else{
      for(e <- 2 to i){
        l = j + k
        j = k
        k = l
      }
    }
    l
  }
}

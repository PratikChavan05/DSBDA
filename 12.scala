:paste
def sort(arr : Array[Int]):Array[Int]={
  val n = arr.length

  for(i<- 0 until n){
    for (j<- 0 until n-i-1){
      if(arr(j)>arr(j+1)){
        val temp = arr(j)
        arr(j) = arr(j+1)
        arr(j+1) = temp
      }
    }
  }
  arr
}


val arr = Array(9 ,5,3,7,3,1)

val sorted = sort(arr)

println("sorted arr:" + sorted.mkString(" ") )
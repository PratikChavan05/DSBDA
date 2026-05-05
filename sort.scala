def bubbleSort(arr: Array[Int]): Array[Int] = {
  val n = arr.length

  for (i <- 0 until n) {
    for (j <- 0 until n - i - 1) {

      if (arr(j) > arr(j + 1)) {
        val temp = arr(j)
        arr(j) = arr(j + 1)
        arr(j + 1) = temp
      }

    }
  }

  arr
}

// Input array
val arr = Array(5, 2, 9, 1, 3)

// Call function
val sorted = bubbleSort(arr)

// Output
println("Sorted Array: " + sorted.mkString(", "))

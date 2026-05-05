
:paste

val text = List(
     "Apache Spark is awesome",
  "Spark makes big data processing easy",
  "Learning Spark with Scala is fun",
  "Scala is a powerful programming language",
  "Big data processing is important",
  "Apache Spark runs on Java and Scala",
  "Data science uses Spark for processing",
  "Spark is fast and easy to learn"
)


val rdd = sc.parallelize(text)

val counts = rdd
    .flatMap(line=>line.split(" "))
    .map(word=>(word ,1))
    .reduceByKey(_ + _)

counts.collect().foreach(println)
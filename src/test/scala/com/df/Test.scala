package com.df

import org.apache.spark.sql.SparkSession

object Test extends App {
  val spark = SparkSession
        .builder()
        .appName("My_app")
        .master("local[*]")
        .getOrCreate()
      spark.sparkContext.setLogLevel("ERROR")


}

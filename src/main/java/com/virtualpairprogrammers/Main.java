package com.virtualpairprogrammers;


import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import scala.Tuple2;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.setProperty("hadoop.home.dir", "C:/Users/siddharth.vaidya/hadoop");

        List<Integer> inputData = List.of(4, 9, 16, 25);

        Logger.getLogger("org.apache").setLevel(Level.WARN);

        SparkConf conf = new SparkConf().setAppName("Starting Spark").setMaster("local[*]");
        /**
         * JavaSparkContext object creates the connection with Spark cluster
         */
        JavaSparkContext sc = new JavaSparkContext(conf);

        JavaRDD<Integer> myRDD = sc.parallelize(inputData);

        //Reduce transform big Datasets  in a single result
        Integer result = myRDD.reduce((value1, value2) -> value1 + value2);

        JavaRDD<Double> sqrtRDD = myRDD.map(value -> Math.sqrt(value));

        //avoid NotSerializableException by coverting RDD to list by using collect() method
        sqrtRDD.collect().forEach(System.out::println);

        //how many elements in sqrtRdd
        System.out.println(sqrtRDD.count());

        //how many elements in sqrtRdd using map and reduce

        JavaRDD<Integer> singleValueRdd = sqrtRDD.map(element -> 1);
        Integer count = singleValueRdd.reduce((value1, value2) -> value1 + value2);

        /*
        SACLA TUPLES
         */

        JavaRDD<Integer> originalIntegers =sc.parallelize(inputData);

        JavaRDD<Tuple2<Integer, Double>> sqrtRDDNew =
                originalIntegers.map(value -> new Tuple2<>(value, Math.sqrt(value)));

        sqrtRDDNew.collect().forEach(System.out::println);

        sc.close();

        //Pair RDDs
        //it contains elemnts in key value pair, thus it has more options for data access and manipulate
        /*List<String> inputDataList = new ArrayList<>();
        inputDataList.add("WARN: Tuesday 4 September 0405");
        inputDataList.add("ERROR: Tuesday 4 September 0408");
        inputDataList.add("FATAL: Wednesday 5 September 1632");
        inputDataList.add("ERROR: Friday 7 September 1854");
        inputDataList.add("WARN: Saturday 8 September 1942");*/

        JavaSparkContext sc2 = new JavaSparkContext(conf);
       /* sc2.parallelize(inputDataList)
                .mapToPair(rawMessage -> new Tuple2<>(rawMessage.split(":")[0], 1L))
                .reduceByKey((value1, value2) -> value1 + value2)
                .collect()
                .forEach(tuple -> System.out.println(tuple._1 + " has " + tuple._2 + " instances"));*/

        //Flat Map
        JavaRDD<String> sentences = sc2.textFile("src/main/resources/subtitles/input.txt");

        JavaRDD<String> words = sentences.flatMap(value -> Arrays.asList(value.split(" ")).iterator());

        System.out.println("----AFTER FILTER-------");
        JavaRDD<String> filterWords = words.filter(word -> word.length() > 1);
        filterWords.collect().forEach(System.out::println);


        //  JavaRDD<Tuple2<String, String>> map = list.map(value -> new Tuple2<String, String>(value, value + "sdd"));
     //   map.collect().forEach(System.out::println);
        sc2.close();




      
        
        





    }
}




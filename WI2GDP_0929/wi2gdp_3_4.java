����   < C  
wi2gdp_3_4  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lwi2gdp_3_4; hf2 (Ljava/lang/String;)V  java/io/BufferedReader  java/io/FileReader
    
     (Ljava/io/Reader;)V	    java/lang/System   out Ljava/io/PrintStream;
   " ! java/lang/String # $ toUpperCase ()Ljava/lang/String;
 & ( ' java/io/PrintStream )  println
  + , $ readLine
  . /  close 1 Ok.
 3 5 4 java/lang/Exception 6  printStackTrace fnev Ljava/lang/String; sor sorid I br Ljava/io/BufferedReader; ee Ljava/lang/Exception; StackMapTable 
SourceFile wi2gdp_3_4.java !               /     *� �    
                               C6� Y� Y+� � :� � ,� � %� *YM���� -� 0� %� 
:� 2�   8 ; 3  
   * 
   	       !  +  0  8  =  B     H    C       C 7 8   
 9 8  (  9 8   @ : ;   $ < =  =  > ?  @   > �           � 	         �         3  A    B
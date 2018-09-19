#!/bin/bash

cd "/Users/koonchua/Documents/Grad School/Data Structures/Labs/lab_4/src"
javac Lab4Main.java
status=$?
if [ status=0 ]
then
	echo "Running Project"
	java Lab4Main input_Ascending50.txt output_Ascending50.txt
	java Lab4Main input_Ascending500.txt output_Ascending500.txt
	java Lab4Main input_Ascending1000.txt output_Ascending1000.txt
	java Lab4Main input_Ascending2000.txt output_Ascending2000.txt
	java Lab4Main input_Ascending5000.txt output_Ascending5000.txt
	java Lab4Main input_Ascending10000.txt output_Ascending10000.txt	
	java Lab4Main input_Ascending20000.txt output_Ascending20000.txt	
	java Lab4Main input_Descending50.txt output_Descending50.txt
	java Lab4Main input_Descending500.txt output_Descending500.txt
	java Lab4Main input_Descending1000.txt output_Descending1000.txt
	java Lab4Main input_Descending2000.txt output_Descending2000.txt
	java Lab4Main input_Descending5000.txt output_Descending5000.txt
	java Lab4Main input_Descending10000.txt output_Descending10000.txt	
	java Lab4Main input_Descending20000.txt output_Descending20000.txt
	java Lab4Main input_Random50.txt output_Random50.txt
	java Lab4Main input_Random500.txt output_Random500.txt
	java Lab4Main input_Random1000.txt output_Random1000.txt
	java Lab4Main input_Random2000.txt output_Random2000.txt
	java Lab4Main input_Random5000.txt output_Random5000.txt
	java Lab4Main input_Random10000.txt output_Random10000.txt	
	java Lab4Main input_Random20000.txt output_Random20000.txt		
	echo "Script End"
else
	echo "Failed to compile"
fi
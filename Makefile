# Bartosz.Sawicki@pw.edu.pl
# 2014-2023

ANTLR=./antlr4-4.9.2-complete.jar

all: generate compile test

generate:
	java -jar $(ANTLR) -o src/main/java/org/example -package org.example Beguage.g4

compile:
	javac -cp $(ANTLR):output:. Main.java

test:
	java -cp $(ANTLR):output:. Main test.x > test.ll
	lli test.ll

clean:
	rm -f test.ll
	rm -f *.class
	rm -rf output


all:
	java -cp jsoup-1.22.2.jar Part1ListLinks.java https://www.hunter.cuny.edu

packaging: clean
	javac -cp jsoup-1.22.2.jar Part1ListLinks.java
	jar cvf Part1ListLinks.jar Part1ListLinks.class

clean:
	rm -f *.class
#!/bin/bash

javac *.java
mv *.class classes/
cd classes
java -cp .:mariadb-java-client-3.3.3.jar Main
cd ..

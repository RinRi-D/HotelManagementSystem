JC = javac

all: Test

Test: ./SSAD/HotelManagementSystem/Test.java
	$(JC) $<

clean:
	rm ./SSAD/HotelManagementSystem/*.class
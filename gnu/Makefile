# Makfile for simple flex/bison implementation

CXX = g++
LEX = flex
YACC = bison

CXXFLAGS = #-W -Wall -Wextra -ansi -g
LDFLAGS =

all: am2t

# generate scanner and parser

parser.cc: parser.yy
	$(YACC) -o parser.cc --defines=parser.h parser.yy

scanner.cc: scanner.l
	$(LEX) -o scanner.cc scanner.l

# compile c++

%.o: %.cc %.cpp
	$(CXX) $(CXXFLAGS) -c $< -o $@

# link executable

am2t: dictionary.o parser.o scanner.o
	$(CXX) $(LDFLAGS) $^ -o $@

clean:
	rm -f am2t *.o parser.cc parser.h scanner.cc

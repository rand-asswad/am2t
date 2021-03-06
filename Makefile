# Makefile for Antlr4 project

# Directories
SRC_DIR = src
OUT_DIR = out
LIB_DIR = lib
GRAM_DIR = grammar

# Program package
PACKAGE = AsciiMath

# Jars
JAR = $(LIB_DIR)/antlr-4.7.2-complete.jar

# Antlr4 command toolkit
ANTLR_GEN = java -cp $(JAR) org.antlr.v4.Tool
AFLAGS = -no-listener -visitor

# Antlr4 command-line options
GEN_DIR = $(SRC_DIR)/$(PACKAGE)/antlr
ANTLR_PKG = $(PACKAGE).antlr
GRAMMAR = AM
GRAM_PATH = $(shell pwd)/$(GRAM_DIR)/$(GRAMMAR).g4

# Main file
JAVA_MAIN = $(SRC_DIR)/$(PACKAGE)/Translator.java

antlr:
	$(ANTLR_GEN) -o $(GEN_DIR) -package $(ANTLR_PKG) $(AFLAGS) -lib $(GRAM_DIR) $(GRAM_PATH)

compile: antlr
	javac -cp $(SRC_DIR):$(JAR) -d $(OUT_DIR) $(JAVA_MAIN)

run: compile
	# shouldn't have a run in makefile
	# java -cp $(OUT_DIR):$(JAR) $(PACKAGE).Translator $(RUN_ARGS)

clean:
	rm -r $(GEN_DIR) $(OUT_DIR)

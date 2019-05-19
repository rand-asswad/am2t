# AsciiMath to TeX

## Setup AM2T

Download ANTLR v4 JAR into `lib/`:

```shell
wget --directory-prefix=lib/ https://www.antlr.org/download/antlr-4.7.2-complete.jar
```

Generate ANTLR classes from grammar and compile AM2T
```shell
make compile
```

## Use AM2T

Create AsciiMath test file:
```shell
mkdir test
echo "e^x = lim_(n->oo) (1+x/n)^n" > test/exp.txt
```

Test program with given file (make sure `am2t` script is executable)
```shell
chmod +x am2t
./am2t -i test/exp.txt
```

This generates latex math `test/exp.katex` and a parsing tree png file `test/exp.png`.

Learn about `am2t` script usage by passing it with the good'ol `-h` argument.

Enjoy!



# AsciiMath to TeX

## How to run

Download ANTLR v4 JAR into `lib/`:

```shell
wget --directory-prefix=lib/ https://www.antlr.org/download/antlr-4.7.2-complete.jar
```

Create AsciiMath test file:
```shell
mkdir test
echo "e^x = lim_(n->oo) (1+x/n)^n > test/example.txt
```

Test program with given file:
```shell
make run test/example.txt
```

Enjoy



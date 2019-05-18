# Résultats

```{bash}
echo "e^x = lim_(n->oo) (1+x/n)^n" > test/exp.txt
./am2t -i test/exp.txt -o test/exp.katex -t test/exp.png
cat test/exp.katex
```

```{r}
str <- read_file("test/exp.katex")
if (is_latex_output()) {
    tex <- paste("$$", str, "$$", sep="")
    asis_output(tex)
} else {
    katex(str)
}
```

![Arbre syntaxique obtenue pour `exp.txt`](../test/exp.png){width=50%}


Essayons avec un autre exemple:

```{bash}
echo "ln(x) = int_1^x 1/t dt" > test/ln.txt
./am2t -i test/ln.txt
cat test/ln.katex
```

```{r, echo=FALSE}
str <- read_file("test/ln.katex")
if (is_latex_output()) {
    tex <- paste("$$", str, "$$", sep="")
    asis_output(tex)
} else {
    katex(str)
}
```

![Arbre syntaxique obtenue pour `ln.txt`](../test/ln.png){width=50%}
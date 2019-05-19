# Résultats

```{bash}
echo "e^x = lim_(n->oo) (1+x/n)^n" > test/exp.txt
./am2t -i test/exp.txt -o test/exp.katex -t test/exp.png
cat test/exp.katex
```
`r render_katex("test/exp.katex")`

![Arbre syntaxique obtenue pour `exp.txt`](../test/exp.png){width=50%}

Essayons avec un autre exemple:

```{bash}
echo "ln(x) = int_1^x 1/t dt" > test/ln.txt
./am2t -i test/ln.txt
cat test/ln.katex
```
`r render_katex("test/ln.katex")`

![Arbre syntaxique obtenue pour `ln.txt`](../test/ln.png){width=50%}

Essayons avec un autre exemple:

```{bash}
./am2t -i test/myth.txt
cat test/myth.katex
```
`r render_katex("test/myth.katex")`

![Arbre syntaxique obtenue pour `myth.txt`](../test/myth.png){width=50%}



Prenons maintenant un exemple plus complexe

```{bash}
cat test/poisson.txt
```

Voici ce que ça donne en LaTeX.
```{bash}
./am2t -i test/poisson.txt
cat test/poisson.katex
```
`r render_katex("test/poisson.katex")`

# Implémentation

## Choix du langage

Une implémentation d'un interpréteur dépend principalement de deux outils:

- **Scanner:** Un programme qui reconnait les symboles terminaux dans un texte donné. Le code définit les symboles de la grammaire.
- **Parser:** Un programme qui analyse le syntaxe d'un texte donné. Le code définit les règles de la grammaire.

On parle souvent de couple *Scanner/Parser*, les couples d'analyse syntaxique les plus établis sont lex/yacc et leurs équivalents libres flex/bison.

Nous ne sommes lancé sur l'implémentation sur flex/bison.
Néanmoins, les parseurs générés par bison (et yacc) sont des *parseurs syntaxique __ascendant__* (bottom-up parsing)
donc la règle *mère* menant à une règle *fille* n'est pas connue lorsque l'analyse de la dernière,
ce qui nous a empéché d'implémenter le comportement de la règle $s\to LeR$ en fonction de sa règle mère.

Nous avons donc décidé d'implémenter un *parseur syntaxique __descndant__*,
notre choix s'est porté donc sur le framework **ANTLR4**.

## Grammaire ANTLR

Le syntax ANTLR est très simple et intuitif.
Les symboles terminaux commencent par une lettre majuscule et les variables commencent par une lettre miniscule.

Voici le fichier grammaire Antlr4.
```{bash, comment=NA}
cat grammar/AM.g4
```

## Structure du programme

Voici l'arborescence du repértoire.
```{bash, echo=FALSE, comment=NA}
tree -I 'docs|out|am2t.iml|test|grammar/.antlr|gnu|gnu_cpp|*.tex' --dirsfirst
```

La librairie antlr4 (fichier `lib/antlr-4.x.x-complete.jar`) permet de générer le paquet java **AsciiMath.antlr** à partir de notre grammaire

## Traducteur

Nous avons donc créé le paquet java **AsciiMath.tex** qui traduit en LaTeX.

La libraire antlr4 fournit une interface d'arbre syntaxique `ParseTree`, on implémente donc un *visiteur* de l'arbre qui
interprète dans chaque nœud les symboles reconnus.
Il s'agit de la classe `Visitor` qui est une sous-classe de `AMBaseVisitor` générée par antlr.

Afin de traduire les symboles reconnus, nous avons écris un *dictionnaire* en format CSV indiquant la traduction d'un symbole AsciiMath en LaTeX.
Nous avons défini une classe `Dictionary` qui sert d'une interface de lecture du fichier fournis, en l'extrayant dans un `HashMap`.

## Interface

Les classes `IO` et `Translator` servent d'interface d'utilisation du programme.
Elle permettent de traduire un fichier AsciiMath en LaTeX et de générer une image d'arbre syntaxique du texte analysé.

Nous fournissons un `Makefile` permettant de compiler le code facilement ainsi que le script `am2t`
permettant d'executer le programme.

```{bash}
./am2t --help
```
# Implémentation

## Choix du langage

Une implémentation d'un interpréteur dépend principalement de deux outils:

- **Lexer (Tokenizer):** Un programme qui reconnait les symboles terminaux dans un texte donné. Le code définit les symboles de la grammaire.
- **Parser:** Un programme qui analyse le syntaxe d'un texte donné. Le code définit les règles de la grammaire.

On parle souvent de couple *Lexer/Parser*, les couples d'analyse syntaxique les plus établis sont lex/yacc et leurs équivalents libres flex/bison.

Nous ne sommes lancé sur l'implémentation sur flex/bison, nous avons implémenté plusieurs grammaires simples comme celle d'une calculatrice.

Or, pour notre grammaire qui est relativement compliquée, nous n'avons pas obtenue les résultats attendus, nous avons donc décidé d'utiliser **ANTLR4** qui est très efficace surtout pour débugger la grammaire.

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
tree -I 'docs|out|am2t.iml|test|grammar/.antlr|*.tex' --dirsfirst
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
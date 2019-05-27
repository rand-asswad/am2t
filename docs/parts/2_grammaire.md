# Grammaire

La première étape du dévelopement d'un tel outil est de définir la grammaire AsciiMath.

Soit la grammaire $G=(T,V,S,P)$ où:

- $T$: l'ensemble de symboles terminaux *(tokens)*
- $V$: l'ensemble de variable (symboles non-terminaux)
- $S$: l'axiome de la grammaire (la variable de départ)
- $P$: l'ensemble de règles de production

## Les symboles terminaux

On groupe les symboles terminaux dans les catégories suivantes :

- **Constantes (C):** les lettres latins et grecques, les nombres, les noms des fonctions mathématiques, les symboles d'opérations mathématiques, etc.
- **Opérateurs unaires (U):** les opérateurs prenant un seul argument comme la racine carrée `sqrt`.
- **Opérateurs binaires (B):** les opérateurs prenant deux arguments comme la racine n^ème^ `root` ou une fraction.
- **Délimiteurs droits (R):** parenthèse, accolade, crochet et chevron droits.
- **Délimiteurs gauches (L):** parenthèse, accolade, crochet et chevron gauches.

## Les variables et l'axiome

Notre grammaire est définie par 3 variables:

- **Expression (e):** l'axiome de la grammaire
- Expression simple (s)
- Expression intermédiaire (i)

La grammaire peut s'écrire avec 2 variables mais elle est ambigüe.

## Les règles

- e $\rightarrow$ ie + $\varepsilon$
- i $\rightarrow$ s + s_s + s^s + s_s^s + i/i
- s $\rightarrow$ C + LeR + Us + Bss

## Notation Backus-Naur

- C ::= lettres latines | lettres grecques | nombres | etc
- U ::= sqrt | abs | floor | ceil | dot | etc
- B ::= frac | root | overset | etc
- L ::= ( | [ | { | (: | {: | <<
- R ::= ) | ] | } | :) | :} | >>
- \<s\> ::= C | L \<e\> R | U \<s\> | B \<s\> \<s\>
- \<i\> ::= \<s\> | \<s\> _ \<s\> | \<s\> ^ \<s\> | \<s\> _ \<s\> ^ \<s\> | \<i\> / \<i\>
- \<e\> ::= \<i\> \<e\> | \<i\>

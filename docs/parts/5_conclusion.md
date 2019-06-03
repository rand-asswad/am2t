# Conclusion

## Développements possibles du projet

### Wrapper pandoc

L'objectif de notre interpréteur c'est de pouvoir écrire des formules mathématiques *lisibles*
en format text et d'obtenir un bon rendu.

L'outil `pandoc` permet de convertir un fichier markdown en format LaTeX et/ou HTML.
On pourra donc préparer les documents contenant des formules mathématiques en format
*AsciiMath* pour pandoc avec un programme similaire au notre.

Il va falloir définir des délimiteurs spéciaux indicant les début/fin des formules
comme `$$` ou `\[` pour LaTeX.

### Syntaxe et grammaire

Il est intéressant d'implémenter dans notre interpréteur le syntaxe pour les vecteurs/matrices.

Par exemple `((a,b),(c,d))` pour $\begin{pmatrix}a&b\\c&d\end{pmatrix}$,
ou bien `[[a],[b]]` pour $\begin{bmatrix}a\\b\end{bmatrix}$.

## Apport personnel

Ce projet nous a permit de d'approfondir nos connaissances en analyse lexicale et syntaxique.
En effet, ce projet a été l'occasion d'implémenter un interpréteur en Flex/Bison et par la suite
decouvrir le framework ANTLR4.

De plus, l'un parmi nous a voulu implémenter un interpréteur AsciiMath en LaTeX depuis
plus qu'un an, grâce a cette matière cela a été possible sans difficulté.
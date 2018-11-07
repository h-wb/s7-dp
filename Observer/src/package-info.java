/**
 * Exercice sur le Design Pattern Observer
 * 
 * Une personne est définie par un prénom et une année de naissance
 * 
 * 
 *  On considère une femme ou un homme comme des cas particuliers d'une personne
 *  
 *  L'appli gère des listes de personnes, la seule opération disponible est la méthode "insère".
 *  
 *  L'appli gère 4 listes de personnes : 
 *  1) liste de toutes les personnes (Vector)
 *  2) liste des femmes (Vector)
 *  3) liste des personnes nées au XXème siècle (composant graphique)
 *  4) liste des femmes nées au XXème siècle (fichier disque)
 *  
 *  Dans l'appli, on peut insérer, en mode console, des éléments dans les listes (1) ou (2).
 *  La modification de (1) ou (2) entraîne une éventuelle mise à jour des 3 autres listes.
 *  
 *  Dans une extension, on considérera une 5ème liste des hommes gérée par une appli distante. 
 *  Cette liste devra aussi être mise à jour si (1) ou (2) sont modifiées.
 */
/**
 * @author Dominique
 *
 */
package exoobserver.maquette;
/**
 * Exercice sur le Design Pattern Observer
 * 
 * Une personne est d�finie par un pr�nom et une ann�e de naissance
 * 
 * 
 *  On consid�re une femme ou un homme comme des cas particuliers d'une personne
 *  
 *  L'appli g�re des listes de personnes, la seule op�ration disponible est la m�thode "ins�re".
 *  
 *  L'appli g�re 4 listes de personnes : 
 *  1) liste de toutes les personnes (Vector)
 *  2) liste des femmes (Vector)
 *  3) liste des personnes n�es au XX�me si�cle (composant graphique)
 *  4) liste des femmes n�es au XX�me si�cle (fichier disque)
 *  
 *  Dans l'appli, on peut ins�rer, en mode console, des �l�ments dans les listes (1) ou (2).
 *  La modification de (1) ou (2) entra�ne une �ventuelle mise � jour des 3 autres listes.
 *  
 *  Dans une extension, on consid�rera une 5�me liste des hommes g�r�e par une appli distante. 
 *  Cette liste devra aussi �tre mise � jour si (1) ou (2) sont modifi�es.
 */
/**
 * @author Dominique
 *
 */
package exoobserver.maquette;
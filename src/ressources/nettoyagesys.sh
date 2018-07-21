#!/bin/bash
#ce script a le but de nettoyer le system
#crée par NADIA NAATIT
#EUSI

echo "supprimer les caches des paquets périmées"
	sudo apt-get install autoclean 
echo "supprimée  tout les caches" 
	sudo apt-get clean

echo "le nottoyage a ete effectuer avec succe"

#!/bin/bash

# Compilation des fichiers .java
javac *.java

# Vérifier que la compilation a réussi
if [ $? -eq 0 ]; then
    # Si oui, exécuter l'application Java
    java BudgetManager
else
    echo "La compilation a échoué"
fi